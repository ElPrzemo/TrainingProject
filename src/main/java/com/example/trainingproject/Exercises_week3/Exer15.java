package com.example.trainingproject.Exercises_week3;

public class Exer15 {
    public static int equal(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        }
        return 0;
    }
}
