package clases.libro;

public class Libro {
    private String ISBN;
    private String titulo;
    private String categoria;
    private int n_ejemplares;
    private float precio;

    // Constructor total

    public Libro(String ISBN, String titulo, String categora, int n_ejemplares, float precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.categoria = categora;
        this.n_ejemplares = n_ejemplares;
        this.precio = precio;
    }

    // constructor minimo dos elementos

    public Libro(String ISBN, String titulo) {
        this.ISBN = ISBN;
        this.titulo = titulo;

    }

    // Getter y Setters

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategora() {
        return categoria;
    }

    public void setCategora(String categora) {
        this.categoria = categora;
    }

    public int getN_ejemplares() {
        return n_ejemplares;
    }

    public void setN_ejemplares(int n_ejemplares) {
        this.n_ejemplares = n_ejemplares;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", categora='" + categoria + '\'' +
                ", n_ejemplares='" + n_ejemplares + '\'' +
                ", precio=" + precio +
                '}';
    }
}
