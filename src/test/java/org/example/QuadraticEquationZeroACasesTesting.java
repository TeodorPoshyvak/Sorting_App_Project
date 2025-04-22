package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Parameterized tests for cases where the coefficient 'a' is zero,
 * which should throw IllegalArgumentException.
 */
@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {

    private final double a, b, c;
    private final QuadraticEquation quadraticEquation = new QuadraticEquation();


    /**
     * Constructor for the test case.
     *
     * @param a coefficient a (should be zero in these cases)
     * @param b coefficient b
     * @param c constant term
     */
    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 2, 1},
                {0, 0, 1},
                {0, 4, -2},
                {0, -3, 3}
        });
    }

    /**
     * Test expecting IllegalArgumentException due to zero 'a'.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgument() {
        quadraticEquation.solve(a, b, c);
    }
}