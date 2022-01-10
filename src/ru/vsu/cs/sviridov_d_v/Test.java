package ru.vsu.cs.sviridov_d_v;

public class Test {

    public int testProgram(Picture picture) {
        if (!testOfFirstQuarter(picture)) {
            return 1;
        } else if (!testOfSecondQuarter(picture)) {
            return 2;
        } else if (!testOfThirdQuarter(picture)) {
            return 3;
        } else if (!testOfFourthQuarter(picture)) {
            return 4;
        }

        return 0;

    }

    public boolean testOfFirstQuarter(Picture picture) {
        return picture.getColor(5, 6) == SimpleColor.BLUE;
    }

    public boolean testOfSecondQuarter(Picture picture) {
        if (picture.getColor(-5, 4) == SimpleColor.YELLOW) {
            System.out.println("Test completed");
        } else return false;

        if (picture.getColor(-3, 0) == SimpleColor.YELLOW) {
            System.out.println("Test completed");
        } else return false;

        if (picture.getColor(-7, 1) == SimpleColor.GRAY) {
            System.out.println("Test completed");
        } else return false;

        return true;
    }

    public boolean testOfThirdQuarter(Picture picture) {
        if (picture.getColor(-2, -3) == SimpleColor.YELLOW) {
            System.out.println("Test completed");
        } else return false;

        if (picture.getColor(-0.5, -0.5) == SimpleColor.BLUE) {
            System.out.println("Test completed");
        } else return false;

        if (picture.getColor(-1, -4) == SimpleColor.BLUE) {
            System.out.println("Test completed");
        } else return false;

        return true;
    }

    public boolean testOfFourthQuarter(Picture picture) {
        if (picture.getColor(2, -6) == SimpleColor.BLUE) {
            System.out.println("Test completed");
        } else return false;

        if (picture.getColor(3, -9) == SimpleColor.ORANGE) {
            System.out.println("Test completed");
        } else return false;

        if (picture.getColor(6, -9) == SimpleColor.ORANGE) {
            System.out.println("Test completed");
        } else return false;

        return true;
    }

}
