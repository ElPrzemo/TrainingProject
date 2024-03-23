package com.example.trainingproject.Exercises_week3;

public class Exer22 {
    public static String stringy(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<=size; i++){
            if ((i%2)!=0){
               stringBuilder.append("1");
            }else{
                stringBuilder.append("0");
            }
        }

    return stringBuilder.toString();}
}
