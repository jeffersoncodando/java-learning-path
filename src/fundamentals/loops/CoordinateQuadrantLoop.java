package fundamentals.loops;

import java.util.Scanner;

public class CoordinateQuadrantLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x and y coordinates: ");
        System.out.print("Enter the X coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter the Y coordinate: ");
        int y = scanner.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("First");
            } else if (x < 0 && y > 0){
                System.out.println("Second");
            } else if (x < 0 && y < 0){
                System.out.println("Third");
            } else {
                System.out.println("Fourth");
            }

            System.out.println("Enter the x and y coordinates: ");
            System.out.print("Enter the X coordinate: ");
            x = scanner.nextInt();

            System.out.print("Enter the Y coordinate: ");
            y = scanner.nextInt();
        }

        scanner.close();
    }
}
