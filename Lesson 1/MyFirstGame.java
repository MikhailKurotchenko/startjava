public class MyFirstGame {
     public static void main(String[] args) {
        int computerNum = -1;
        int userNum = 10;
        if(computerNum > 0 & computerNum <= 100) {
            if(computerNum > userNum) {
                while(computerNum > userNum) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    userNum++;
                }
            } else if(computerNum < userNum) {
                while(computerNum < userNum) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                    userNum--;
                }
            }

            System.out.println("Вы угадали!");

        } else {
            System.out.println("Ошибка: значение computerNum должно быть в диапазоне (0;100]");
        }
    }
}