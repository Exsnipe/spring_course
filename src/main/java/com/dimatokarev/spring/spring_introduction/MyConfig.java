package com.dimatokarev.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    public Pet myCat() {
        return new Cat();
    }

    @Bean
    public Person myPerson() {
        return new Person(myCat());
    }

}