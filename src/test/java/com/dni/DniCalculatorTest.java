package com.dni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DniCalculatorTest {

    @Test
    void testCalculateLetterValidCases() {
        DniCalculator calculator = new DniCalculator();
        assertEquals("T", calculator.calculateLetter(0), "Incorrect letter for DNI 0");
        assertEquals("R", calculator.calculateLetter(1), "Incorrect letter for DNI 1");
        assertEquals("Z", calculator.calculateLetter(12345678), "Incorrect letter for DNI 12345678");
        assertEquals("R", calculator.calculateLetter(99999999), "Incorrect letter for DNI 99999999");
    }

    @Test
    void testCalculateLetterBoundaryCases() {
        DniCalculator calculator = new DniCalculator();
        assertEquals("T", calculator.calculateLetter(0), "Incorrect letter for DNI lower boundary");
        assertEquals("E", calculator.calculateLetter(22), "Incorrect letter for DNI upper boundary (mod 23)");
    }

    @Test
    void testCalculateLetterNegativeCase() {
        DniCalculator calculator = new DniCalculator();
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> calculator.calculateLetter(-1));
        assertNotNull(exception, "Exception should be thrown for negative DNI");
    }
}

