package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_4 {
    public static void main(String[] args) {
        // Enter a number in pounds: 55.5
        System.out.print("Enter a number in pounds: ");
        double pounds = new Scanner(System.in).nextDouble();
        //55.5 pounds is 25.197 kilograms
        System.out.println(pounds + " pounds is " + pounds *  0.454 + " kilograms");
    }
}
