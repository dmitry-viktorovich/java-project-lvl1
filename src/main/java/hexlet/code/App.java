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
        int userChoice = sc.nextInt();

        if (userChoice == 1) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.greetingUser();
        }

        if (userChoice == 2) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.greetingUser();
            Even.getUserChoice();
        }
    }
}
