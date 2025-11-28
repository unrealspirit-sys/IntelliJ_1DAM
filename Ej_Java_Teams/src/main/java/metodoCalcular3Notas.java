
/*1) La nota final de cada alumno se calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte
teórica el 40%.
Hacer un programa leerá el nombre de un alumno y sus tres notas y mostrará
Nota final de [NOMBRE] es [NOTA FINAL].
*/

import java.util.Scanner;

public class metodoCalcular3Notas {
    public static void main(String[] args) {
        //Pedir datos
        IO.println("Introduce el nombre del alumno");
        Scanner sc = new Scanner(System.in);
        String alumno = sc.nextLine();
        double notaPracticas = leerDouble("Introduce la nota de las prácticas: ");// LLamamos al metodo leerDouble 3 veces, 1 por cada argumento q necesitamos en el metodo notasAlumno
        double notaPracticas2 = leerDouble("Introduce la nota de los problemas: ");
        double notaPracticas3= leerDouble("Introduce la nota de la teorica: ");
        //Llamar al Metodo notasAlumno
        notasAlumno(alumno,notaPracticas,notaPracticas2,notaPracticas3);

    }
    //Metodo para leer los double del metodo operacion
    static double leerDouble(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        double retorno = 999;//Si el usuario pone letras.. el retorno sera 999, lo cual sabremos que es una nota inválida.
        if (sc.hasNextDouble()) retorno = sc.nextDouble(); //aseguramos que el usuario pone un numero con el hasnextdouble y si es asi lo guardamos en la variable retorno
        return retorno;
    }
    //metodo operacion
    public static void notasAlumno(String alumno, double practica, double problemas, double teorica) {
        // operaciones
         double notaFinal = (double) practica * 0.10 + problemas * 0.50 + teorica * 0.40;
         IO.println(" La nota final de "+ alumno+ " es: "+ notaFinal);
    }
}
