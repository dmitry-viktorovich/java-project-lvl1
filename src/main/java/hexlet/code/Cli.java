package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;
    public static String greetingUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");

        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static String getUserName() {
        return userName;
    }
}
