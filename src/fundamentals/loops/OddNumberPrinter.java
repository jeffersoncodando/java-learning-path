package fundamentals.loops;

import java.util.Scanner;

public class OddNumberPrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
