package liang.chapter_2.exercise_2_16;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        Enter the side: 5.5
        System.out.print("Enter the side: ");
        double sideLength = new Scanner(System.in).nextDouble();
//        The area of the hexagon is 78.5895
        double areaOfHexagon = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;
        System.out.println("The area of the hexagon is " + areaOfHexagon);
    }
}
