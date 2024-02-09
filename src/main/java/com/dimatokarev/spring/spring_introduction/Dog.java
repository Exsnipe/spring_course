package com.dimatokarev.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog has been created");
    }

    @Override
    public void say() {
        System.out.println("WOW-WOW");
    }

    protected void init() {
        System.out.println("Class Dog: init method");
    }

    protected void destroy() {
        System.out.println("class Dog: destroy method");
    }
}
