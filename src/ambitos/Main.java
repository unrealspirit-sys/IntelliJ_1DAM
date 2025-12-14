package ambitos;

import ambitos.externa;

public class Main {
    static void main() {
        Interna campoInterno;
        externa campoExterno; // como externa está en otra ruta, hay que hacer un import con la ruta. (import
                              // mi.paquete.externa;)

        final double PI = 3.1415;
        for (int i = 10; i > 5; i--) {
            // IO.println(i);

            IO.println("Valor final de i: " + i);
            IO.println("Valor de PI: " + PI);
            IO.println("PI de Math: " + Math.PI);

            // palabra clave var
            var variable = 9;
            var variable_2 = "clase programacion";
            /*
             * Booleanos
             * boolean a = false;
             * boolean b = true;
             */
            // Conversion Implicita
            byte b = 1;
            short s = b;
            int in = s;
            long l = in;
            float f = l;
            double d = f;
            // char ch =s; //sale en rojo por que de short a char se pierde informacion, y
            // habria que hacer una conversion explicita.

            // Conversion explicita (casting)
            char ch = (char) s;
            // otro ejemplo de casting
            int i2 = 125;
            b = (byte) i2;

            // Wrapper - Convierte un tipo primitivo en una clase (objeto).
            /*
             * byte Byte
             * short Short
             * int Integer Para almacenar valores enteros en un List.
             * long Long
             * float Float
             * double Double
             * char Character Para manipular caracteres como objetos.
             * boolean Boolean
             */
            Integer miInt = 9;
            IO.println(miInt);

        }
    }
}
