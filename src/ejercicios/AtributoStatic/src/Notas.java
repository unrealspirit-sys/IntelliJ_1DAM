
public class Notas {
    private  String mensaje;
    private  String fecha;
    private  String hora;
    private  boolean destacado;
    static int contador = 0;

    //GEtters & Setters


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isDestacado() {
        return destacado;
    }

    public void setDestacado(boolean destacado) {
        this.destacado = destacado;
    }
    //Constructores
    // Creamos un contador completo, con todos los parametros y el contador
    public Notas(String mensaje, String fecha, String hora, boolean destacado){
        this.mensaje=mensaje;
        this.fecha = fecha;
        this.hora = hora;
        destacado=true ;
        contador++;
    }

    public Notas( String mensaje, boolean destacado){
        this(mensaje, "hoy", "12.00", destacado);

    }
    // con this ( -aquí los parametros del constrcutor completo con valores q defino-) llama al constructor completo
    //y tmb genera el conteo aunque este constrcutor no tenga el contador, ya que está llamando al constructor completo
    public Notas ( String mensaje){
        this(mensaje, "hoy", " 12.00", false);
    }

    @Override
    public String toString() {
        return "Notas{" +
                "mensaje='" + mensaje + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", destacado=" + destacado +
                '}';
    }
}
