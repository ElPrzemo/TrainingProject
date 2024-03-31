package com.example.trainingproject.Exercises_week4;

import java.util.Scanner;

public class Exer33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");

        int userNumber = scanner.nextInt();

        for (int i = 0; i < userNumber; i++) {
            if (userNumber % 3 == 0 && userNumber % 7 == 0) {
                System.out.println("PifPaf");
            } else if (userNumber % 3 == 0) {
                System.out.println("Pif");
            } else if (userNumber % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }


    }
}
