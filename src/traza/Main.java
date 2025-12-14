package traza;
//HACIENDO DEBUGGIN !
public class Main {
    static void main() {
        for (int i=1; i<= 10000; i++){
            if ( i %4 ==0 && i%6 == 0){
                int multiplo= i;
                IO.println("multiplo de 4 y 6: " + multiplo+ " ");
            }
        }

String  laborables[] = {
        "Lunes",
        "Martes",
        "Miercoles",
        "Jueves",
        "Viernes"
};
        //STep into; ejecuta la línea de código actual y, si esa línea contiene una llamada a otro
        // méto'do, el debugger entra dentro de ese méto'do para que puedas seguir la ejecución línea por línea desde el principio de ese nuevo méto'do.

        //Step Over, ejecuta la línea de código actual y
// se mueve a la siguiente línea del mismo nivel de abstracción o del mismo método.
for (String dia: laborables ){
    mostrarDia(dia);
        }
    }
    static public void mostrarDia (String dia){
        IO.println(dia);
        IO.println();
    }
}
