public class Calculator {
    public static void main(String[] args) {
        int firstNumb = 3;
        char symbol = '^';
        int secondNumb = 6;
        if(firstNumb >= 0 && secondNumb >= 0) {
            if(symbol == '+') {
                System.out.println(firstNumb + secondNumb);
            } else if(symbol == '-') {
                System.out.println(firstNumb - secondNumb);
            } else if(symbol == '*') {
                System.out.println(firstNumb * secondNumb);
            } else if(symbol == '/') {
                System.out.println(firstNumb / secondNumb);
            } else if(symbol == '^') {
                int result = 1;
                for(int i = 1; i <= secondNumb; i++) {
                    result *= firstNumb;
                }
                System.out.println(result);
            } else if(symbol == '%') {
                System.out.println(firstNumb % secondNumb);
            }
        } else {
            System.out.println("Ошибка: введены отрицательные числа");
        }   
    }
}