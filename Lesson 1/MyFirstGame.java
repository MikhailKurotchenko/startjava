public class MyFirstGame {
     public static void main(String[] args) {
        int computer = -1;
        int user = 10;
        if(computer > 0 & computer <= 100) {
            if(computer > user) {
                while(computer > user) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    user++;
                }
            } else if(computer < user) {
                while(computer < user) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                    user--;
                }
            }

            System.out.println("Вы угадали!");

        } else {
            System.out.println("Ошибка: значение computer должно быть в диапазоне (0;100]");
        }
    }
}