package com.example.trainingproject.Exercises_week3;

public class Exer26 {
    public static String[] spacey(String[] array) {
        String[] newArray = new String[array.length];

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            newArray[i] = stringBuilder.toString();
        }

        return newArray;
    }
}