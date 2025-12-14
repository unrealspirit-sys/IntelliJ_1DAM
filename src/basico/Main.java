package basico;

public class Main {
    static void main(String[] args) {

        Persona p = new Persona ( 38, "6969690C", "Bahamonde escobar gabiria", "Franco");
        p.setNombre("Remigio");
        p.setApellidos(p.getApellidos());
        IO.println(p.presentar());

        Persona p2 = new Persona (23, "22222X", "Ruiz", "Ana");
        p2.setApellidos("Ruiz Jimenez");
        IO.println (p2.presentar());

        Persona p3 = new Persona("victor", "01010169k");


    }
}
