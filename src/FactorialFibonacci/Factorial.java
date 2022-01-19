package FactorialFibonacci;

public class Factorial implements Algorithm {
    @Override
    public String loopWhile(int nParameter) {
        int step = 1;
        long result = 1L;
        while (step < nParameter) {
            step++;
            result *= step;
        }
        return Long.toString(result);
    }

    @Override
    public String loopDoWhile(int nParameter) {
        int step = 1;
        long result = 1L;
        do {
            step++;
            result *= step;
        } while (step < nParameter);
        return Long.toString(result);
    }

    @Override
    public String loopFor(int nParameter) {
        long result = 1L;
        for (int step = 1; step <= nParameter; step++) result *= step;
        return Long.toString(result);
    }
}
