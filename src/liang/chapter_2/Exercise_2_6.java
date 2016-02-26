package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_6 {
    public static void main(String[] args) {
        // Enter a number between 0 and 1000: 999
        System.out.print("Enter a number between 0 and 1000: ");
        int number = new Scanner(System.in).nextInt();
        // The sum of the digits is 27

        // for %10 reminder, while reminder != 0, add reminder to sum, divide number to 10 to eliminate last digit

        int sum = 0;
        int reminder = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }
}
