package DAM_Programacion;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    //Getters & Setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.substring(0, 6);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //toString
    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }


    //Constructor con todos parametros menos velocidad
    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = "Desconocido";
        this.modelo = "Desconocido";
    }
    //Constructor solo matricula
    public Coche(String matricula) {
        this.matricula = matricula;
        this.marca="Desconocido";
        this.modelo="desconocido";
    }

    // Constructor con todos los parametros
    public Coche(String matricula, String marca, String modelo, String color, int velocidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;


    }
    //Metodo acelerar +10
        //No se permite acelerar a mas de 350
    public String acelerar() {
        int nuevaVelocidad = velocidad + 10;
        if (nuevaVelocidad <= 350)
            velocidad=nuevaVelocidad;
        return "Velocidad actual: " + velocidad + "km/h";
    }

     // Incremento en valor la velocidad
        public String acelerar (int valor){
            int nuevaVelocidad = velocidad + valor;
            if (nuevaVelocidad < 300)
                velocidad=nuevaVelocidad;

            return "Velocidad actual: " + velocidad + "km/h";
        }
    //Metodo freno
    public String frenar (){
        int nuevaVelocidad = velocidad -10;
        if (nuevaVelocidad >= 0)
            velocidad = nuevaVelocidad;
        return "Velocidad actual " + velocidad + "km/h";
    }
    //Decremento en valor la velocidad
        public String frenar (int valor){
           int nuevaVelocidad = velocidad - valor;
            if (nuevaVelocidad >= 0)
            velocidad = nuevaVelocidad;
            return "Velocidad actual: " + velocidad + "km/h";

        }
}



