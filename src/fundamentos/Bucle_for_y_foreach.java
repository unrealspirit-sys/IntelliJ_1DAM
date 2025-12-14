package fundamentos;

public class Bucle_for_y_foreach {
    /*Mostrar por pantalla
2
5
8
11*/
    public static void main (String[] args){
        for (int i =2; i<12; i+=3){
            IO.println(i);
        }

/* Bucle for each*/
String[] frutas = {"piña","pera","platano","kiwi","manzana"};
for (String pieza : frutas){
    IO.print(pieza + " ");
        }
    }
}
