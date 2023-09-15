package com.dimatokarev.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat myCat = context.getBean("cat", Cat.class);
        Cat yorCat = context.getBean("cat", Cat.class);

        System.out.println(myCat == yorCat);

        context.close();
    }
}
