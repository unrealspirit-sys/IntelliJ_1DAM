package fundamentos;

import java.util.Scanner;
//import java.util.*   <- Esta importacion, importa todo, pero es demasiado si solo vamos a usar una cosa (scanner). Si vamos a usar más si es interesante usar el *.

public class Clase_Scanner{
    static void main (String[] args){
        int n1=0;
        int n2 = 0;
        //Clase Scanner
        IO.print("Pon un numero: ");
        Scanner sc = new Scanner(System.in);
        //comprobar entrada antes
        if (sc.hasNextInt()){
        //declaramos una variable que sea la entrada del usuario
        n1 = sc.nextInt();
        IO.println(" Has introducido " + n1);
        } else IO.println("No has introducido un número entero.");//<- Si no introduce un int.. imprimir q no ha puesto un número.

        IO.print("Pon un otro numero: ");
        if (sc.hasNextInt()){
            //declaramos una variable que sea la entrada del usuario
            n2 = sc.nextInt();
            IO.println(" Has introducido " + n2);
        } else IO.println("No has introducido un número entero.");

        //comprobar cual es mayor
        if (n1>n2) IO.println(n1+ " es mayor q "+n2);
        else if (n1<n2) IO.println(n1 +" es menor q "+n2);
        else IO.println(" son iguales ");

        if(sc.hasNextInt()) IO.println("Todavia quedan datos sin procesar");
    }
}
