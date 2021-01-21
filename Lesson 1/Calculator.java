public class Calculator {
    public static void main(String[] args) {
        int firstNumb = 2;
        char symbol = '^';
        int secondNumb = 6;
        int resultForRank = 1;
        if(firstNumb >= 0 & secondNumb >= 0) {
            if(symbol == '+') {
                System.out.println(firstNumb + secondNumb);
            } else if(symbol == '-') {
                System.out.println(firstNumb - secondNumb);
            } else if(symbol == '*') {
                System.out.println(firstNumb * secondNumb);
            } else if(symbol == '/') {
                System.out.println(firstNumb / secondNumb);
            } else if(symbol == '^') {
                for(int i = 1; i <= secondNumb; i++) {
                    resultForRank = resultForRank * firstNumb;
                }
                System.out.println(resultForRank);
            } else if(symbol == '%') {
                System.out.println(firstNumb % secondNumb);
            }
        }    
    }
}