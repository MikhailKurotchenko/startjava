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
        switch(operation) {
            case "+":
                System.out.println(firstNum + secondNum);
                this.operation = operation;
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                this.operation = operation;
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                this.operation = operation;
                break;
            case "/":
                System.out.println(firstNum / secondNum);
                this.operation = operation;
                break;
            case "^":
                int result = 1;
                for(int i = 1; i <= secondNum; i++) {
                    result *= firstNum;
                }
                System.out.println(result);
                this.operation = operation;
                break;
            case "%":
                System.out.println(firstNum % secondNum);
                this.operation = operation;
                break;
        }
    }
}    