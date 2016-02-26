package liang.chapter_2;

import java.util.Scanner;

//(Physics: finding runway length) Given an airplane’s acceleration a and take-off
//        speed v, you can compute the minimum runway length needed for an airplane to
//        take off using the following formula:
public class Exercise_2_12 {
    public static void main(String[] args) {
        //Enter speed and acceleration: 60 3.5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();
        //The minimum runway length for this airplane is 514.286
        double runwayLength = Math.pow(speed, 2) / (2 * acceleration);
        System.out.print("The minimum runway length for this airplane is " + runwayLength);
    }
}
