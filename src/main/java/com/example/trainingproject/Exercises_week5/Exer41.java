package com.example.trainingproject.Exercises_week5;

import java.util.ArrayList;
import java.util.List;

public class Exer41 {
    public static String removeExclamationMarks(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != '!') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
