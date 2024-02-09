package com.dimatokarev.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Pet cat = context.getBean("catBean", Pet.class);

        /*Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());*/

        context.close();
    }
}
