package com.example.trainingproject.Exercises_week5.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithFieldInjection {

    @Autowired
    private DummyLogger dummyLogger;



}
