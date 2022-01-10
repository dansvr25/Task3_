package ru.vsu.cs.sviridov_d_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Test test = new Test();

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        int testProgram = test.testProgram(picture);
        if (testProgram == 0) {
            System.out.println("Test error");
            System.exit(1);
        } else {
            System.out.println("All tests completed");
        }

        System.out.println(" ");

        double x = readNumber("Enter x: ");
        double y = readNumber("Enter y: ");

        printColorForPoint(x, y);

    }

    private static double readNumber(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();

        if (value < -10 || value > 10) {
            System.out.println("Error");
            System.out.println("Point can be located in the range from -10 to 10");
            System.out.println("Please try again");

            return readNumber(text);
        }

        return value;

    }

    private static final Picture picture = new Picture();

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.1f, %.1f) - ", x, y);
        System.out.println(picture.getColor(x, y));
    }

}
