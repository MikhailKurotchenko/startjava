package com.startjava.Lesson_2.game;

import java.util.Scanner;
import java.util.Random;

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
        do {
            do {
                System.out.print(player1.getName() + " ������ �����: ");
            } while(!player1.setNumber(scan.nextInt())); 
            if(player1.getNumber() > randomNum) {
                System.out.println("����� ������ ����������");
            } else if(player1.getNumber() < randomNum) {
                System.out.println("����� ������ ����������");
            } else if(player1.getNumber() == randomNum) {
                System.out.println("������� " + player1.getName());
                break;
            }

            do {
                System.out.print(player2.getName() + " ������ �����: ");
            } while(!player2.setNumber(scan.nextInt()));  
            if(player2.getNumber() > randomNum) {
                System.out.println("����� ������ ����������");
            } else if(player2.getNumber() < randomNum) {
                System.out.println("����� ������ ����������");
            } else if(player2.getNumber() == randomNum) {
                System.out.println("������� " + player2.getName());
                break;
            }
        } while(true);
    }
}