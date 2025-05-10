package Modelos;

import java.util.List;

public class Roles {
    private int idRole;
    private String nombreRole;
    private String descripcionRole;
    private List<Permisos> listaPermisos;

    public int idRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String nombreRole() {
        return nombreRole;
    }

    public void setNombreRole(String nombreRole) {
        this.nombreRole = nombreRole;
    }

    public String descripcionRole() {
        return descripcionRole;
    }

    public void setDescripcionRole(String descripcionRole) {
        this.descripcionRole = descripcionRole;
    }

    public List<Permisos> listaPermisos() {
        return listaPermisos;
    }

    public void setListaPermisos(List<Permisos> listaPermisos) {
        this.listaPermisos = listaPermisos;
    }
}
