package Modelos;

public class Adjuntos {
    private int idTicket;
    private String nombreAdjunt;
    private String rutaAdjunto;

    public int idTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String nombreAdjunt() {
        return nombreAdjunt;
    }

    public void setNombreAdjunt(String nombreAdjunt) {
        this.nombreAdjunt = nombreAdjunt;
    }

    public String rutaAdjunto() {
        return rutaAdjunto;
    }

    public void setRutaAdjunto(String rutaAdjunto) {
        this.rutaAdjunto = rutaAdjunto;
    }
}
