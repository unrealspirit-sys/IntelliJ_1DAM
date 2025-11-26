package DAM_Programacion;


public class Main {
    static void main() {
        Libro l1 = new Libro("333-456","Cien años de soledad");
        Libro l2 = new Libro ("2025-11-87654321", "el principito","fantasia",6,12);
        Libro l3 = new Libro ("111-234","el quijote", "Novela", 3,20);
        l1.setN_ejemplares(20);
        l2.setN_ejemplares(8);
        l3.setN_ejemplares(10);
        l3.setTitulo("Don Quijote de la Mancha");
        IO.println(l1 +"\n"+l2+"\n"+l3);

        //mostrar libro
        IO.println("\nTitulo: "+ l3.getTitulo()+"\n Ejemplares "+ l3.getN_ejemplares() +"\n Precio "+ l3.getPrecio()+ "€"
                +"\n-------------------------------------");
        IO.println("\nTitulo: "+l2.getTitulo()+"\nISBN: " +l2.getISBN()+ "\nPrecio: "+ l2.getPrecio()+ "€"
        + "\n-------------------------------------") ;
    }


    }

