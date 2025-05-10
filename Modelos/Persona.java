package Modelos;

public abstract class Persona {
    String nombre;
    String apellidos;
    int edad;
    char sexo;
    String identificacion;


    public Persona(String nombre, String apellidos, int edad, char sexo, String identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.identificacion = identificacion;

    }



    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Identificacion: " + identificacion);

    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;

    }


    public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getedad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getidentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
