package com.example.trainingproject.Exercises_week4;

public class Exer34 {

    public static long fibonacci(long userNumber) {
        if (userNumber <= 1) {
            return userNumber;
        }
        long x = 0;
        long y = 1;
        long result = 0;

        for (int i = 2; i <= userNumber; i++) {
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }
}
