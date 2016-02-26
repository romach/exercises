package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_5 {
    public static void main(String[] args) {
        //Enter the subtotal and a gratuity rate: 10 15
        System.out.print("Enter the subtotal and a gratuity rate: ");
        Scanner scanner = new Scanner(System.in);
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();
        //The gratuity is $1.5 and total is $11.5
        double gratuity = gratuityRate / 100 * subtotal;
        System.out.println("The gratuity is " + gratuity  + " and total is " + (gratuity + subtotal));

    }
}
