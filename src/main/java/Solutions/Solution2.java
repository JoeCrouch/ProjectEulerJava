package Solutions;

import Calculators.SumCalculator;

public class Solution2 {

    private static SumCalculator calculator = SumCalculator.INSTANCE;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Solution: " + calculator.sumEvenFibonacciNumbersUpTo(4000000));
        System.out.println("Time: " + (System.currentTimeMillis() - start) + "ms");
    }
}
