package com.dimatokarev.spring.spring_introduction;

//@Component
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
