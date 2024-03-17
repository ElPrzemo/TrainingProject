package com.example.trainingproject.Exercises.Exer10;

public class Exer10 {
    public static int programmers(int one, int two, int three) {
        int max = Math.max(one, Math.max(two, three));
        int min = Math.min(one, Math.min(two, three));
        return max - min;
    }
}
