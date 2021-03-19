package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first players name: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Enter the second players name: ");
        Player player2 = new Player(scan.nextLine());
        String choice;
        GuessNumber guessNumber = new GuessNumber(player1, player2);
            do {
                guessNumber.guess();
                do {
                    System.out.print("Want to continue computing? [yes/no]: ");
                    choice = scan.nextLine();
                } while(!"yes".equals(choice) && !"no".equals(choice));
            } while(choice.equals("yes"));
        }
}
