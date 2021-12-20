package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter."
            + "\n1 - Greet"
            + "\n2 - Even"
            + "\n0 - Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = sc.nextInt();

        if (gameNumber == 1) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.greetingUser();
        }

        if (gameNumber == 2) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.greetingUser();
            Even.runEvenGame();
        }
    }
}
