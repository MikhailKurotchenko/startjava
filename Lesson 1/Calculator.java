public class Calculator {
    public static void main(String[] args) {
        int firstNum = 3;
        char operation = '^';
        int secondNum = 6;

        if(firstNum >= 0 && secondNum >= 0) {
            if(operation == '+') {
                System.out.println(firstNum + secondNum);
            } else if(operation == '-') {
                System.out.println(firstNum - secondNum);
            } else if(operation == '*') {
                System.out.println(firstNum * secondNum);
            } else if(operation == '/') {
                System.out.println(firstNum / secondNum);
            } else if(operation == '^') {
                int result = 1;
                for(int i = 1; i <= secondNum; i++) {
                    result *= firstNum;
                }
                System.out.println(result);
            } else if(operation == '%') {
                System.out.println(firstNum % secondNum);
            }
        } else {
            System.out.println("Ошибка: оба числа должны быть положительными");
        }
    }
}