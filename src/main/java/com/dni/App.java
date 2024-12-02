package com.dni;

import java.util.Scanner;

public final class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DniCalculator dniCalculator = new DniCalculator();

        while (true) {
            System.out.println("Introduce el número de DNI (0-99999999):");
            String input = scanner.nextLine();

            if (!isValidNumber(input)) {
                System.out.println("El dato introducido es incorrecto. Por favor, intenta de nuevo.");
                continue;
            }

            int dniNumber = Integer.parseInt(input);
            String dniLetter = dniCalculator.calculateLetter(dniNumber);
            System.out.println("La letra correspondiente al DNI " + dniNumber + " es: " + dniLetter);
            break;
        }
        scanner.close();
    }

    public static boolean isValidNumber(String input) {
        try {
            int number = Integer.parseInt(input);
            return number >= 0 && number <= 99999999;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
