package fundamentals.loops;

import java.util.Scanner;

public class FuelPreferenceTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int alcoholCount = 0;
        int gasolineCount = 0;
        int dieselCount = 0;

        System.out.print("Enter the type of fuel used: ");
        int fuelTypeCode = scanner.nextInt();

        while (fuelTypeCode != 4){
            if (fuelTypeCode == 1){
                alcoholCount++;
            } else if (fuelTypeCode == 2){
                gasolineCount++;
            } else if (fuelTypeCode == 3){
                dieselCount++;
            }

            System.out.print("Enter the type of fuel used: ");
            fuelTypeCode = scanner.nextInt();
        }

        System.out.printf("THANK YOU! %nAlcohol: %s%nGasoline: %s%nDiesel: %s%n", alcoholCount, gasolineCount, dieselCount);

        scanner.close();
    }
}
