package clases.personaje;

import java.util.Random;

//Crear clase Personaje
public class Personaje {
    String nombre;
    String raza;
    int experiencia;
    int daño;
    int vidaActual;
    int vidaMaxima;
    boolean mana;
//Getter & Setters
    //Getter & Setters
    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int nuevaVida) {

        if (nuevaVida > this.vidaMaxima) {
            this.vidaActual = this.vidaMaxima;
        } else if (nuevaVida < 0) {
            this.vidaActual = 0;
        } else {
            this.vidaActual = nuevaVida;
        }
    }
    public int getVidaMaxima() {
        return vidaMaxima;
    }
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }
    public boolean isMana() {
        return mana;
    }

    public void setMana(boolean mana) {
        this.mana = mana;
    }
    //Constructor
    public Personaje(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.experiencia=10;
        this.daño=20;
        this.vidaMaxima= 100;
        this.vidaActual = this.vidaMaxima;
        this.mana= true;
    }
    //toString
    @Override
    public String toString() {
        return "personajes{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", experiencia=" + experiencia +
                ", daño=" + daño +
                ", vida=" + vidaActual + "/" + vidaMaxima +
                ", mana=" + mana +
                '}';
    }

    //Metodos de Acción
    //Aplica un ataque de atacante y retorna el daño sufrido
    public double sufrirDaño (Personaje atacante){
        double daño = atacante.daño * Math.random();
        this.vidaActual = this.vidaActual - (int) daño;
        if (vidaActual <0){
            vidaActual = 0;
            IO.println("El personaje "+getNombre()+" ha sido derrotado por "+ atacante.getNombre());
        }
        IO.println("\n"+this.nombre+" sufre "+ String.format("%.1f",daño)+" puntos de daño !");
        return daño;
    }
    //Función para recuperar vida
    // "generador" para aplicar valores random
    private static Random generador = new Random();
    //función sanar en sí
    public double sanar (){
        double porcentajeMin= 0.05;
        double porcentajeMax=0.20;
        double curaMinima = this.vidaMaxima * porcentajeMin;
        double curaMaxima = this.vidaMaxima * porcentajeMax;
        //Calcular curacion aleatoria
        double rango = curaMaxima - curaMinima;
        double curaCalculada = curaMinima + (rango * generador.nextDouble());
        //Guardar vida antes de curar en una variable
        int vidaAntes = this.vidaActual;
        //Aplicar curacion
        this.vidaActual += (int) curaCalculada;
        //La vida actual con la cura no puede superar el valor de la vida Máxima:
         if (this.vidaActual > vidaMaxima){
             this.vidaActual = this.vidaMaxima;
         }
         //Calcular la cura real, gracias a la variable de la vidaAntes:
        double curaReal = this.vidaActual - vidaAntes;
        IO.println("\n"+ this.nombre + " recupera " + String.format(" %.1f", curaReal)+" HP !");
         return curaReal;
    }

    //Función para iniciar combate
    public static void iniciarCombate(Personaje luchador1, Personaje luchador2) {

        int turno = 1;

        while (luchador1.getVidaActual() > 0 && luchador2.getVidaActual() > 0) {
            IO.println("\n--- Turno " + turno + " ---");

            // --- Turno de luchador1 (ataca a luchador2) ---
            IO.println(luchador1.getNombre() + " ataca a " + luchador2.getNombre() + "!");
            luchador2.sufrirDaño(luchador1);

            if (luchador2.getVidaActual() > 0) {
                luchador2.sanar();
            } else {
                break; // luchador2 ha muerto, fin del combate
            }

            // --- Turno de luchador2 (ataca a luchador1) ---
            IO.println(luchador2.getNombre() + " ataca a " + luchador1.getNombre() + "!");
            luchador1.sufrirDaño(luchador2);

            if (luchador1.getVidaActual() > 0) {
                luchador1.sanar();
            } else {
                break; // luchador1 ha muerto, fin del combate
            }

            IO.println(luchador1.getNombre() + " vida: " + luchador1.getVidaActual() + "/" + luchador1.getVidaMaxima());
            IO.println(luchador2.getNombre() + " vida: " + luchador2.getVidaActual() + "/" + luchador2.getVidaMaxima());

            turno++;
        }

        // Fin del Bucle ---
        IO.println("\n--- ¡Combate Terminado! ---");

        if (luchador1.getVidaActual() == 0) {
            IO.println(luchador2.getNombre() + " es el ganador!");
        } else if (luchador2.getVidaActual() == 0) {
            IO.println(luchador1.getNombre() + " es el ganador!");
        }
    }
}

