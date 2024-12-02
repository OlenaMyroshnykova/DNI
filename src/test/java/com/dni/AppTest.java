package com.dni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    @Test
    public void testAppConstructorInit() {
        App app = new App(); 
        assertNotNull(app); 
    }

    @Test
    void testIsValidNumberValidCases() {
        assertTrue(App.isValidNumber("12345678"), "12345678 should be valid");
        assertTrue(App.isValidNumber("0"), "0 should be valid");
        assertTrue(App.isValidNumber("99999999"), "99999999 should be valid");
    }

    @Test
    void testIsValidNumberInvalidCases() {
        assertFalse(App.isValidNumber("-1"), "-1 should be invalid");
        assertFalse(App.isValidNumber("100000000"), "100000000 should be invalid");
        assertFalse(App.isValidNumber("abc"), "Non-numeric input should be invalid");
        assertFalse(App.isValidNumber(""), "Empty input should be invalid");
    }

    @Test
    void testMainValidInput() {
        String simulatedInput = "12345678\n";
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(input);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        App.main(new String[]{});

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("La letra correspondiente al DNI 12345678 es: Z"),
                "The output should contain the correct letter for DNI 12345678");

        System.setIn(System.in);
        System.setOut(System.out);
    }
}
