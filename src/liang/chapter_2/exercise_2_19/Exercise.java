package liang.chapter_2.exercise_2_19;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
        System.out.print("Enter three points for a triangle: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("us"));
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();
//        The area of the triangle is 33.6
        double abLength = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
        double bcLength = Math.sqrt(Math.pow(cx - bx, 2) + Math.pow(cy - by, 2));
        double caLength = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));

        double s = (abLength + bcLength + caLength) / 2;

        double triangleArea = Math.sqrt(s * (s - abLength) * (s - bcLength) * (s - caLength));

        System.out.println("The area of the triangle is " + triangleArea);
    }
}
