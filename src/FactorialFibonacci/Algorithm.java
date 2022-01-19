package FactorialFibonacci;

public interface Algorithm {
    String loopWhile(int nParameter);

    String loopDoWhile(int nParameter);

    String loopFor(int nParameter);

    default String algorithmRun(int loopType, int nParameter) throws ArgumentsInputException {
        if (loopType == 1) return loopWhile(nParameter);
        else if (loopType == 2) return loopDoWhile(nParameter);
        else if (loopType == 3) return loopFor(nParameter);
        else throw new ArgumentsInputException("Второй аргумент указан неверно (допустимо '1', '2' или '3'");
    }
}
