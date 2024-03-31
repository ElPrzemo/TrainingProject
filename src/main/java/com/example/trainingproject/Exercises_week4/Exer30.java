package com.example.trainingproject.Exercises_week4;


import org.apache.logging.log4j.util.Chars;

public class Exer30 {

    public static String switcheroo(String x) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : x.toCharArray()) {
            if (ch == 'a') {
                stringBuilder.append('b');
            } else if (ch == 'b') {
                stringBuilder.append('a');
            } else {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}
