package com.example.trainingproject.Exercises_week4;

public class Exer29 {
    public static long breakChocolate(long n, long m) {
        long numberOfSplits = 0;

        if (n == 0 || m == 0) {
            numberOfSplits = 0;
        } else {
            numberOfSplits = n * m - 1;
        }
        return numberOfSplits;
    }
}
