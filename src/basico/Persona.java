package basico;
    //Creamos la clase persona
public class Persona {
    private String nombre;      //Si ponemos private detrás de las variables, ya solo podemos acceder a ellas usando get o set
    private String apellidos;
    private String dni;
    private int edad;

        public String getNombre() {
            return nombre.toUpperCase();
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }//Set permite cambiar el valor del tipo privado

        public String getDni() {
            return dni;
        };

        //Métodos de la clase persona
    String presentar() {
        String mensaje = "Hola, soy " + getNombre() + " " + apellidos;
        if ( edad > 0) mensaje= mensaje + " tengo " + edad + " años";
         mensaje = mensaje + " y mi dni es: " + dni;
         return mensaje;
        //return "Hola, soy " + nombre + " " + apellidos + " tengo " + edad + " años y mi DNI es: " + dni;
    }
    //Método constructor

    public Persona(int edad, String dni, String apellidos, String nombre) {
        this.edad = edad;
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }
    //Constructor persona con datos mínimos
        public Persona(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
            this.apellidos= "";
            this.edad=-1;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos.substring(0,10);
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

