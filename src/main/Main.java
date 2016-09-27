package main;

import actions.TriangleController;
import exceptions.DotsOnOneLineException;
import exceptions.IllegalCoordinatesNumber;
import exceptions.SameDotsException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import figures.Point;
import figures.Triangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lenovo on 26.09.2016.
 */
public class Main {

    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }

    private static Logger logger = Logger.getLogger(Triangle.class);
    private static final String FILE_PATH = "file.txt";

    public static void main(String[] args) {

        ArrayList<Triangle> triangles = new ArrayList<Triangle>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(FILE_PATH));
            String line;
            String[] coordinates;

            while (scanner.hasNext()) {
                line = scanner.nextLine();
                coordinates = line.split(" ");
                if (coordinates.length != 6) {
                    throw new IllegalCoordinatesNumber("Coordinates number != 6");
                }

                Point a = new Point(Float.valueOf(coordinates[0]), Float.valueOf(coordinates[1]));
                Point b = new Point(Float.valueOf(coordinates[2]), Float.valueOf(coordinates[3]));
                Point c = new Point(Float.valueOf(coordinates[4]), Float.valueOf(coordinates[5]));

                triangles.add(new Triangle(a, b, c));

            }

        } catch (FileNotFoundException e) {
            logger.error("Input file not found", e);
        } catch (IllegalCoordinatesNumber e) {
            logger.error("Error scanner input file", e);
        } catch (SameDotsException e) {
            logger.error("Illegal coordinates. Dots are the same", e);
        } catch (DotsOnOneLineException e) {
            logger.error("Illegal coordinates. Dots on one line", e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
