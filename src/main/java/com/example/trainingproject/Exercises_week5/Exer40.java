package com.example.trainingproject.Exercises_week5;

public class Exer40 {

    public class SumArray {

        public static double sum(double[] numbers) {
            double result = 0;
            if (numbers.equals(null)) {
                return 0.0;
            } else {
                for (int i = 0; i < numbers.length; i++) {
                    result += numbers[i];
                }
            }
            return result;
        }
    }
}
