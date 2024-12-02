# DNI Calculator

Este proyecto es una aplicación de consola en Java que calcula la letra correspondiente al DNI (Documento Nacional de Identidad) en España.

## Descripción

La aplicación permite al usuario introducir un número de DNI (entre 0 y 99999999) y calcula la letra correspondiente utilizando el algoritmo oficial. Si el usuario introduce un dato incorrecto, la aplicación solicita nuevamente un número válido.

### Algoritmo de cálculo
1. El número del DNI se divide entre 23 y se obtiene el resto (módulo 23).
2. Según el resultado del módulo, se asigna una letra de la siguiente lista:  
   **T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E**.

## Estructura del proyecto

- `DniApp`: Clase principal que gestiona la interacción con el usuario.
- `DniCalculator`: Clase que contiene la lógica para calcular la letra del DNI.
- **Tests unitarios**: Se han implementado pruebas con JUnit para validar la funcionalidad del cálculo.

## Requisitos

- **Java 21** o superior.
- **JUnit 5** para pruebas unitarias.

## Ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/OlenaMyroshnykova/DNI.git
