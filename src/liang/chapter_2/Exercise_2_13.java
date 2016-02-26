package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_13 {
    public static void main(String[] args) {
        //Enter the monthly saving amount: 100
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = new Scanner(System.in).nextDouble();
        //After the sixth month, the account value is $608.81
        double accountValue = 0;
        accountValue = (monthlySavingAmount + accountValue) * 1.00417;
        accountValue = (monthlySavingAmount + accountValue) * 1.00417;
        accountValue = (monthlySavingAmount + accountValue) * 1.00417;
        accountValue = (monthlySavingAmount + accountValue) * 1.00417;
        accountValue = (monthlySavingAmount + accountValue) * 1.00417;
        accountValue = (monthlySavingAmount + accountValue) * 1.00417;
        accountValue = (int)(accountValue * 100)/100.0;
        System.out.print("After the sixth month, the account value is $" + accountValue);
    }
}
