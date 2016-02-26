package liang.chapter_2.exercise_2_17;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        Enter the temperature in Fahrenheit between -58°F and 41°F:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperatureInFahrenheit = scanner.nextDouble();
//        Enter the wind speed (>=2) in miles per hour: 6
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeedInMilesPerHour = scanner.nextDouble();
//        The wind chill index is -5.56707
        double windChillIndex = 35.74 + 0.6215 * temperatureInFahrenheit
                - 35.75 * Math.pow(windSpeedInMilesPerHour, 0.16)
                + 0.4275 * temperatureInFahrenheit * Math.pow(windSpeedInMilesPerHour, 0.16);

        System.out.println("The wind chill index is " + windChillIndex);
    }
}
