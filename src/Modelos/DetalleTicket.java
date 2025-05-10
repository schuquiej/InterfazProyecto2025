package Modelos;

public class DetalleTicket {



    private final int id;
    private final String titulo;
    private final String departamento;
    private final String tecnico;
    private final String detalle;

    public DetalleTicket(int id, String titulo, String departamento, String tecnico, String detalle) {
        this.id = id;
        this.titulo = titulo;
        this.departamento = departamento;
        this.tecnico = tecnico;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTecnico() {
        return tecnico;
    }

    public String getDetalle() {
        return detalle;
    }
}