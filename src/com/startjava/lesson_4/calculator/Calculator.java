package com.startjava.lesson_4.calculator;

public class Calculator {
    private String example;

    public void setExample(String example) {
        String[] signs = example.split(" ");
        int firstNum = Integer.parseInt(signs[0]);
        int secondNum = Integer.parseInt(signs[2]);
        if (firstNum < 0 || secondNum < 0) {
            System.out.println("Error: numbers must be greater than 0");
        } else {
            this.example = example;
        }
    }

    public int calculate() {
        int result = 0;
        String[] signs = example.split(" ");
        int firstNum = Integer.parseInt(signs[0]);
        int secondNum = Integer.parseInt(signs[2]);
        switch (signs[1]) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> result = Math.floorDiv(firstNum, secondNum);
            case "^" -> result = (int) Math.pow(firstNum, secondNum);
            case "%" -> result = firstNum % secondNum;
        }
        return result;
    }
}
