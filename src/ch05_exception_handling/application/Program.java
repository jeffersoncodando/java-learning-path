package ch05_exception_handling.application;

import ch05_exception_handling.model.entities.Account;
import ch05_exception_handling.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = scanner.nextDouble();

        try{
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch(DomainException exception){
            System.out.println("Withdraw error: " + exception.getMessage());
        }
        catch(RuntimeException exception){
            System.out.println("Unexpected error");
        }
        scanner.close();
    }
}
