package fundamentals.controlflow;

import java.util.Scanner;

public class SimplePointOfSale {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();
        int quantity = scanner.nextInt();
        double total = 0.0;

        if (code == 1) {
            total = quantity * 4.0;
        } else if (code == 2) {
            total = quantity * 4.5;
        } else if (code == 3) {
            total = quantity * 5.0;
        } else if (code == 4) {
            total = quantity * 2.0;
        } else {
            total = quantity * 1.5;
        }

        System.out.printf("Total: %.2f%n", total);

        scanner.close();
    }
}
