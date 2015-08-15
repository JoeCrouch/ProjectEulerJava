package Calculators;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumCalculatorUTest {

    SumCalculator calculator = SumCalculator.INSTANCE;

    @Test
    public void isSingleton() {
        assertEquals(1, SumCalculator.values().length);
    }

    @Test
    public void sumMultiplesOfForGivenEulerExample() {
        assertEquals(23, calculator.sumMultiplesOf(3, 5, 10));
    }

    @Test
    public void sumMultiplesOfForGivenEulerProblem() {
        assertEquals(233168, calculator.sumMultiplesOf(3, 5, 1000));
    }

    @Test
    public void sumMultiplesOfForValuesOtherThan3And5() {
        assertEquals(75, calculator.sumMultiplesOf(7, 11, 23));
    }

    @Test
    public void sumMultiplesOfForNegativeX() {
        try {
            calculator.sumMultiplesOf(-1, 0, 0);
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("x and y must be positive", e.getMessage());
        }
    }

    @Test
    public void sumMultiplesOfForNegativeY() {
        try {
            calculator.sumMultiplesOf(0, -1, 0);
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("x and y must be positive", e.getMessage());
        }
    }

    @Test
    public void sumMultiplesOfForZeroUpTo() {
        assertEquals(0, calculator.sumMultiplesOf(1, 1, 0));
    }
}
