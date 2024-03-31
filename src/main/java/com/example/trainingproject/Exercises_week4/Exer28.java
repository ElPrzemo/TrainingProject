package com.example.trainingproject.Exercises_week4;

import static org.thymeleaf.util.StringUtils.append;

public class Exer28 {

    public class MoreThanZero {
        public static String corrections(int x) {
            if (x > 0) {
                return x + " is more than zero.";
            } else {
                return x + " is equal to or less than zero.";
            }
        }
    }
}