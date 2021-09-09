package com.company;

import com.company.games.GuessTheNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int isItNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            int gameNumber = scanner.nextInt();
            return gameNumber;
        } catch (InputMismatchException e) {
            System.out.println("Jedynie liczby!");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Witaj w programie 'Game'");
        int number = -1;
        do {
            while (number <= -1) {
                System.out.println("Wpisz numer gry w którą chcesz zagrać");
                System.out.println("[1] Zgadnij liczbę");
                System.out.println("[0] Exit");
                number = isItNumber();
            }
            switch (number) {
                case 0:
                    System.out.println("Thanks for playing");
                    break;
                case 1:
                    GuessTheNumbers.guessing();
                    number = -1;
                    break;
            }
        } while (number != 0);
    }
}
