package com.dam.programacion.excepciones;

import java.util.InputMismatchException;
import java.io.IOError;
import java.util.Scanner;

public class TryCatchEjercicio {
    // metodo calcularDivision

    static void calcularDivision() {
        IO.println("introduce un numero real");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        IO.println("introduce otro numero real");
        double b = sc.nextDouble();
        double resultado;

        try {
            if (b == 0) {
                throw new Exception("No se puede dividir entre 0");
            }
            resultado = a / b;
            IO.println("Resultado: " + resultado);
        } catch (Exception g) {
            IO.println("error: " + g.getMessage());
        } finally {
            IO.println("el programa continua");
        }
    }

    // main
    void main() {
        TryCatchEjercicio.calcularDivision(); /*
                                               * <-- SE supone que el metodo main estaría en otro fichero
                                               * y para llamar al metodo calcularDivision que he creado en la clase
                                               * TryCatch_Ejercicio desde la clase Main, con su
                                               * metodo main. tengo q poner primero la clase punto el metodo.
                                               * Es decir:
                                               * public class Main{ <-- Clase Main en un fichero
                                               * static void main(){
                                               * TryCatch_Ejercicio.calcularDivision(); <-- Clase TryCatch_Ejercicio en
                                               * otro fichero (este).
                                               * }
                                               * }.
                                               */

        // Pero como esto es solo un ejercicio no voy a crear una clase Main solo para
        // llamar a un metodo.
        // entonces escribiendo calcularDivision(); en este main sería correcto.
    }
}
