package com.example.trainingproject.Exercises_week3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exer14 {

    public boolean phoneValidator(int phoneNumber) {
        boolean isPhone = false;

        Pattern pattern = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
        Matcher matcher = pattern.matcher(String.valueOf(phoneNumber));
        if (matcher.matches()) {
            isPhone = true;
        }
        return isPhone;
    }
}
