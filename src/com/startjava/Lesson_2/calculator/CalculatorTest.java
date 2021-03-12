package com.startjava.Lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in, "utf-8");
        String choice = "yes";
        do {
            System.out.print("Enter the first number: ");
            calc.setFirstNum(scan.nextInt());

            System.out.print("Enter the second number: ");
            calc.setSecondNum(scan.nextInt());

            scan.nextLine();
            System.out.print("Enter a math operation sign: ");
            calc.setOperation(scan.nextLine());
            System.out.println(calc.calculate());

            do {
                System.out.print("Want to continue computing? [yes/no]: ");
                choice = scan.nextLine();
            } while(!"yes".equals(choice) && !"no".equals(choice));
        } while(choice.equals("yes"));
    }
}
