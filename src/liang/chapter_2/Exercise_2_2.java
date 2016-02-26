package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args) {
//        Enter the radius and length of a cylinder: 5.5 12
        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner scanner = new Scanner(System.in);
        double cylinderRadius = scanner.nextDouble();
        double cylinderLength = scanner.nextDouble();
//        The area is 95.0331
        double cylinderArea = cylinderRadius * cylinderRadius * Math.PI;

//        The volume is 1140.4
        double cylinderVolume = cylinderArea * cylinderLength;

        System.out.println("The area is " + cylinderArea);
        System.out.println("The volume is " + cylinderVolume);
    }
}
