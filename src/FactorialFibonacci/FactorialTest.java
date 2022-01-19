package FactorialFibonacci;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @After
    public void tearDown() {
        factorial = null;
    }

    @Test
    public void testLoopWhile() {
        String expected = factorial.loopWhile(10);
        String actual = "3628800";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLoopDoWhile() {
        String expected = factorial.loopDoWhile(10);
        String actual = "3628800";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loopFor() {
        String expected = factorial.loopFor(10);
        String actual = "3628800";
        Assert.assertEquals(expected, actual);
    }
}