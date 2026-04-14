package fundamentals.basics;

import java.util.Locale;
import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int minutes = scanner.nextInt();
        double billAmount = 50.0;

        if (minutes > 100){
            billAmount += (minutes - 100) * 2.0;
        }

        System.out.printf("Total bill = U$%.2f", billAmount);

        scanner.close();
    }
}
