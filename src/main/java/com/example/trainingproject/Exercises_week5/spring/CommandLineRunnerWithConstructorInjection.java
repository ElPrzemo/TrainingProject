package com.example.trainingproject.Exercises_week5.spring;

import org.springframework.stereotype.Component;

public class CommandLineRunnerWithConstructorInjection {

    private  DummyLogger dummyLogger;

    public CommandLineRunnerWithConstructorInjection(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
}
