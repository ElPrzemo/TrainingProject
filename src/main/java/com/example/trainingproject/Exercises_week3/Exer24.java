package com.example.trainingproject.Exercises_week3;

public class Exer24 {
    public static String seriesSum(int n) {
        double result = 0.0;

        for (int i = 0; i < n; i++) {
            result += 1.0 / (1 + i * 3.0);
        }

        return String.format("%.2f", result);
    }
}

