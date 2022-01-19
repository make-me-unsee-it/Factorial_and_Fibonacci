package FactorialFibonacci;

import java.util.Objects;

public class Program {
    private String result;

    public String getResult() {
        return result;
    }

    public void run(int algorithmId, int loopType, int nParameter) throws ArgumentsInputException {
        Algorithm algorithm;
        if (algorithmId == 2) algorithm = new Factorial();
        else if (algorithmId == 1) algorithm = new Fibonacci();
        else throw new ArgumentsInputException("Первое число указано неверно (допустимо '1' или '2')");
        result = algorithm.algorithmRun(loopType, nParameter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Program program)) return false;
        return result.equals(program.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return "Program{" +
                "result='" + result + '\'' +
                '}';
    }
}
