package liang.chapter_2.exercise_2_20;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("us"));
        double balance = scanner.nextDouble();
        double annualInterestRateInPercents = scanner.nextDouble();
        double annual = (annualInterestRateInPercents / 100 /12) * balance;
//        The interest is 2.91667
        System.out.println("The interest is " + annual);
    }
}
