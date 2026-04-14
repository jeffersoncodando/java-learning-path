package fundamentals.basics;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        int id = scanner.nextInt();
        double hoursWorked = scanner.nextDouble();
        double hourlyRate = scanner.nextDouble();
        double salary = hoursWorked * hourlyRate;

        System.out.println("NUMBER = "+ id);
        System.out.printf("SALARY = U$ %.2f", salary);

        scanner.close();
    }
}
