package com.example.trainingproject.Exercises_week5.spring.spinng3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComandLineRunerWithSecondLoger implements CommandLineRunner {
    private  SecondLoger secondLoger;

    public ComandLineRunerWithSecondLoger(SecondLoger secondLoger) {
        this.secondLoger = secondLoger;
    }

    @Override
    public void run(String... args) throws Exception {
        secondLoger.sayHello();
    }
}
