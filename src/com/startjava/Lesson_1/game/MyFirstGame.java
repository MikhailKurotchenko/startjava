package com.startjava.Lesson_1.game;

public class MyFirstGame {
     public static void main(String[] args) {
        int computerNum = 8;
        int userNum = 10;
        if(computerNum > 0 & computerNum <= 100) {
            while(computerNum > userNum) {
                System.out.println("Ââåäåííîå âàìè ÷èñëî ìåíüøå òîãî, ÷òî çàãàäàë êîìïüþòåð");
                userNum++;
            }
            while(computerNum < userNum) {
                    System.out.println("Ââåäåííîå âàìè ÷èñëî áîëüøå òîãî, ÷òî çàãàäàë êîìïüþòåð");
                    userNum--;
            }
            System.out.println("Âû óãàäàëè!");
        } else {
            System.out.println("Îøèáêà: çíà÷åíèå computerNum äîëæíî áûòü â äèàïàçîíå (0;100]");
        }
    }
}