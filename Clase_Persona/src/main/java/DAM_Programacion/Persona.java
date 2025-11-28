package DAM_Programacion;

public class Persona {
    private String nombre;
    private String apellidos;
    private String nif;
    private int edad;
    public static int contador;//<-- un static antes del tipo  de variable deja un solo valor para todas las instancias
    public static int MAX_EDAD = 130;
    public Persona(String nombre, String apellidos, String nif, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.edad = edad;
    }

    public Persona(String nombre, String nif) {
        this.nombre = nombre;
        this.apellidos = "Desconocido";
        this.nif = nif;
        this.edad = -1;
    }



    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif.toUpperCase();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String presentar() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                //", edad=" + edad +
                '}';
    }
}