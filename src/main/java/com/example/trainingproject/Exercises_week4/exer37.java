package com.example.trainingproject.Exercises_week4;

public class exer37 {

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

