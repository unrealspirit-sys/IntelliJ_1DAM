package com.dam.programacion.ejercicios.EjerciciosMicrosoftTeams.calcular.nota.media.OOP;
import java.util.Arrays;
import java.util.Scanner;
// Clase alumno
    public class Alumno {
    private String nombre;
    private double[] notas = new double[3];

    // constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    //Getter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    //metodo
    public void obtenerNotas(Scanner sc) {
        boolean bandera = true;
        do{
            System.out.println(" introduce la su primera nota: ");
            notas[0] = sc.nextDouble();
            System.out.println(" introduce la segunda nota: ");
            notas[1] = sc.nextDouble();
            System.out.println(" introduce la tercera nota: ");
            notas[2] = sc.nextDouble();
            for (double nota : notas) {
                if (nota < 0 || nota > 10) {
                    System.out.println(" Nota no válida ");
                    bandera = false;
                    break;
                }
            }
            System.out.println(" Notas introducidas correctamente ");
        } while (!bandera);
    }

    //metodo
    public double mediaNotas() {
        double notaSuma = 0;
        for (int i = 0; i < notas.length; i++) {
            notaSuma += notas[i];
        }
        return notaSuma / 3;
    }
    //metodo
    public void mostrarDatos(){
        double media = mediaNotas();
        System.out.println("\n --- DATOS ALUMNO ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Media: " + media);
        if (media < 5) System.out.println( " Alumno Suspenso ");
        else System.out.println( " Alumno Aprobado ");
    }
}
