package com.example.trainingproject.Exercises_week5.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection {

    private DummyLogger dummyLogger;

    @Autowired
    public void setDummyLogger(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

}
