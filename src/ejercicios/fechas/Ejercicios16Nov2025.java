package ejercicios.fechas;

public class Ejercicios16Nov2025 {
    static void main() {
        // Vamos a revisar algunos de los ejercicios de pseudocódigo, esta vez
        // implementándolos en Java:
        // 1) Desarrolla una aplicación que calcule el área y el perímetro de una
        // circunferencia.
        // 2) Se tienen tres variables A, B, C de tipo int.
        // Escribir una aplicación que haga los siguientes intercambios usando sólo una
        // variable auxiliar:
        // · B intercambia el valor con A.
        // · C intercambia el valor con B.
        // · A intercambia el valor con C.
        // 3) Escribe un programa que muestre la tabla de multiplicar de un número.
        // Por ejemplo:
        // 8 x 0 = 0
        // 8 x 1 = 8
        // 8 x 2 = 16
        // 8 x 3 = 24
        // 8 x 10 = 80
        // 4) Escribe un programa que muestre los múltiplos de 5 entre 1 y 100
        // utilizando un bucle y condicionales para filtrarlos.
        // Ejercicio 1
        IO.println("Ejercicio 1: Calcular Area y Perimetro" + "\nde 15: ");
        calcularAreayPerimetro(5);
        // Ejercicio 2
        int a = 2;
        int b = 4;
        int c = 6;
        int aux;
        IO.println("------------");
        IO.println("a: " + a + "\nb: " + b + "\nc: " + c);
        aux = a;
        a = c;
        c = b;
        b = aux;
        IO.println(" -a vale c: " + a + "\n -b vale a: " + b + "\n -c vale b" + c);
        // Ejercicio 3
        IO.println("------------");
        int base = 8;
        for (int i = 0; i <= 10; i++) {
            int resultado = base * i;
            IO.println(base + " x " + i + " = " + resultado);
        }
        // Ejercicio 4
        IO.println("------------");
        for (int i = 0; i <= 100; i += 5) {
            if (i % 5 == 0) {
                int multiplo = i;
                IO.println("-Multiplo: " + multiplo);
            }
        }
        /*
         * OTRA SOLUCIÓN:
         * Empezamos en 5 para excluir el 0
         * Ya no necesitamos el 'if' de dentro
         * for (int i = 5; i <= 100; i += 5) {
         * int multiplo = i;
         * IO.println("-Multiplo: " + multiplo);
         * }
         */
    }

    // función para calcular Área y perimetro de circunferencia
    public static double calcularAreayPerimetro(double radio) {
        double area = 3.1415 * Math.pow(radio, 2);
        IO.println(" El area es: " + String.format("%.2f", area));

        double perimetro = 2 * 3.1415 * radio;
        IO.println(" El perimetro es: " + String.format("%.2f", perimetro));
        return perimetro;

    }
}
