# DNI Calculator

This project is a Java console application that calculates the corresponding letter for a Spanish DNI (National Identity Document).

## Description

The application allows the user to input a DNI number (between 0 and 99999999) and calculates the corresponding letter using the official algorithm. If the user enters invalid data, the application will prompt them to try again until a valid number is provided.

### Calculation Algorithm
1. The DNI number is divided by 23, and the remainder (modulo 23) is obtained.
2. Based on the remainder, a letter is assigned from the following list:  
   **T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E**.

## Project Structure

- `App`: Main class that handles user interaction.
- `DniCalculator`: Class containing the logic for calculating the DNI letter.
- **Unit Tests**: Tests are implemented using JUnit to validate the functionality of the calculation.

## Requirements

- **Java 21** or later.
- **JUnit 5** for unit testing.

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/OlenaMyroshnykova/DNI.git
   ```
## Tests
To run the unit tests:

Ensure JUnit 5 is configured in your development environment.
Run the tests using your IDE or a build tool such as Maven or Gradle.
Code Coverage
The minimum required code coverage for tests is 70%. Examples of the implemented tests are provided in the file DniCalculatorTest.java.

## Code Coverage Screenshot
<img src="./src/main/java/com/dni/images/DNI coverage.png" title="coverage report" alt="coverage report"/>

## HowAuthor
Project developed by Olena Myroshnykova.
