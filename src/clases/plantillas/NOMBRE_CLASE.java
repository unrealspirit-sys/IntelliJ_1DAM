package clases.plantillas;

public class NOMBRE_CLASE {

    // Atributos
    private String atributo1;
    private int atributo2;
    
    // Constructor
    public NOMBRE_CLASE(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    
    // Getters y Setters
    public String getAtributo1() {
        return atributo1;
    }
    
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }
    
    // toString
    @Override
    public String toString() {
        return "NOMBRE_CLASE{" +
                "atributo1='" + atributo1 + '\'' +
                ", atributo2=" + atributo2 +
                '}';
    }
    //main
    public static void main(String[] args) {
        NOMBRE_CLASE obj = new NOMBRE_CLASE("valor1", 123);
        System.out.println("\n" + obj);
    }
}

