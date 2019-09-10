package edu.macalester.comp127.hw0;

/**
 * @author Shilad Sen
 */
public class Area {
    /**
     * Calculates the area of a square.
     * @param sideLength The length of the side of a square
     * @return The area
     */
    public static double getSquareArea(double sideLength) {
        // sidelength*sidelength
        return sideLength * sideLength;
    }

    /**
     * Calculates the area of a circle.
     * @param radius The radius of the circle
     * @return The area
     */
    public static double getCircleArea(double radius) {
        // (radius^2)*pi
        return (radius*radius)* 3.1415926;
    }

}
