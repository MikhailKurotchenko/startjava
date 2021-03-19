package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setNumber(int number) {
        if(number <= 0 || number > 100) {
            System.out.println("Error: must be in range (0; 100]");
            return false;
        }
        this.number = number;
        return true;
    }

    public int getNumber() {
        return number;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
