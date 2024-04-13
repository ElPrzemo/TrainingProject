package com.example.trainingproject.Exercises_week5;


import java.util.HashMap;
import java.util.Map;

public class Exer39 {

    public static boolean validateWord(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : word.toLowerCase().toCharArray()) {
            int count = charCountMap.getOrDefault(ch, 0);
            charCountMap.put(ch, count + 1);
        }


        int expectedCount = charCountMap.values().iterator().next();
        for (int count : charCountMap.values()) {
            if (count != expectedCount && count != 1) {
                return false;
            }
        }

        return true;
    }
}