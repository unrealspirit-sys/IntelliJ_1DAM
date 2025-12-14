package ejercicios.media;

import java.util.Arrays;
import java.util.Scanner;

public class NotaMediaSinOOP {
    /*
     * Solicitar al usuario cuántos alumnos hay en el grupo.
     * Para cada alumno:
     * Pedir su nombre.
     * Pedir tres notas (valores entre 0 y 10).
     * Calcular la nota media de cada alumno.
     * Mostrar por pantalla:
     * El nombre del alumno
     * Sus notas
     * Su nota media
     * Un mensaje indicando si está APROBADO (media ≥ 5) o SUSPENSO.
     */
    public static void main(String[] args) {
        System.out.println(" -- Hello Victor --");

        System.out.println(" ¿ Cuantos alumnos hay en 1dam? ");
        Scanner sc = new Scanner(System.in);
        int numAlumnos = sc.nextInt();

        boolean bandera = true;
        do {
            if (numAlumnos <= 0 || numAlumnos > 40) {
                System.out.println(" Numero no válido. Vuelva a intentarlo.");
                bandera = false;
                sc.nextLine();
                numAlumnos = sc.nextInt();
            } else {
                System.out.println("numero de alumnos correcto");
                bandera = true;
            }
        } while (!bandera);
        sc.nextLine(); // depurar buffer

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Nombre del alumno: ");
            String nombre = sc.nextLine();

            double[] notas = new double[3];
            double sumaNotas = 0;
            for (int j = 0; j < notas.length; j++) {
                double inputNota;
                do {
                    System.out.println(" Añade la nota " + (j + 1) + ".");
                    inputNota = sc.nextDouble();
                    if (inputNota < 0 || inputNota > 10) {
                        System.out.println(" Nota no válida ");
                    }
                } while (inputNota < 0 || inputNota > 10);

                notas[j] = inputNota; // añadir cada nota obtenida al array notas
                sumaNotas += inputNota; // cada nota obtenida la vamos sumando en la variable sumaNotas, que guarda el
                                        // resultado total.
            }
            sc.nextLine();
            // Calculos
            double mediaNotas = sumaNotas / notas.length;
            // mostrar datos
            System.out.println(" ---DatOs @luMn0---");
            System.out.println(" nombre del alumno: " + nombre.trim().toUpperCase());
            System.out.println(" Notas: " + Arrays.toString(notas));
            System.out.printf(" media de notas: %2f", mediaNotas);
            boolean aprobado = mediaNotas >= 5;
            if (aprobado) {
                System.out.println(" APROBADO ");
            } else
                System.out.println(" Suspenso. Esfuerzaté !");
            System.out.println(" ---------------- ");
        }
        sc.close();
    }
}
