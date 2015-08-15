package Calculators;

public enum SumCalculator {
    INSTANCE;

    public int sumMultiplesOf(int x, int y, int upTo) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x and y must be positive");
        }
        int sum = 0;
        for (int i = Math.min(x, y); i < upTo; i ++) {
            sum += i % x == 0 || i % y == 0 ? i : 0;
        }
        return sum;
    }

    //TODO: add tests
    public int sumEvenFibonacciNumbersUpTo(int largestFibNumber) {
        int sum = 0;
        int lastFibValue = 1;
        int fibValue = 1;
        while(fibValue < largestFibNumber)
        {
            int oldFibValue = fibValue;
            fibValue = oldFibValue + lastFibValue;
            lastFibValue = oldFibValue;
            //TODO: add calculator for isEven
            if(fibValue % 2 == 0) {
                sum += fibValue;
            }
        }
        return sum;
    }
}
