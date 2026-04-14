package fundamentals.basics;

import java.util.Locale;
import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double radius = scanner.nextDouble();
        double area = pi * radius * radius;

        System.out.printf("Area = %.4f", area);

        scanner.close();
    }
}
