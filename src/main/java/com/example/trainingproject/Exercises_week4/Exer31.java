package com.example.trainingproject.Exercises_week4;

import java.util.Arrays;
import java.util.List;

public class Exer31 {
    public static String whoLikesIt(String... names) {
        String finalSentence = null;
        List<String> namesList = Arrays.asList(names);
        int listSize = namesList.size();


        if (listSize == 0) {
            finalSentence = "no one likes this";
        } else if (listSize == 1) {
            finalSentence = namesList.get(0) + " likes this";
        } else if (listSize == 2) {
            finalSentence = namesList.get(0) + " and " + namesList.get(1) + " likes this";
        } else if (listSize == 3) {
            finalSentence = namesList.get(0) + ", " + namesList.get(1) + " and " + namesList.get(2) + " likes this";
        } else if (listSize > 3) {
            finalSentence = namesList.get(0) + ", " + namesList.get(1) + " and " + (listSize - 2) + " others likes this";
        }


        return finalSentence;
    }

}
