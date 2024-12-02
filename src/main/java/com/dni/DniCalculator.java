package com.dni;

public class DniCalculator {
    private static final char[] LETTERS = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
        'C', 'K', 'E'
    };

    public String calculateLetter(int dniNumber) {
        int index = dniNumber % 23;
        return String.valueOf(LETTERS[index]);
    }
}
