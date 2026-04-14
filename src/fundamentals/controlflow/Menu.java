package fundamentals.controlflow;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.println("1- Hot Dog");
        System.out.println("2- Cheeseburger");
        System.out.println("3- Bacon Cheeseburger");
        System.out.println("4- Toast");
        System.out.println("5- Soda");
        System.out.println();

        System.out.print("Enter item code: ");
        int code = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double price = 0.0;
        String product = "";

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

        double total = price * quantity;

        if (price > 0){
            System.out.println(code + ", " + product);
            System.out.printf("Price: U$ %.2f", total);
        }



        scanner.close();
    }
}
