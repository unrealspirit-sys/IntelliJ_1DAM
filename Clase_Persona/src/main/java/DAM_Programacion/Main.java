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

        //Miembros estáticos
        IO.println("en el sistema hay: " + Persona.contador + "personas");
        IO.println(Persona.MAX_EDAD);

        //Heap  y Stack
        Persona p4 = p;
        IO.println(p4.getNombre());
        p4.setNombre("Pepiño");
        IO.println("Nombre de p: " + p.getNombre());

        //LLamada a método, los parametros se pasan por valor
        int a1=5;
        int b1 = 3;
        int resultado = operacion(a1,b1);
        IO.println("valores de a1 y b1 despues de ejecutar la funcion: "+ a1+", "+b1);

        //LLamada a método con objeto
        operacionPersona(p);
        IO.println("Nombre de p: " + p.getNombre());
    }
        //paso de parámetros por copia (valor)
        public static int operacion(int a, int b){
            a = 2* a;
            return a + b;
        }
        public static void operacionPersona (Persona p){
            p.setNombre("mouriño");
        }
    }


