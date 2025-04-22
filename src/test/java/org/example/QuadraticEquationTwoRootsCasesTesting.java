package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Parameterized tests for cases where a quadratic equation has two real roots.
 */
@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    private final double a, b, c, root1, root2;
    private final QuadraticEquation quadraticEquation = new QuadraticEquation();


    /**
     * Constructor for the test case.
     *
     * @param a coefficient a
     * @param b coefficient b
     * @param c constant term
     * @param root1 expected root 1
     * @param root2 expected root 2
     */
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, double root1, double root2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.root1 = root1;
        this.root2 = root2;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -3, 2, 1.0, 2.0},
                {1, 1, -6, 2.0, -3.0},
                {2, -7, 3, 3.0, 0.5},
                {1, 0, -1, 1.0, -1.0}
        });
    }

    /**
     * Test expecting two roots in any order.
     */
    @Test
    public void testTwoRoots() {
        String result = quadraticEquation.solve(a, b, c);
        String[] parts = result.split(" ");
        double r1 = Double.parseDouble(parts[0]);
        double r2 = Double.parseDouble(parts[1]);

        assertTrue(
                (Math.abs(r1 - root1) < 0.0001 && Math.abs(r2 - root2) < 0.0001) ||
                        (Math.abs(r1 - root2) < 0.0001 && Math.abs(r2 - root1) < 0.0001)
        );
    }
}