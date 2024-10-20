package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1Test {

    @Test
    public void testFractionToDecimal_IntegerResults() {
        Solution1 solution = new Solution1();
        assertEquals("2", solution.fractionToDecimal(2, 1), "Test Case 1 Failed");
        assertEquals("5", solution.fractionToDecimal(10, 2), "Test Case 2 Failed");
    }

    @Test
    public void testFractionToDecimal_DecimalResults() {
        Solution1 solution = new Solution1();
        assertEquals("0.5", solution.fractionToDecimal(1, 2), "Test Case 3 Failed");
        assertEquals("2.5", solution.fractionToDecimal(5, 2), "Test Case 4 Failed");
    }

    @Test
    public void testFractionToDecimal_RepeatingDecimalResults() {
        Solution1 solution = new Solution1();
        assertEquals("0.(6)", solution.fractionToDecimal(2, 3), "Test Case 5 Failed");
        assertEquals("0.(012)", solution.fractionToDecimal(4, 333), "Test Case 6 Failed");
    }

    @Test
    public void testFractionToDecimal_NegativeResults() {
        Solution1 solution = new Solution1();
        assertEquals("-0.5", solution.fractionToDecimal(-1, 2), "Test Case 7 Failed");
        assertEquals("-0.5", solution.fractionToDecimal(1, -2), "Test Case 8 Failed");
        assertEquals("0.5", solution.fractionToDecimal(-1, -2), "Test Case 9 Failed");
    }

    @Test
    public void testFractionToDecimal_BoundaryCases() {
        Solution1 solution = new Solution1();
        assertEquals("0", solution.fractionToDecimal(0, 1), "Test Case 10 Failed");
        assertEquals("0.(3)", solution.fractionToDecimal(1, 3), "Test Case 11 Failed");
        assertEquals("1.(6)", solution.fractionToDecimal(5, 3), "Test Case 12 Failed");
    }
}