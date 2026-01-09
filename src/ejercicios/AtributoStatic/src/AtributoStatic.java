package ejercicios.AtributoStatic.src;

public class AtributoStatic {
public void main() {
    var notadeJosemi = new Notas("Comida con Luis", "08.12.26", "15:00", true);
    var notadeLuis = new Notas("EStudiar Java");
    var notadeGrego = new Notas("disfrutar", " 10.12.26", "20.00", true);
    var notaRandom = new  Notas("Hola");

   IO.println("Tienes "+ Notas.contador +" notas");
   IO.println(notadeLuis);
    }
}

