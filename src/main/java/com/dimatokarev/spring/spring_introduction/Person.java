package com.dimatokarev.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("personBean")

public class Person {

    private Pet pet;

    private String surName;
    @Value("${person.age}")
    private int age;

//    @Autowired

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean has been created");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
