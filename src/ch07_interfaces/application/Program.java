package ch07_interfaces.application;

import ch07_interfaces.model.entities.Contract;
import ch07_interfaces.model.entities.Installment;
import ch07_interfaces.model.services.ContractService;
import ch07_interfaces.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Date (dd/mm/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);
        System.out.print("Enter the contract value: ");
        double totalValue = scanner.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter the number of installments: ");
        int installmentsNumber = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installmentsNumber);
        System.out.println();
        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        scanner.close();
    }
}
