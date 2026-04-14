package arrays.student.application;

import arrays.student.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name: ");
        student.name = scanner.nextLine();

        System.out.println("Enter first grade: ");
        student.grade1 = scanner.nextDouble();

        System.out.println("Enter second grade: ");
        student.grade2 = scanner.nextDouble();

        System.out.println("Enter third grade: ");
        student.grade3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else{
            System.out.println("PASS");
        }

        scanner.close();
    }
}
