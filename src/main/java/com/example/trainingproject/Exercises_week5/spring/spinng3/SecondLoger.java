package com.example.trainingproject.Exercises_week5.spring.spinng3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SecondLoger implements DummyLoger{

    @Override
    public void sayHello() {
      log.info("Say Hello");
    }
}
