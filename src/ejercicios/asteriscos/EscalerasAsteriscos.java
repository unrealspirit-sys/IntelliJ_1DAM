package ejercicios.asteriscos;

import java.util.Scanner;

public class EscalerasAsteriscos {
    static void main() {
        escalera();
        escaleraInversa();
    }
    // Función

    public static void escaleraInversa() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        // guardia para controlar que se introduce un int
        boolean numeroValido = false;// bandera de control
        do {
            IO.println("Introduce un número");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                numeroValido = true;// sale del bucle si se introduce un int
            } else {
                sc.nextLine();
                IO.println("Error: ");
                // numeroValido sigue siendo false si no se introduce un int
            }
        } while (!numeroValido);

        // bucle para la escalera inversa
        for (int i = 0; i <= numero; i++) {
            for (int j = 0; j < (numero - i); j++)
                IO.print("*");
            IO.println();
        }
    }

    public static void escalera() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        // guardia para controlar que se introduce un int
        boolean numeroValido = false;// bandera de control
        do {
            IO.println("Introduce un número");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                numeroValido = true;// sale del bucle si se introduce un int
            } else {
                sc.nextLine();
                IO.println("Error: ");
                // numeroValido sigue siendo false si no se introduce un int
            }
        } while (!numeroValido);

        // bucle para la escalera
        for (int i = 0; i <= numero; i++) {
            for (int j = 0; j < i; j++)
                IO.print("*");
            IO.println();
        }
    }
}
