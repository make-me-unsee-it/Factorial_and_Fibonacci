package FactorialFibonacci;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProgramTest {
    private Program myProgram;

    @Before
    public void setUp() {
        myProgram = new Program();
    }

    @After
    public void tearDown() {
        myProgram = null;
    }

    @Test
    public void testRunFibonacciWhile() throws ArgumentsInputException {
        myProgram.run(1, 1, 10);
        String expected = myProgram.getResult();
        String actual = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunFibonacciDoWhile() throws ArgumentsInputException {
        myProgram.run(1, 2, 10);
        String expected = myProgram.getResult();
        String actual = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunFibonacciFor() throws ArgumentsInputException {
        myProgram.run(1, 3, 10);
        String expected = myProgram.getResult();
        String actual = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArgumentsInputException.class)
    public void testRunFibonacciLoopTypeException() throws ArgumentsInputException {
        myProgram.run(1, 4, 10);
    }

    @Test
    public void testRunFactorialWhile() throws ArgumentsInputException {
        myProgram.run(2, 1, 10);
        String expected = myProgram.getResult();
        String actual = "3628800";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunFactorialDoWhile() throws ArgumentsInputException {
        myProgram.run(2, 2, 10);
        String expected = myProgram.getResult();
        String actual = "3628800";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunFactorialFor() throws ArgumentsInputException {
        myProgram.run(2, 3, 10);
        String expected = myProgram.getResult();
        String actual = "3628800";
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArgumentsInputException.class)
    public void testRunFactorialLoopTypeException() throws ArgumentsInputException {
        myProgram.run(2, 0, 10);
    }

    @Test(expected = ArgumentsInputException.class)
    public void testRunAlgorithmTypeException() throws ArgumentsInputException {
        myProgram.run(4, 2, 10);
    }
}