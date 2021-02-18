import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        int computerNum = rand.nextInt(100) + 1;
        do {System.out.println(computerNum);
            System.out.print("1 игрок вводит число: ");
            player1.setNumber(scan.nextInt());
            if(player1.getNumber() > computerNum && player1.getNumber() > 0 && player1.getNumber() <= 100) {
                System.out.println("Число больше компьютера");
            } else if(player1.getNumber() < computerNum && player1.getNumber() > 0 && player1.getNumber() <= 100) {
                System.out.println("Число меньше компьютера");
            }

            System.out.print("2 игрок вводит число: ");
            player2.setNumber(scan.nextInt());
            if(player2.getNumber() > computerNum && player2.getNumber() > 0 && player2.getNumber() <= 100) {
                System.out.println("Число больше компьютера");
            } else if(player2.getNumber() < computerNum && player2.getNumber() > 0 && player2.getNumber() <= 100) {
                System.out.println("Число меньше компьютера");
            } 
        } while(player1.getNumber() != computerNum && player2.getNumber() != computerNum);

        if(player1.getNumber() == computerNum) {
            System.out.println("Победил player1");
        } else {
            System.out.println("Победил player1");
        }
    }
}