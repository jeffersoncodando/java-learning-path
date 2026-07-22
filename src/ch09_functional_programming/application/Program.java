package ch09_functional_programming.application;

import ch09_functional_programming.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            List<Employee> employees = new ArrayList<>();

            String line = bufferedReader.readLine();
            while(line != null){
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.printf("Email of people whose salary is more than %.2f: %n", salary);
            emails.forEach(System.out::println);

            double sumSalary = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sumSalary);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
