package fundamentals.loops;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverageCalculator {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){

            double val1 = scanner.nextDouble();
            double val2 = scanner.nextDouble();
            double val3 = scanner.nextDouble();

            double average = (val1 * 2.0 + val2 * 3.0 + val3 * 5.0)/10.0;

            System.out.printf("Average of values: %.1f%n", average);
        }

        scanner.close();
    }
}
