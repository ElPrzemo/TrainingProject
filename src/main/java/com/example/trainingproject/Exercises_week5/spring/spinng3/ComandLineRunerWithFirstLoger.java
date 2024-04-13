package com.example.trainingproject.Exercises_week5.spring.spinng3;

import org.springframework.boot.CommandLineRunner;

public class ComandLineRunerWithFirstLoger implements CommandLineRunner {

    private FirstLoger firstLoger;

    @Override
    public void run(String... args) throws Exception {
        firstLoger.sayHello();
    }
}
