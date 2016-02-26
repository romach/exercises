package liang.chapter_2.exercise_2_21;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("us"));
//        Enter investment amount: 1000.56
        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
//        Enter annual interest rate in percentage: 4.25
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRateInPercentage = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRateInPercentage / 100 / 12;
//        Enter number of years: 1
        System.out.print("Enter number of years: ");
        double numberOfYears = scanner.nextDouble();
//        Accumulated value is $1043.92
        double accumulatedValue = Math.pow(investmentAmount * (1 + monthlyInterestRate), 12 * numberOfYears);
        System.out.println("Accumulated value is $" + accumulatedValue);
    }
}
