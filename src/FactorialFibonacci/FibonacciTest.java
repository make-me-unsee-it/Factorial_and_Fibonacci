package FactorialFibonacci;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @After
    public void tearDown() {
        fibonacci = null;
    }

    @Test
    public void testLoopWhile() {
        String expected = fibonacci.loopWhile(10);
        String actual = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLoopDoWhile() {
        String expected = fibonacci.loopDoWhile(10);
        String actual = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLoopFor() {
        String expected = fibonacci.loopFor(10);
        String actual = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expected, actual);
    }
}