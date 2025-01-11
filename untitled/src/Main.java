import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    final static int ROCK = 0;
    final static int PAPER = 1;
    final static int SCISSORS = 2;

    public static void main(String[] args) {
        // 1. Prompt user with options for R/P/S
        System.out.println("Select Rock, Paper or Scissors");
        System.out.println("0=Rock, 1=Paper, 2=Scissors");

        // 2. Read user input.
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();


        // 3. Computer chooses option.
        Random rand = new Random();
        int compNum = rand.nextInt(3);
        System.out.println("You chose " + num + "Computer chose" + compNum);
        // 4. Figure out who wins. && display who wins.

        if (num == compNum) {
            System.out.println("TIE!");
            return;
        }
        if (num == ROCK) {
            if (compNum == SCISSORS) {
                System.out.println("U Win!");
            } else {
                System.out.println("LOSER!");
            }
        }

        if (num == SCISSORS) {
            if (compNum == PAPER) {
                System.out.println("U Win!");
            } else {
                System.out.println("LOSER!");
            }
        }

        if (num == PAPER) {
            if (compNum == ROCK) {
                System.out.println("U Win!");
            } else {
                System.out.println("LOSER!");
            }
        }

    }
}
