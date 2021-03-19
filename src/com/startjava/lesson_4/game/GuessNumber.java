package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        int randomNum = rand.nextInt(100) + 1;
        System.out.println("You have 10 tries");
        System.out.println(randomNum);
        for(int i = 0; i < player1.getNumbers().length; i++) {
            do {
                System.out.print(player1.getName() + " enters a number: ");
            } while (!player1.setNumber(scan.nextInt()));
            player1.getNumbers()[i] = player1.getNumber();
            if (player1.getNumber() > randomNum) {
                if(i == player1.getNumbers().length - 1) {
                    System.out.println("Number bigger than computerNum");
                    System.out.println(player1.getName() + " has run out of attempts");
                } else {
                    System.out.println("Number bigger than computerNum");
                }
            } else if (player1.getNumber() < randomNum) {
                if(i == player1.getNumbers().length - 1) {
                    System.out.println("Number smaller than computerNum");
                    System.out.println(player1.getName() + " has run out of attempts");
                } else {
                    System.out.println("Number smaller than computerNum");
                }
            } else if (player1.getNumber() == randomNum) {
                System.out.println(player1.getName() + " guesses the number with " + (i + 1) + " tries");
                System.out.println(player1.getName() + " " + Arrays.toString(Arrays.copyOf(player1.getNumbers(), (i + 1))));
                System.out.println(player2.getName() + " " + Arrays.toString(Arrays.copyOf(player2.getNumbers(), i)));
                Arrays.fill(player1.getNumbers(), 0, i + 1, 0);
                Arrays.fill(player2.getNumbers(), 0, i + 1, 0);
                break;
            }

            do {
                System.out.print(player2.getName() + " enters a number: ");
            } while (!player2.setNumber(scan.nextInt()));
            player2.getNumbers()[i] = player2.getNumber();
            if (player2.getNumber() > randomNum) {
                if(i == player2.getNumbers().length - 1) {
                    System.out.println("Number bigger than computerNum");
                    System.out.println(player2.getName() + " has run out of attempts");
                    System.out.println(player1.getName() + " " + Arrays.toString(player1.getNumbers()));
                    System.out.println(player2.getName() + " " + Arrays.toString(player2.getNumbers()));
                    Arrays.fill(player1.getNumbers(), 0, (i + 1), 0);
                    Arrays.fill(player2.getNumbers(), 0, (i + 1), 0);
                } else {
                    System.out.println("Number bigger than computerNum");
                }
            } else if (player2.getNumber() < randomNum) {
                if(i == player2.getNumbers().length - 1) {
                    System.out.println("Number smaller than computerNum");
                    System.out.println(player2.getName() + " has run out of attempts");
                    System.out.println(player1.getName() + " " + Arrays.toString(player1.getNumbers()));
                    System.out.println(player2.getName() + " " + Arrays.toString(player2.getNumbers()));
                    Arrays.fill(player1.getNumbers(), 0, (i + 1), 0);
                    Arrays.fill(player2.getNumbers(), 0, (i + 1), 0);
                } else {
                    System.out.println("Number smaller than computerNum");
                }
            } else if (player2.getNumber() == randomNum) {
                System.out.println(player2.getName() + " guesses the number with " + (i + 1) + " tries");
                System.out.println(player1.getName() + " " + Arrays.toString(Arrays.copyOf(player1.getNumbers(), (i + 1))));
                System.out.println(player2.getName() + " " + Arrays.toString(Arrays.copyOf(player2.getNumbers(), (i + 1))));
                Arrays.fill(player1.getNumbers(), 0, i + 1, 0);
                Arrays.fill(player2.getNumbers(), 0, i + 1, 0);
                break;
            }
        }
    }
}
