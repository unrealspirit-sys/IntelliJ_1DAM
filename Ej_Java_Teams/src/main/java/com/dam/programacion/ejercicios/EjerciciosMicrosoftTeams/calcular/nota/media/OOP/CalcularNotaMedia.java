package com.dam.programacion.ejercicios.EjerciciosMicrosoftTeams.calcular.nota.media.OOP;

import java.util.ArrayList;
import java.util.Scanner;
/*Solicitar al usuario cuántos alumnos hay en el grupo.
Para cada alumno:
Pedir su nombre.
Pedir tres notas (valores entre 0 y 10).
Calcular la nota media de cada alumno.
Mostrar por pantalla:
El nombre del alumno
Sus notas
Su nota media
Un mensaje indicando si está APROBADO (media ≥ 5) o SUSPENSO. */

public class CalcularNotaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numAlumnos;
        IO.println("\n¿ Cuantos alumnos hay en 1DAM? ");
        
        boolean bandera=false;
        do{
            numAlumnos = sc.nextInt();
            if ( numAlumnos < 0 || numAlumnos > 40 ){
                System.out.println(" ERROR en el numero de alumnos. vuelve a intentarlo ");
                numAlumnos = 0;
            } else bandera = true;
        }while (!bandera);
        sc.nextLine();
        //Logica
        ArrayList<Alumno> clase = new ArrayList();

        for (int i =0; i<numAlumnos;i++){
            System.out.println(" Escribe el nombre del alumno "+ (i+1) + " : ");
            String nombre = sc.nextLine();//pide el nombre en cada iteracion
            Alumno alumno = new Alumno(nombre);//añade el nombre de cada iteracion a cada nueva instancia de alumno
            alumno.obtenerNotas(sc);//obtener las notas de cada alumno en cada iteracion
            sc.nextLine();//depurar buffer
            clase.add(alumno);//añadir cada alumno a un ArrayList
        }
        //Mostrar alumnos del List
        for ( Alumno persona : clase){
            persona.mostrarDatos();
        }
        sc.close();
    }
}
