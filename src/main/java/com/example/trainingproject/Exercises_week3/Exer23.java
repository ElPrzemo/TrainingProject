package com.example.trainingproject.Exercises_week3;

public class Exer23 {
    public class Solution{
        public static String doubleChar(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <= s.length()-1; i++) {
                stringBuilder.append(s.charAt(i));
                stringBuilder.append(s.charAt(i));

            }
            return stringBuilder.toString();
        }
    }
}
