package com.dimatokarev.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());

        context.close();
    }
}
