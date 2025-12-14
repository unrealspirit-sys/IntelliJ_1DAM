package ejercicios.numeros;

public class MetodoMultiplos {
    void main(String[] args) {
        // Escribe un programa que muestre los múltiplos de 5 entre 1 y 100 utilizando
        // un bucle y condicionales para filtrarlos.
        for (int i = 0; i <= 100; i += 5) {
            if (i % 5 == 0) {
                int multiplo = i;
                IO.println("- Multiplo: " + multiplo);
            }
        }
    }
}
