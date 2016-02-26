package liang.chapter_2.exercise_2_15;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter x1 and y1: 1.5 -3.4
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        //Enter x2 and y2: 4 5
        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        //The distance between the two points is 8.764131445842194
        double distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        System.out.println("The distance between the two points is " + distance);
    }
}
