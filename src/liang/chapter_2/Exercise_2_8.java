package liang.chapter_2;

import java.util.Scanner;

//(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
//        the current time in GMT. Revise the program so that it prompts the user to enter
//        the time zone offset to GMT and displays the time in the specified time zone.
public class Exercise_2_8 {
    public static void main(String[] args) {
//        Enter the time zone offset to GMT: −5
        System.out.print("Enter the time zone offset to GMT: ");
        int timezone = new Scanner(System.in).nextInt();
//        The current time is 4:50:34
        long totalMillis = System.currentTimeMillis();
        int totalSeconds = (int)(totalMillis / 1000);
        int seconds = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
        int totalHoursWithGMT = totalMinutes / 60 + timezone;
        int hours = totalHoursWithGMT % 24;

        System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds);
    }
}
