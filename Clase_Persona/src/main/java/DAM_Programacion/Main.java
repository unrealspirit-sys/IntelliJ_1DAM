package DAM_Programacion;

public class Main {
    static void main() {
        Persona p = new Persona("Juan", "Cruz", "111A", 23);


        p.setNombre("Luis");
        IO.println("El nombre de la instancia p es: " + p.getNombre());
        p.setEdad(25);
        IO.println("La edad de la instancia a p es: " + p.getEdad());
        Persona.contador++;
        Persona p2 = new Persona("Ana ", "Ruiz", "222b", 21);
        IO.println("El nif de la instancia a p2 es: " + p2.getNif());
        Persona.contador++;
        IO.println("Estado de la instancia p: " + p.toString());

        Persona p3 = new Persona("Carmen", "3333C");
        IO.println("Estado de la instancia p3: " + p3); //Llamada implícita a toString()
        Persona.contador++;

        IO.println(p3.presentar());
        IO.println("en el sistema hay: " + Persona.contador + "personas");
    }
}

