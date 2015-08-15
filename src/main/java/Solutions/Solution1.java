package Solutions;

import Calculators.SumCalculator;

public class Solution1 {

    private static SumCalculator calculator = SumCalculator.INSTANCE;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Solution: " + calculator.sumMultiplesOf(3,5,1000));
        System.out.println("Time: " + (System.currentTimeMillis() - start) + "ms");
    }
}
