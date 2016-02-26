package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_9 {
    public static void main(String[] args) {
        //Enter v0, v1, and t: 5.5 50.9 4.5
        System.out.print("Enter v0, v1, and t: ");
        Scanner scanner = new Scanner(System.in);
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();
        //The average acceleration is 10.0889
        double averageAcceleration = (v1 - v0) / t;
        System.out.println("The average acceleration is " + averageAcceleration);

    }
}
