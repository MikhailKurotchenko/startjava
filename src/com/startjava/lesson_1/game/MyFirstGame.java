package com.startjava.lesson_1.game;

public class MyFirstGame {
     public static void main(String[] args) {
        int computerNum = 8;
        int userNum = 10;
        if(computerNum > 0 & computerNum <= 100) {
            while(computerNum > userNum) {
                System.out.println("Число меньше компьютера");
                userNum++;
            }
            while(computerNum < userNum) {
                    System.out.println("Число больше компьютера");
                    userNum--;
            }
            System.out.println("Угадали!");
        } else {
            System.out.println("Ошибка: число должно быть в диапазоне (0; 100]");
        }
    }
}