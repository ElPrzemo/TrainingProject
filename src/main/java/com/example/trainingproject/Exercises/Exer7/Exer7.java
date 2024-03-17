package com.example.trainingproject.Exercises.Exer7;

public class Exer7 {
    public static int countWords(String s) {
        String[] array = s.split("\\s+");
        int counter = array.length;
        return counter;
    }
}
