package Modelos;

public class DetalleTicket {
private int idTicket;
private Tecnico tecnico;
private Adjuntos adjuntos;

    public int idTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Tecnico tecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Adjuntos adjuntos() {
        return adjuntos;
    }

    public void setAdjuntos(Adjuntos adjuntos) {
        this.adjuntos = adjuntos;
    }
}
