package com.example.trainingproject.Exercises_week4;

public class Exer35 {


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
    private long fibonacciRecursive(long userNumber) {
        if (userNumber <= 1) {
            return userNumber;
        } else {
            return fibonacciRecursive(userNumber - 1) + fibonacciRecursive(userNumber - 2);
        }
    }


    public int silnia(int userNumber) {
        int result = 1;

        for (int i = 1; i <= userNumber; i++) {
            result *= i;
        }
        return result;
    }


    public static int silniaRecursive(int userNumber) {
        if (userNumber <= 1) {
            return 1;
        } else {
            return userNumber * silniaRecursive(userNumber - 1);
        }
    }
}