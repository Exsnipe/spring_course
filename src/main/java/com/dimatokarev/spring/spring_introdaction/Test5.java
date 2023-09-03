package com.dimatokarev.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("myCat", Cat.class);
        cat.say();

        context.close();
    }
}
