package liang.chapter_2.exercise_2_23;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("us"));
//        Enter the driving distance: 900.5
        System.out.print("Enter the driving distance: ");
        double  distance = scanner.nextDouble();
//        Enter miles per gallon: 25.5
        System.out.print("Enter miles per gallon: ");
        double  milesPerGallon = scanner.nextDouble();
//        Enter price per gallon: 3.55
        System.out.print("Enter price per gallon: ");
        double  pricePerGallon = scanner.nextDouble();
//        The cost of driving is $125.36
        double gallons = distance / milesPerGallon;
        double costOfDriving = gallons * pricePerGallon;
        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
