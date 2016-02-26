package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter weight in pounds: 95.5
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;
        //Enter height in inches: 50
        System.out.print("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();
        double heightInMeters = heightInInches * 0.0254;
        //BMI is 26.8573
        double bodyMassIndex = weightInKilograms / Math.pow(heightInMeters, 2);
        System.out.println("BMI is " + bodyMassIndex);
    }
}
