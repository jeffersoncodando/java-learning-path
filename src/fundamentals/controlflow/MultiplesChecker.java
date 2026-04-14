package fundamentals.controlflow;

import java.util.Scanner;

public class MultiplesChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("Are Multiples");
        } else{
            System.out.println("Are not Multiples");
        }

        scanner.close();
    }
}
