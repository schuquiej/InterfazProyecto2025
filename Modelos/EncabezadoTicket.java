package Modelos;

public class EncabezadoTicket {
   private int idTicket;
    private String nombreTicket;
    private String descripcionTicket;
    private  Departamentos departamento;
    private  Prioridades prioridad;

    public int idTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String nombreTicket() {
        return nombreTicket;
    }

    public void setNombreTicket(String nombreTicket) {
        this.nombreTicket = nombreTicket;
    }

    public String descripcionTicket() {
        return descripcionTicket;
    }

    public void setDescripcionTicket(String descripcionTicket) {
        this.descripcionTicket = descripcionTicket;
    }

    public Departamentos departamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public Prioridades prioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridades prioridad) {
        this.prioridad = prioridad;
    }
}
