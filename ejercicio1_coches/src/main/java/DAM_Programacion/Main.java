package DAM_Programacion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Coche c1 = new Coche("1111JB");
        Coche c2 = new Coche("1234WSD", "Ferrari", "Pura sangre", "rojo", 310);
        Coche c3 = new Coche("1234PSS", "Toyota", "Yaris");
        Coche c5 = new Coche("5555LOL", "citroen", "C5","blanco", 100);

        IO.println(c5.frenar(101));

        IO.println("Coche 1: " + c1);
        IO.println("Coche 2: " +c2);
        IO.println("Coche 3: " +c3);

    }

    }
