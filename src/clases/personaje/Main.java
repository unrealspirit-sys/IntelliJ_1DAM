package clases.personaje;

import static clases.personaje.Personaje.iniciarCombate;

public class Main {
    static void main() {
        Personaje p1= new Personaje("Aragorn", "Humano");
        IO.println("\n"+ p1.toString());
        Personaje p2 = new Personaje("Jurgen","Orco");
        IO.println("\n"+ p2.toString());
        Personaje p3 = new Personaje("Mordekaiser","Espiritu");
        IO.println("\n"+ p3.toString());
        Personaje p4 = new Personaje("Legolas","Elfo");
        IO.println("\n"+ p4.toString());

        //A lo largo del juego, cada uno va cambiando los valores (ver foto)
        //utilizando getter y setter
        p1.setExperiencia(100);
        p1.setVidaMaxima(130);
        IO.println("\nAragorn obtiene exp:"+p1.getExperiencia() +" y vida maxima: "+p1.getVidaMaxima());
        p2.setDaño(50);
        p2.setVidaMaxima(150);
        IO.println("Jurgen avanza y obtiene daño: "+ p2.getDaño()+" y vida máxima: "+p2.getVidaMaxima());
        p3.setVidaMaxima(165);
        p3.setMana(false);
        IO.println("Mordekaiser ha obtenido: " + p3.getVidaMaxima()+" de vida máxima pero pierde el Maná.");
        p4.setDaño(40);
        IO.println("Legolas se fuma tremenda seta y obtiene +"+p4.getDaño()+" de daño !\n");
        //EStadisticas actuales
        IO.println("p1: "+ p1+ "\np2: "+ p2+ "\np3: "+p3+"\np4: "+p4);

        //combate 1
        IO.println("--- COMBATE: " + p1.getNombre() + " vs " + p4.getNombre() + " ---");
        iniciarCombate(p1, p4);
        //combate 2
        IO.println("\n--- COMBATE: " + p2.getNombre() + " vs " + p3.getNombre() + " ---");
        iniciarCombate(p2, p3);


}
}
