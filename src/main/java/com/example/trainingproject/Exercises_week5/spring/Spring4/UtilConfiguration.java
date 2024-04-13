package com.example.trainingproject.Exercises_week5.spring.Spring4;


import jdk.jfr.Name;
import org.springframework.context.annotation.Bean;

public class UtilConfiguration {


   @Bean
   public DummyLoger dummyLoger(){
      return new DummyLoger();
   }

   @Bean
   private ListUtil listUtility(){
      return new ListUtil();
   }

   @Bean(name = "strinUtility")
   private StringUtil stringUtility(){
      return new StringUtil();
   }
}
