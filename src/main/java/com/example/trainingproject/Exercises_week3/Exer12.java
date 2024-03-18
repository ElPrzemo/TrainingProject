package com.example.trainingproject.Exercises_week3;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę zagramy w FizzBuzz");

        int userNumber = scanner.nextInt();

        if ((userNumber % 3) == 0 && (userNumber % 7) == 0) {
            System.out.println("FizzBuzz");
        } else if ((userNumber % 3) == 0) {
            System.out.println("Fizz");
        } else if ((userNumber % 7) == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(userNumber);
        }
    }
}

