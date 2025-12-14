package bucles;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // FOR
        for (int i = 1; i < 10; i++) { // for ( inicializacion; condicion control; incremento o decremento) {codigo}
            System.out.print(i + "  ");
        }
        // WHILE
        int i = 1;
        while (i < 10) {
            IO.print(i + "  ");
            i++;
        }
        // DO WHILE
        int j = 0;
        do {
            IO.println(j);
            j++;

        } while (j < 10);
    }
}
