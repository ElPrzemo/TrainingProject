package com.example.trainingproject.Exercises_week5.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger implements CommandLineRunner {
    @Override
    public void run(final String... args) throws Exception {
        log.info("Hello from zadanie1");
    }
}