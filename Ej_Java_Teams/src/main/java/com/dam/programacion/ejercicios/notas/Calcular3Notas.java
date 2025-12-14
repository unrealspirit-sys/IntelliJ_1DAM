package com.dam.programacion.ejercicios.notas;

import java.util.Scanner;

public class Calcular3Notas {

    public class Main {
        static final double CODIGO_ERROR = 99.0;

        public static void main() {
            Scanner sc = new Scanner(System.in);

            String nombre = leerNombre(sc, "Introduce el nombre");
            double nota1 = leerNota(sc, "Introduce la nota de prácticas");
            double nota2 = leerNota(sc, "Introduce la nota de problemas");
            double nota3 = leerNota(sc, "Introduce la nota de teoría");

            if (nota1 != CODIGO_ERROR && nota2 != CODIGO_ERROR && nota3 != CODIGO_ERROR) {
                // Hacer cálculos de nota
                IO.print("Nota final de " + nombre + ": ");
                IO.println(nota1 * 0.1 + nota2 * 0.5 + nota3 * 0.4);
            } else
                IO.println("Alguna de las notas de " + nombre + " no es válida");
        }

        /**
         * Muestra un mensaje y lee una cadena
         * 
         * @param mensaje
         * @return
         */
        static String leerNombre(Scanner sc, String mensaje) {
            IO.print(mensaje + ": ");
            return sc.nextLine();
        }

        /**
         * Muestra un mensaje de prompt
         * Retorna la nota si es un decimal válido y está entre 0 y 10
         * Retorna -99 si no
         * 
         * @param mensaje
         * @return
         */
        static double leerNota(Scanner sc, String mensaje) {
            Double n = 0.0;

            do {

                IO.print(mensaje + ": ");

                // Comprobar entrada antes de procesar
                if (sc.hasNextDouble()) {
                    n = sc.nextDouble();
                    IO.println("Has introducido " + n);
                    if (n < 0.0 || n > 10.0)
                        n = CODIGO_ERROR;
                } else {
                    IO.println("No has introducido un número decimal válido");
                    n = CODIGO_ERROR;
                    sc.next();
                }
            } while (n == CODIGO_ERROR);
            return n;
        }
    }
}
