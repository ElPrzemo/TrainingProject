package com.example.trainingproject.Exercises.Exer1;

public class Exer1 {
    public static int countTrue(boolean[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                counter++;
            }
        }
        return counter;
    }
}

