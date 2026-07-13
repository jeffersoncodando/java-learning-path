package ch08_generics_collections.exercise_set_students.application;

import ch08_generics_collections.exercise_set_students.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Set<Student> students = new HashSet<>();

        System.out.print("How many students for course A? ");
        int studentsCourseA = scanner.nextInt();

        for (int i = 0; i < studentsCourseA; i++){
            int code = scanner.nextInt();
            students.add(new Student(code));
        }

        System.out.print("How many students for course B? ");
        int studentsCourseB = scanner.nextInt();

        for (int i = 0; i < studentsCourseB; i++){
            int code = scanner.nextInt();
            students.add(new Student(code));
        }

        System.out.print("How many students for course C? ");
        int studentsCourseC = scanner.nextInt();

        for (int i = 0; i < studentsCourseC; i++){
            int code = scanner.nextInt();
            students.add(new Student(code));
        }

        System.out.println("Total students: " + students.size());

        scanner.close();
    }
}
