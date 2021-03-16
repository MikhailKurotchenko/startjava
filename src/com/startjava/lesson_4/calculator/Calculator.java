package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private String operation;

    public void setMathExpression(String mathExpression) {
        String[] signs = mathExpression.split(" ");
        int firstNum = Integer.parseInt(signs[0]);
        int secondNum = Integer.parseInt(signs[2]);
        String operation = signs[1];
        if (firstNum < 0 || secondNum < 0) {
            System.out.println("Error: numbers must be greater than 0");
        } else {
            this.firstNum = firstNum;
            this.secondNum = secondNum;
            this.operation = operation;
        }
    }

    public int calculate() {
        int result = 0;
        switch (operation) {
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
