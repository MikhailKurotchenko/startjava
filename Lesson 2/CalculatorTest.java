import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        Scanner scan = new Scanner(System.in, "utf-8");
        String choice = "yes";
        do {
            System.out.print("Enter the first number: ");
            calculate.setFirstNum(scan.nextInt());

            System.out.print("Enter the second number: ");
            calculate.setSecondNum(scan.nextInt());

            scan.nextLine();
            System.out.print("Enter a math operation sign: ");
            calculate.setOperation(scan.nextLine());
            System.out.println(calculate.calculations());

            do {
                System.out.print("Want to continue computing? [yes/no]: ");
                choice = scan.nextLine();
            } while(!"yes".equals(choice) && !"no".equals(choice));
        } while(choice.equals("yes"));
    }
}
