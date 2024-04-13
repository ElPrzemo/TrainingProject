package com.example.trainingproject.Exercises_week5.spring.Spring5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WelcomeMessageLogger implements CommandLineRunner {

    private final String text;
    private final Boolean shouldLog;


    public WelcomeMessageLogger(@Value("${com.example.trainingproject.welcome.text.value:none}") final String text,
                                @Value("${com.example.trainingproject.welcome.text.enabled}") final Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

    @Override
    public void run(final String... args) throws Exception {
        if (shouldLog) {
            log.info(text);
        }
    }
}