import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        String choice = "yes";
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.guess();
            do {
                System.out.print("Want to continue computing? [yes/no]: ");
                choice = scan.nextLine();
            } while(!"yes".equals(choice) && !"no".equals(choice));
        } while(choice.equals("yes"));
    }
}