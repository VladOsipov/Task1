package test;

import exceptions.DotsOnOneLineException;
import exceptions.SameDotsException;
import figures.Point;
import figures.Triangle;
import org.junit.Test;

/**
 * Created by Lenovo on 27.09.2016.
 */
public class DotsOnOneLineExceptionTest {

    @Test(expected = DotsOnOneLineException.class)
    public void dotsOnOneLineExceptionTest() throws SameDotsException, DotsOnOneLineException {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));
    }

}
