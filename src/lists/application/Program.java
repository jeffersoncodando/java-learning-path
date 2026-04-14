package lists.application;

import lists.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employee will be registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("Employee #%d:%n", (i+1));

            System.out.print("Id: ");
            int id = scanner.nextInt();

            while (validationId(employeeList, id)){
                System.out.println("The ID you entered already exists. Please try again.");
                System.out.print("Id:");
                id = scanner.nextInt();
            }

            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            System.out.println();

            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = scanner.nextInt();

        Employee foundEmployee = employeeList.stream().filter(employee -> employee.getId() == idIncrease).findFirst().orElse(null);

            if (foundEmployee == null){
                System.out.println("This id does not exist!");
            } else {
                System.out.print("Enter the percentage: ");
                double percent = scanner.nextDouble();
                foundEmployee.increaseSalary(percent);
            }

        System.out.println();
        System.out.println("List of employees: ");

        for (Employee employee : employeeList){
            System.out.println(employee);
        }

        scanner.close();
    }

    public static Boolean validationId(List<Employee> employeeList, Integer id){
        Employee foundEmployee = employeeList.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
        return foundEmployee != null;

    }
}
