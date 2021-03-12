package com.startjava.Lesson_2.calculator;

public class Calculator {
    private int firstNum;
    private String operation;
    private int secondNum;

    void setFirstNum(int firstNum) {
        if(firstNum < 0) {
            System.out.print("Error: the number must not be less than zero"); 
        } else {
            this.firstNum = firstNum;
        }
    }

    void setSecondNum(int secondNum) {
        if(secondNum < 0) {
            System.out.print("Error: the number must not be less than zero"); 
        } else {
            this.secondNum = secondNum;
        }
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int calculate() {
        int result = 0;
        switch(operation) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "^":
                result = 1;
                for(int i = 1; i <= secondNum; i++) {
                    result *= firstNum;
                }
                break;
            case "%":
                result = firstNum % secondNum;
                break;
        }
        return result;
    }
}    