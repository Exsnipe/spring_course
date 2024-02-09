package com.dimatokarev.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat has been created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }



    public void init() {
        System.out.println("cat: init method");
    }


    public void destroy() {
        System.out.println("cat: destroy method");
    }
}
