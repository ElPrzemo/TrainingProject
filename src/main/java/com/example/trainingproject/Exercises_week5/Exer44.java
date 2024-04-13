package com.example.trainingproject.Exercises_week5;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Exer44 {



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


            String result = String.valueOf(n);


            if (result.equals(String.valueOf(n))) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }

            scanner.close();
        }
    }