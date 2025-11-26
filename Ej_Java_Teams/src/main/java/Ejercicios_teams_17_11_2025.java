import java.util.Scanner;

public class Ejercicios_teams_17_11_2025 {
    public static void main() {
        /*
         * Utilizando la función readln() y readln(String prompt), ya podéis hacer los
         * siguientes ejercicios:
         * 7) Leer dos valores enteros por pantalla, y decir por pantalla cuál de las
         * dos es mayor, o si son iguales.
         * 
         * 8) Pide al usuario cinco números y se da la suma y la media de los números
         * introducidos.
         * 
         * 9) Pide al usuario unos datos estadísticos:
         * 
         * Nombre
         * Primer apellido
         * Segundo apellido
         * Teléfono (tipo número)
         * Edad (tipo número)
         * Provincia
         * Mostrar todos los datos. Si algún dato numérico no es válido mostrar por
         * pantalla "N/A".
         * 
         * 10) Leer números enteros por teclado del usuario, hasta que escriba un valor
         * no válido o vacío. Mostrar la suma de los números introducidos.
         */
        // Ejercicio 7
        IO.println("Introduce un numero: ");
        int num1 = leerEntero(2);
        IO.println("Introduce el siguiente numero: ");
        int num2 = leerEntero(8);
        if (num1 > num2) {
            IO.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            IO.println(num1 + " es menor que " + num2);
        } else {
            IO.println(num1 + " y " + num2 + " son iguales. ");
        }


        /*Ejercicio 8  Hecho con ayuda de IA
        IO.println("Escribe 5 numeros consecutivamente");
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            double numerosElegidos = lector.nextDouble();
            suma += numerosElegidos;
        }
        double media = (double) suma / 5;
        IO.println("Tus numeros suman: " + suma + " y hacen una media de: " + media);
        lector.nextLine(); <--Depurar*/
            //Ejercicio 8 Hecho con Victor
//             int suma=0;
//             final int  MAX=5 ;
//            double media;
//            for (int i=1; i<=MAX; i++){
//                Scanner sc = new Scanner(System.in); //<-- SI creamos la clase scanner dentro del for, ya se depura  solo en cada iteracion.
//                IO.println("Introduce el numero " + i +":");
//
//                if (sc.hasNextInt()){
//                    suma += sc.nextInt();
//                    IO.println("Total:" + suma);
//                }
//            } media = (double) suma / MAX;
//            IO.println("media es: "+ media);

            // Ejercicio 9
        String nombre, apellido1, apellido2, provincia;
        int telefono, edad;
        Scanner sc = new Scanner(System.in);
        IO.println(" Introduce el nombre: ");
        nombre = sc.next();
        IO.println(" Introduce el apellido: ");
        apellido1=sc.next();
        IO.println(" Introduce el segundo apellido: ");
        apellido2=sc.next();
        IO.println(" Introduce el telefono: ");
        if (sc.hasNextInt()){
            telefono = sc.nextInt();}
        else {
            telefono =-1;
            sc.next();
        }
        IO.println(" Introduce la edad: ");
        if (sc.hasNextInt()){
            edad = sc.nextInt();}
        else {
            edad =-1;
            sc.next();
        }
        IO.println("Introduce la provincia: ");
        provincia = sc.next();
        //Mostrar datos por pantalla
        IO.println("Datos introducidos: "+"Nombre: "+ nombre + " "+ apellido1+ " "+ apellido2 +" ,telefono " + telefono + " ,edad "+ edad + " ,provincia: "+provincia );
        if ( telefono !=-1) IO.println("telefono correcto");
        else IO.println("N/A");
        if (edad != -1) IO.println("edad correcta");
        else IO.println("N/A");

        // Ejercicio 10
        IO.println("\nEscribe números (escribe una letra para terminar):");
        Scanner lector = new Scanner(System.in);
        int sumar = 0;

        while (lector.hasNextInt()) {
            sumar += lector.nextInt();
        }
        IO.println(" La suma de lso numeros introducidos es: " + sumar);

        // //ejercicio 7 con readln()
        // String a , b;
        // a = IO.readln("introduce el primer numero: ");
        // b = IO.readln("introduce el segundo numero: ");
        // IO.println ("Has introducido " + a + " y " + b);
        //
        // int n1 = Integer.parseInt(a);
        // int n2 = Integer.parseInt(b);
        // //pero de esta forma se esta confiando q el usuario va a meter números, si
        // escribe palabras va a dar error
        // //Cual es mayor?
        // if (n1 > n2) {
        // IO.println( a+" es mayor q "+b);
        // } else if (n1 < n2) IO.println(a+" es menor q "+b);
        // else IO.println("los numeros son iguales ");
    }

    public static int leerEntero(int n) { //funcion para leer un entero positivo (devolviendo entero) y lo muestra por pantalla
            Scanner lector = new Scanner(System.in);
            IO.println("Introduce un número entero");

            //Comprobar entrada antes de procesar
            if ( lector.hasNextInt()) {
             n = lector.nextInt();
             IO.println("Has introducido "+n);
                return  n;
            }
            else {
                lector.next();
                IO.println(" Introduce un número entero válido");
            }
        return -1;
    }
}