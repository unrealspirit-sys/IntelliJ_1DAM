public class Ejercicios_teams_15_11_2025 {
    static void main(){
    /*¡Bienvenidos! Aquí tenéis unos ejercicios con variables.
    1) Para las siguientes variables:
       int a = 1000000;
       int b = 1000000;
       float c = 9999999.9f;
       String d = "1";
    Crear variables que contengan el resultado de las siguientes operaciones:
    a*b
    a*c
    a - d (interpretando el contenido de d como entero).
    Concatenar las variables a y d.
    Concatenar como cadena las variables a y b.
    Mostrar por pantalla todas las variables.
    2) Para dos variables enteras, decir por pantalla cuál de las dos es mayor, o si son iguales.*/

    int a = 1000000;
    int b = 1000000;
    float c = 9999999.9f;
    String d = "1";
    //Mostrar variables
    IO.println("Variable c (float): " + c);
    IO.println("Variable a (int): " + a);
    IO.println("Variable b (int): " + b);
    IO.println("Variable d (String): " + d);
    //Multiplicar
    long multiplicacion = (long)a * b;
    float multiplicacion2 = a * c;
    IO.println("multiplicar a x b: "+ multiplicacion);
    IO.println("multiplicar a x c: "+ multiplicacion2);
    //restar
    int numerod = Integer.parseInt(d);
    int resta = a - numerod;
    IO.println("resultado resta: "+ resta);
    //Concatenar
    String concatenacion= a + d;
    IO.println("concatenacion: "+concatenacion);
    //concatenar ints como cadena
    String concatenacionCadena =  a+ " , " + b;//solo hay que añadir un entrecomillado
    IO.println("Concatenar cadena a + b: " + concatenacionCadena);

    //Ejercicio 2
        int x= 101;
        int y= 69;
        int mayor=0;
        if (x == y) {
            IO.println("Son iguales");
        } else if (y > x) {
            // Has puesto y > x en el case 3, así que lo pongo segundo
            IO.println("Nº " + y + " es el mayor.");
        } else {
            // Si no son iguales y 'y' no es mayor, 'x' tiene que serlo
            IO.println("Nº " + x + " es el mayor.");
        }
}
}