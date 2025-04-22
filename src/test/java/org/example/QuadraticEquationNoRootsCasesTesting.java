package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Parameterized tests for cases where a quadratic equation has no real roots.
 */
@RunWith(Parameterized.class)
public class QuadraticEquationNoRootsCasesTesting {

    private final double a, b, c;
    private final QuadraticEquation quadraticEquation = new QuadraticEquation();

    /**
     * Constructor for the test case.
     *
     * @param a coefficient a
     * @param b coefficient b
     * @param c constant term
     */
    public QuadraticEquationNoRootsCasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 0, 1},
                {2, 2, 2},
                {3, 1, 1},
                {5, 3, 2}
        });
    }

    /**
     * Test expecting "no roots" result.
     */
    @Test
    public void testNoRoots() {
        assertEquals("no roots", quadraticEquation.solve(a, b, c));
    }
}