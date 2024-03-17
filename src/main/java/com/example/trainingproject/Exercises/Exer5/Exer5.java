package com.example.trainingproject.Exercises.Exer5;

public class Exer5 {
    public static String nameShuffle(String s) {
        String[] nameParts = s.split(" ");
        return nameParts[1] + " " + nameParts[0];
    }

}
