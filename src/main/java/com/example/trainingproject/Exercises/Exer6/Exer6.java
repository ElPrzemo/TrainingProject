package com.example.trainingproject.Exercises.Exer6;

public class Exer6 {
    public static String stuttering(String word) {
        return String.format("%s... %s... %s!", word.substring(0, 2), word.substring(0, 2), word);
    }
}
