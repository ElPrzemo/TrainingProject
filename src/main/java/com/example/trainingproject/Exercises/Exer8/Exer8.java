package com.example.trainingproject.Exercises.Exer8;

public class Exer8 {
    public static double discount(int price, int percentage) {
        double result = price - (price * percentage / 100.0);
        return Double.parseDouble(String.format("%.2f", result));
    }
}
