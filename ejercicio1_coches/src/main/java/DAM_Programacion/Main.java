package DAM_Programacion;

import java.net.Socket;

public class Main {
    static void main() {
        System.out.println("\n-------------------------");
        Coche c1 = new Coche("1111JB");
        Coche c2 = new Coche("1234WSD", "Ferrari", "Pura sangre", "rojo", 310);
        Coche c3 = new Coche("1234PSS", "Toyota", "Yaris");
        Coche c4 = new Coche("5555LOL", "citroen", "C5", "blanco", 100);

        // IO.println("Coche 1: " + c1);
        // IO.println("Coche 2: " +c2);
        // IO.println("Coche 3: " +c3);
        // IO.println("Coche 4: " +c4);

        c1.setMarca("Honda");
        c1.setModelo("Civic");
        c1.setColor("Azul eléctrico");
        c1.setVelocidad(0);

        // IO.println("Coche 1: " + c1);
        IO.println(c1.acelerar() + "\n" + c1.acelerar() + "\n" + c1.acelerar());
        IO.println(c1.frenar(100));

    }

}
