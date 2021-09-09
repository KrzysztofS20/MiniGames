package com.company.games;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumbers {


    private static int settings() {
        System.out.println("Welcome to the game Guess The Number");
        System.out.println("Enter the range of the number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void guessing() {
        int number = settings();
        Random random = new Random();
        int numberToGuess = random.nextInt(number);
        boolean guessingToken = false;
        int counterOfTrying = 0;

        while (!guessingToken) {
            System.out.println("Enter a guessable number between 0 and " + number);
            int guessingNumber = isItNumber();
            if (guessingNumber >= 0) {

                if (guessingNumber > numberToGuess) {
                    System.out.println("The number is lower");
                    counterOfTrying++;
                }
                if (guessingNumber < numberToGuess) {
                    System.out.println("The number is higher");
                    counterOfTrying++;
                }
                if (guessingNumber == numberToGuess) {
                    counterOfTrying++;
                    System.out.println("Congratulation!!! You won in " + counterOfTrying + " tries!!");
                    guessingToken = true;
                }
            }
        }
    }

    public static int isItNumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Jedynie liczby!");
        }
        return -1;
    }

}
