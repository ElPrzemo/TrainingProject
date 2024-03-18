package com.example.trainingproject.Exercises_week3;

public class Exer13 {

    static int silniaRekurencja(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * silniaRekurencja(x - 1);
        }
    }


}
