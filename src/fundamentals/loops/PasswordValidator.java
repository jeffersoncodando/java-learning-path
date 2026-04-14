package fundamentals.loops;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int password = 2002;

        System.out.print("Enter password: ");
        int passwordAttempt = scanner.nextInt();

        while(passwordAttempt != password){
            System.out.println("Invalid password!");
            System.out.print("Type it again: ");
            passwordAttempt = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Access allowed!");

        scanner.close();
    }
}
