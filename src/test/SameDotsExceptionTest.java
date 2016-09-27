package test;

import exceptions.DotsOnOneLineException;
import exceptions.SameDotsException;
import figures.Point;
import figures.Triangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Lenovo on 27.09.2016.
 */
@RunWith(Parameterized.class)
public class SameDotsExceptionTest {

    private Triangle triangle;
    private Point a;
    private Point b;
    private Point c;

    public SameDotsExceptionTest(Point[] points, SameDotsException ex) {
        a = points[0];
        b = points[1];
        c = points[2];
    }

    @Parameterized.Parameters
    public static Collection<Object[]> TableValues() {
        return Arrays.asList(new Object[][]{
                {new Point[]{new Point(0, 0), new Point(0, 0), new Point(0, 0)}, new SameDotsException()},
                {new Point[]{new Point(0, 0), new Point(0, 0), new Point(1, 1)}, new SameDotsException()},
        });
    }


    @Test(expected = SameDotsException.class)
    public void sameDotsExceptionTest() throws DotsOnOneLineException, SameDotsException {
        Triangle triangle = new Triangle(a, b, c);
    }

}