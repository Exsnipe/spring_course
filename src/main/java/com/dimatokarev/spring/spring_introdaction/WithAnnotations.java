package com.dimatokarev.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
        context.close();
    }
}
