package Modelos;

import java.time.LocalDateTime;

public class ConfiguracionSistema {
private int idSistema;
String nombreEmpresa;
String rutaLogo;
int idIdioma;
LocalDateTime fechaHoraActua;
int diasBencimiento;


    public int getidSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    public String getnombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getrutaLogo() {
        return rutaLogo;
    }

    public void setRutaLogo(String rutaLogo) {
        this.rutaLogo = rutaLogo;
    }

    public int getidIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public LocalDateTime getfechaHoraActua() {
        return fechaHoraActua;
    }

    public void setFechaHoraActua(LocalDateTime fechaHoraActua) {
        this.fechaHoraActua = fechaHoraActua;
    }

    public int getdiasBencimiento() {
        return diasBencimiento;
    }

    public void setDiasBencimiento(int diasBencimiento) {
        this.diasBencimiento = diasBencimiento;
    }
}
