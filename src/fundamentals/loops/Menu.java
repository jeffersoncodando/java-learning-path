package fundamentals.loops;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double price = 0.0;
        String product = "";
        int code = 1;

        while (code != 0){
            System.out.println("Enter item code (Code 0 to exit): ");
            code = scanner.nextInt();
            if (code == 0){
                break;
            }
            switch (code){
                case 1:
                    product = "Hot Dog";
                    price = 4.0;
                    break;
                case 2:
                    product = "Cheeseburger";
                    price = 4.50;
                    break;
                case 3:
                    product = "Bacon Cheeseburger";
                    price = 5.0;
                    break;
                case 4:
                    product = "Toast";
                    price = 2.0;
                    break;
                case 5:
                    product = "Soda";
                    price = 1.50;
                    break;
                default:
                    System.out.println("Invalid code!");
                    break;
            }

            if (price > 0.0){
                System.out.println(product);
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                total += price * quantity;

                System.out.printf("Subtotal: U$ %.2f%n", total);
            }
            price = 0.0;
        }

        System.out.printf("Total: U$ %.2f%n", total);

        scanner.close();
    }
}
