package arrays.currency.application;

import arrays.currency.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarAmount = scanner.nextDouble();

        double totalInReais = CurrencyConverter.dollarToReal(dollarPrice, dollarAmount);
        System.out.printf("Amount to be paid in reais = %.2f", totalInReais);
    }
}
