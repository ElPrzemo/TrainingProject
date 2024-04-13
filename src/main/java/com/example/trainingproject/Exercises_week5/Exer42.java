package com.example.trainingproject.Exercises_week5;

public class Exer42 {
    public static String getTime(String neededPower, int minutes, int seconds, String power) {

        int neededPowerValue = Integer.parseInt(neededPower.substring(0, neededPower.length() - 1));
        int powerValue = Integer.parseInt(power.substring(0, power.length() - 1));

        double timeRatio = (double) powerValue / neededPowerValue;

        double totalSeconds = (minutes * 60 + seconds) * timeRatio;
        int roundedSeconds = (int) Math.ceil(totalSeconds);


        int cookingMinutes = roundedSeconds / 60;
        int remainingSeconds = roundedSeconds % 60;

        return String.format("%d minutes %d seconds", cookingMinutes, remainingSeconds);
    }

}
