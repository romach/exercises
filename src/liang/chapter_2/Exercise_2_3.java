package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_3 {
    public static void main(String[] args) {
//        Enter a value for feet: 16.5
        System.out.print("Enter a value for feet: ");
        Scanner scanner = new Scanner(System.in);
        double feets = scanner.nextDouble();
//        16.5 feet is 5.0325 meters
        System.out.println(feets + " feet is " + feets * 0.305 + " meters");
    }
}
