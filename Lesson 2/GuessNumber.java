import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        int randomNum = rand.nextInt(100) + 1;
        do {
            do {
                System.out.print(player1.getName() + " вводит число: ");
            } while(player1.setNumber(scan.nextInt()) == false); 
            if(player1.getNumber() > randomNum) {
                System.out.println("Число больше компьютера");
            } else if(player1.getNumber() < randomNum) {
                System.out.println("Число меньше компьютера");
            } else if(player1.getNumber() == randomNum) {
                break;
            }


            do {
                System.out.print(player2.getName() + " вводит число: ");
            } while(player2.setNumber(scan.nextInt()) == false);  
            if(player2.getNumber() > randomNum) {
                System.out.println("Число больше компьютера");
            } else if(player2.getNumber() < randomNum) {
                System.out.println("Число меньше компьютера");
            } else if(player2.getNumber() == randomNum) {
                break;
                } 
        } while(true);

        if(player1.getNumber() == randomNum) {
            System.out.println("Победил " + player1.getName());
        } else {
            System.out.println("Победил " + player2.getName());
        }
    }
}