package ru.vsu.cs.sviridov_d_v;

public class Picture {

    public static final Line L1 = new Line(-3, 4, 26);
    public static final Circle C1 = new Circle(2, -6, 4);
    public static final HorizontalParabola H1 = new HorizontalParabola(2, -3, -0.5);
    public static final VerticalParabola V1 = new VerticalParabola(6, -6, -1.0/9.0);

    public SimpleColor getColor(double x, double y) {
        if (x >= 0 && y >= 0) {
            return isPointInFirstQuarter();
        } else if (x <= 0 && y >= 0) {
            return isPointInSecondQuarter(x, y);
        } else if (x <= 0 && y <= 0) {
            return isPointInThirdQuarter(x, y);
        }

        return isPointInFourthQuarter(x, y);

    }

    private SimpleColor isPointInFirstQuarter() {
        return SimpleColor.BLUE;
    }

    private SimpleColor isPointInSecondQuarter(double x, double y) {
        if (L1.isPointAboveLine(x, y) && H1.isPointRightOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else {
            return SimpleColor.GRAY;
        }
    }

    private SimpleColor isPointInThirdQuarter(double x, double y) {
        if (L1.isPointAboveLine(x, y)) {
            return SimpleColor.GRAY;
        } else if (C1.isPointInsideCircle(x, y) && !H1.isPointRightOfParabola(x, y)) {
            return SimpleColor.BLUE;
        } else {
            return SimpleColor.YELLOW;
        }
    }

    private SimpleColor isPointInFourthQuarter(double x, double y) {
        if (!H1.isPointRightOfParabola(x, y) && !C1.isPointInsideCircle(x, y)) {
            return SimpleColor.YELLOW;
        } else if (V1.isPointUpwardParabola(x, y)) {
            return SimpleColor.BLUE;
        } else {
            return SimpleColor.ORANGE;
        }
    }

}
