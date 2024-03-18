package com.example.trainingproject.Exercises_week3;

public class Exer16 {

    public static int getCount(String str) {
        int vowelsCount = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
