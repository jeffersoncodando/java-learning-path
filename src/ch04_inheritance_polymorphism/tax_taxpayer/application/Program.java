package ch04_inheritance_polymorphism.tax_taxpayer.application;

import ch04_inheritance_polymorphism.tax_taxpayer.entities.Company;
import ch04_inheritance_polymorphism.tax_taxpayer.entities.Individual;
import ch04_inheritance_polymorphism.tax_taxpayer.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> payerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = scanner.nextDouble();
            if (type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                payerList.add(new Individual(name, annualIncome, healthExpenditures));
            } else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                payerList.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer taxPayer : payerList){
            System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());
        }

        double sum = 0.0;
        for (TaxPayer taxPayer : payerList){
            sum += taxPayer.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        scanner.close();
    }
}
