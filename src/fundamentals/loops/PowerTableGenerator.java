package fundamentals.loops;

import java.util.Scanner;

public class PowerTableGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i < n; i++){

            int second = i * i;
            int third = i * i * i;
            System.out.printf(" %d %d %d%n", i, second, third);
        }

        scanner.close();
    }
}
