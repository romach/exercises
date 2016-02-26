package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        // Enter a degree in Celsius: 43
        System.out.print("Enter a degree in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double degreeInCelsius = scanner.nextDouble();

        double degreeInFahrenheit = (9.0 / 5) * degreeInCelsius + 32;

        // 43 Celsius is 109.4 Fahrenheit
        System.out.println(degreeInCelsius + " Celsius is " + degreeInFahrenheit + " Fahrenheit");
    }

}
