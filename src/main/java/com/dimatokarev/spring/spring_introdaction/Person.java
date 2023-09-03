package com.dimatokarev.spring.spring_introdaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    /*@Autowired
    @Qualifier("dog")*/
    private Pet pet;
    @Value("${person.surName}")
    private String surName;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

    /*public Person() {
        System.out.println("Person bean has been created");
    }*/

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
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
