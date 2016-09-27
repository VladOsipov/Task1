package figures;

import exceptions.DotsOnOneLineException;
import exceptions.SameDotsException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by Lenovo on 22.09.2016.
 */

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    private static Logger logger = Logger.getLogger(Triangle.class);

    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }


    public Triangle(Point a, Point b, Point c) throws DotsOnOneLineException, SameDotsException {

        if (a.equals(b) || a.equals(c) || b.equals(c)) {

            logger.info("Triangle parameters:\n\t" +
                    "a = " + a + ";\n\t" +
                    "b = " + b + ";\n\t" +
                    "c = " + c + ";");

            throw new SameDotsException();
        }

        if (((c.getX() - a.getX()) / (b.getX() - a.getX()) == (c.getY() - a.getY()) / (b.getY() - a.getY()))) {

            logger.info("Triangle parameters:\n\t" +
                    "a = " + a + ";\n\t" +
                    "b = " + b + ";\n\t" +
                    "c = " + c + ";");

            throw new DotsOnOneLineException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }
}
