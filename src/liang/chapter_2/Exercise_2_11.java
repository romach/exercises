package liang.chapter_2;

import java.util.Scanner;

public class Exercise_2_11 {
    public static void main(String[] args) {
        //Enter the number of years: 5
        System.out.print("Enter the number of years: ");
        int numberOfYears = new Scanner(System.in).nextInt();
        //The population in 5 years is 325932970
        int currentPopulation = 312_032_486;
        double berthsPerDay = 24*60*60 / 7.0;
        double deathsPerDay = 24*60*60 / 13.0;
        double immigrantsPerDay = 24*60*60 / 45.0;
        double populationInFiveYears = currentPopulation + (berthsPerDay - deathsPerDay + immigrantsPerDay) * 365 * 5;
        System.out.println("The population in 5 years is " + (int)populationInFiveYears);
    }
}
