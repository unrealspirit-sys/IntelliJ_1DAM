/*Crea una aplicación que dibuje una escalera inversa de asteriscos. Nosotros le pasamos la altura de la escalera inversa por teclado.
Ejemplo:
*****
****
***
**
**/

import java.util.Scanner;

public class EscaleraAsteriscos {
    static void main(){

    }


//Función

public void escaleraInversa (int numero){
    Scanner sc = new Scanner(System.in);
    //guardia
    if (sc.hasNextInt()) {
        numero = sc.nextInt();
    } else IO.println("valor no reconocido");

    //bucle
    for (int i=1; i<numero;i++){



    }

    }
}