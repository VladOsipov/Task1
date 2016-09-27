package test;

import actions.TriangleController;
import figures.Point;
import figures.Triangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lenovo on 27.09.2016.
 */
public class RightTriangleTest {
    @Test
    public void isRight() throws Exception {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        TriangleController triangleController = new TriangleController();
        boolean isRight = triangleController.isRight(triangle);
        Assert.assertTrue(isRight);
    }

}