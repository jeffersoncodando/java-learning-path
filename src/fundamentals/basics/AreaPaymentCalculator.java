package fundamentals.basics;

import java.util.Locale;
import java.util.Scanner;

public class AreaPaymentCalculator {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double pricePerSquareMeter = scanner.nextDouble();

        double area = width * length;
        double price = area * pricePerSquareMeter;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRICE = %.2f%n", price);

        scanner.close();
    }
}
