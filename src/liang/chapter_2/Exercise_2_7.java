package liang.chapter_2;

//(Find the number of years) Write a program that prompts the user to enter the
//        minutes (e.g., 1 billion), and displays the number of years and days for the min-
//        utes. For simplicity, assume a year has  365 days. Here is a sample run:

import java.util.Scanner;

public class Exercise_2_7 {
    public static void main(String[] args) {
        // Enter the number of minutes: 1000000000
        System.out.print("Enter the number of minutes: ");
        int minutes = new Scanner(System.in).nextInt();

        int totalDays = minutes / 60 / 24;
        int totalYears = totalDays / 365;
        int days = totalDays % 365;
        // 1000000000 minutes is approximately 1902 years and 214 days
        System.out.println(minutes + " minutes is approximately " + totalYears + " years and " + days + " days");
    }
}