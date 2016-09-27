package test;

import actions.TriangleController;
import figures.Point;
import figures.Triangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lenovo on 27.09.2016.
 */
public class SquareTest {
    @Test
    public void getSquare() throws Exception {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(3.5f, 4.8f), new Point(3.9f, -1.2f));
        TriangleController triangleController = new TriangleController();
        double actual = triangleController.getSquare(triangle);
        double expected = 11.46;
        Assert.assertEquals(expected, actual, 0.05);
    }

}