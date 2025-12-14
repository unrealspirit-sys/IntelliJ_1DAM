public class Area_y_perimetro {
    private double base; // longitud
    private double altura;// ancho

    // constructor
    public Area_y_perimetro(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    // metodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 + (base + altura);
    }

    // main
    static void main() {
        var rectangulo = new Area_y_perimetro(4, 8);
        IO.println(" ");
        IO.println("Area: " + rectangulo.calcularArea());
        IO.println("Perimetro: " + rectangulo.calcularPerimetro());
    }

}
