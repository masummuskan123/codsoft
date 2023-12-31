package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int result, guess;

        // maximum value is 100
        final int MAX = 100;
        Scanner x= new Scanner(System.in);

        // generating random no.
        Random rand = new Random();

        boolean correct = false;

        // correct result
        result = rand.nextInt(MAX) + 1;

        // loop until the guess_no is correct
        while (!correct) {

            System.out.println(
                    "Guess a number between 1 and 100: ");

            // guess value
            guess = x.nextInt();

            // if guess is greater than actual
            if (guess > result) {
                System.out.println("Too high, try again");
            }

            // if guess is less than actual
            else if (guess < result) {
                System.out.println("Too low, try again");
            }

            // guess is equal to actual value
            else {

                System.out.println(
                        "Yes, you guessed the number.");

                correct = true;
            }
        }
        System.exit(0);
    }
}


