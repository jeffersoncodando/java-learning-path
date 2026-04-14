package fundamentals.loops;

import java.util.Locale;
import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

            if (denominator == 0){
                System.out.println("Impossible division");
            } else {
                double result = (double) numerator / denominator;
                System.out.printf("%.1f%n", result);
            }
        }

        scanner.close();
    }
}
