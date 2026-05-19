package ch04_inheritance_polymorphism.product_tags.application;

import ch04_inheritance_polymorphism.product_tags.entities.ImportedProduct;
import ch04_inheritance_polymorphism.product_tags.entities.Product;
import ch04_inheritance_polymorphism.product_tags.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    private static final DateTimeFormatter INPUT_DATE_FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char tag = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Price: ");
            double productPrice = scanner.nextDouble();

            if (tag == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();

                productList.add(new ImportedProduct(productName, productPrice, customsFee));

            } else if (tag == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(scanner.next(), INPUT_DATE_FMT);

                productList.add(new UsedProduct(productName, productPrice, manufactureDate));
            } else {
                productList.add(new Product(productName, productPrice));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product products : productList){
            System.out.println(products.priceTag());
        }

        scanner.close();
    }
}
