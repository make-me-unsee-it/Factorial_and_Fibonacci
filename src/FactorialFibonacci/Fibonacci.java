package FactorialFibonacci;

import java.util.Arrays;

public class Fibonacci implements Algorithm {
    @Override
    public String loopWhile(int nParameter) {
        int[] result = new int[nParameter];
        result[0] = 0;
        result[1] = 1;
        int i = 2;
        while (i < nParameter) {
            result[i] = result[i - 1] + result[i - 2];
            i++;
        }
        return Arrays.toString(result);
    }

    @Override
    public String loopDoWhile(int nParameter) {
        int[] result = new int[nParameter];
        result[0] = 0;
        result[1] = 1;
        int i = 2;
        do {
            result[i] = result[i - 1] + result[i - 2];
            i++;
        } while (i < nParameter);
        return Arrays.toString(result);
    }

    @Override
    public String loopFor(int nParameter) {
        int[] result = new int[nParameter];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < nParameter; i++) result[i] = result[i - 1] + result[i - 2];
        return Arrays.toString(result);
    }
}
