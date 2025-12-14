package DAM_Programacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba2 {
    static void leerConsola() {
        System.out.println("Introduzca un número entero");
        Scanner sc = new Scanner(System.in);
        try { //Instrucciones que pueden provocar excepción
            int n = sc.nextInt();
        }
//         catch (InputMismatchException e) { //Se lanza si se captura excepción de entrada (si pone un caracter y
//            estamos pidiendo un numero)
//            System.out.println("Error; " + e.getMessage());
//        } catch (IllegalArgumentException f) {
//            System.out.println("Error; " + f.getMessage());
             catch (Exception a){ //Excepción genérica
                IO.println("Excepción genérica: " + a.getMessage());
            }

        finally { //El bloque siempre se lanza
            System.out.println("Esto siempre se lanza");
        }
        System.out.println("El programa continua");
    }
}
