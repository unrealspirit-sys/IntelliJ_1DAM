package com.dam.programacion.ejercicios.numeros;

import java.util.Scanner;

public class MayorQue {
    /*
     * Escribe un programa que lea dos números por teclado, y diga cuál es el mayor.
     * También si ambos son iguales.
     * En caso de que uno o ambos de los números introducidos son inválidos, se da
     * un mensaje de error.
     * Ejemplo:
     * Para dos números 4 y 5: Resultado: 5 es mayor que 4.
     * Para dos números 2 y 9: Resultado: 9 es mayor que 2.
     * Para dos números 4 y 4: Resultado: Son iguales.
     */
    void main(String[] args) {
        int leerNumero = leerNumeros("Escribe el primer entero: ");
        int leerNumero2 = leerNumeros("Escribe el siguiente entero:");
        mayorQue(leerNumero, leerNumero2);
    }

    // Función mayor que
    public static void mayorQue(int num1, int num2) {
        if (num1 > num2)
            IO.println("Resultado: " + num1 + "es mayor que " + num2);
        else if (num2 > num1)
            IO.println("Resultado: " + num2 + "es mayor que " + num1);
        else
            IO.println("Resultado: Son iguales");
    }

    // Función para leer argumentos
    public int leerNumeros(String mensaje) {
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        int retorno = -1111;
        if (sc.hasNextInt())
            retorno = sc.nextInt();
        else
            IO.println("Error al introducir el numero");
        return retorno;
    }

}
