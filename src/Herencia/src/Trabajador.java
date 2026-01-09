
// sub-clase extends Superclase
public class Trabajador extends Persona{
    private String departamento;
    private float sueldo;
    private boolean discapacidad;
    //Creamos el constructor con super(...) por que la subclase tiene q heredar el constructor de la superclase
    public Trabajador(String nombre, String apellidos, String nif, int edad, String departamento, float sueldo, boolean discapacidad) {
        super(nombre, apellidos, nif, edad);
        //departamento, sueldo y discapacidad si son parametros de la subclase por eso los asignamos con this.
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.discapacidad = discapacidad;
    }




}
