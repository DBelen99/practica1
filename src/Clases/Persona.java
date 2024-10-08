package Clases;


import Interfaces.Imprimible;

public class Persona implements Imprimible {
    private String nombre;
    private String apellidos;
    private String dni;

    //constructores de la clase
    public Persona() {

    }

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
//implementamos la interface
    @Override
    public String devolverInfoString() {
        return "nombre:"+ this.nombre+" apellidos:"+this.apellidos+" dni:"+this.dni;
    }
}
