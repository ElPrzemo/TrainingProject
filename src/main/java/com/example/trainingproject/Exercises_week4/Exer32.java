package com.example.trainingproject.Exercises_week4;

import java.util.Scanner;

public class Exer32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnicę okręgu: ");

        float r = scanner.nextFloat();

        float perimeter = (float) (2* (Math.PI * r));

    }
}
