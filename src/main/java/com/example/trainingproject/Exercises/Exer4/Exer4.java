package com.example.trainingproject.Exercises.Exer4;

public class Exer4 {

    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) {
            return false;
        }
        for (int num : arr) {
            if (num >= n) {
                return true;
            }
        }
        return false;
    }
}

