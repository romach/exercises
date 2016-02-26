package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the amount of water in kilograms: 55.5
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();
        //Enter the initial temperature: 3.5
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        //Enter the final temperature: 10.5
        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();
        //The energy needed is 1625484.0
        double energy = (finalTemperature - initialTemperature) * waterMass * 4184;
        System.out.println("The energy needed is " + energy);
    }


}
