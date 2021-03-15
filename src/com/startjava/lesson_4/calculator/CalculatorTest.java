package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter math expression through a space: ");
            calc.setExample(scan.nextLine());
            System.out.println(calc.calculate());
            do {
                System.out.print("Want to continue computing? [yes/no]: ");
                choice = scan.nextLine();
            } while(!"yes".equals(choice) && !"no".equals(choice));
        } while(choice.equals("yes"));
    }
}
