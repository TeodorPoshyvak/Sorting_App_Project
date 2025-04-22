package org.example;

/**
 * Provides a method to solve a quadratic equation of the form ax^2 + bx + c = 0.
 */
public class QuadraticEquation {

    /**
     * Solves the quadratic equation with coefficients a, b, and c.
     *
     * @param a coefficient of x^2 (must not be zero)
     * @param b coefficient of x
     * @param c constant term
     * @return a string representing the solution:
     *         - "x1 x2" for two roots (any order),
     *         - "x" for a single root,
     *         - "no roots" if there are no real roots
     * @throws IllegalArgumentException if a is zero
     */
    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a must not be zero");
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return x1 + " " + x2;
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return String.valueOf(x);
        } else {
            return "no roots";
        }
    }
}

