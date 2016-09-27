package actions;

import figures.Point;
import figures.Triangle;

import java.util.Arrays;

/**
 * Created by Lenovo on 26.09.2016.
 */
public class TriangleController {

    /**
     * Use this formula to find square:
     * S = ((x1-x3)(y2-y3)-(x2-x3)(y1-y3))/2
     */
    public double getSquare(Triangle triangle) {

        Point a = triangle.getA();
        Point b = triangle.getB();
        Point c = triangle.getC();

        double square;

        square = Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY()) -
                (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2;

        return Math.round(square * 100.0) / 100.0; //rounding
    }

    public double getPerimeter(Triangle triangle) {

        Point a = triangle.getA();
        Point b = triangle.getB();
        Point c = triangle.getC();


        double ab = Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
        double bc = Math.hypot(b.getX() - c.getX(), b.getY() - c.getY());
        double ac = Math.hypot(a.getX() - c.getX(), a.getY() - c.getY());

        double perimeter;

        perimeter = ab + bc + ac;

        return Math.round(perimeter * 100.0) / 100.0; //rounding
    }

    public boolean isRight(Triangle triangle) {

        Point a = triangle.getA();
        Point b = triangle.getB();
        Point c = triangle.getC();

        double lines[] = new double[3];

        lines[0] = Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
        lines[1] = Math.hypot(b.getX() - c.getX(), b.getY() - c.getY());
        lines[2] = Math.hypot(a.getX() - c.getX(), a.getY() - c.getY());

        Arrays.sort(lines); //after sorting, lines[2] - hypotenuse

        return lines[2] == Math.hypot(lines[1], lines[0]);
    }

}
