package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Parameterized tests for cases where a quadratic equation has one real root.
 */
@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    private final double a, b, c, expected;
    private final QuadraticEquation quadraticEquation = new QuadraticEquation();


    /**
     * Constructor for the test case.
     *
     * @param a coefficient a
     * @param b coefficient b
     * @param c constant term
     * @param expected expected single root
     */
    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -2, 1, 1.0},
                {9, 6, 1, -0.3333333333333333},
                {4, 4, 1, -0.5},
                {25, 10, 1, -0.2}
        });
    }

    /**
     * Test expecting a single root.
     */
    @Test
    public void testSingleRoot() {
        assertEquals(String.valueOf(expected), quadraticEquation.solve(a, b, c));
    }
}