package fundamentals.controlflow;

import java.util.Scanner;

public class GameDurationCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int startTime = scanner.nextInt();
        int endTime = scanner.nextInt();
        int duration = 0;

        if (startTime < endTime){
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        System.out.printf("The game lasted %d hours", duration);

        scanner.close();
    }
}
