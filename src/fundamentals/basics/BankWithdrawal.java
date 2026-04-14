package fundamentals.basics;

import java.util.Locale;
import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        double balance = scanner.nextDouble();

        if (balance <= 0){
            System.out.println("Negative balance!");
        } else{
            System.out.print("Enter the first withdrawal: ");
            balance -= scanner.nextDouble();

            System.out.print("Enter the second withdrawal: ");
            balance -= scanner.nextDouble();
        }

        System.out.println();
        System.out.printf("Current balance: U$ %.2f", balance);

        scanner.close();
    }
}
