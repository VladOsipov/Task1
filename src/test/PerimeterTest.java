package test;

import actions.TriangleController;
import figures.Point;
import figures.Triangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lenovo on 27.09.2016.
 */
public class PerimeterTest {
    @Test
    public void getPerimeter() throws Exception {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        TriangleController triangleController = new TriangleController();
        double actual = triangleController.getPerimeter(triangle);
        double expected = 12;
        Assert.assertEquals(expected, actual, 0.05);
    }

}