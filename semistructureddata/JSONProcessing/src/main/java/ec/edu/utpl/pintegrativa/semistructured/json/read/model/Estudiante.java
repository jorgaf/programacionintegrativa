package ec.edu.utpl.pintegrativa.semistructured.json.read.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    @SerializedName(value = "mayor_edad")
    private boolean mayorEdad;
    private List<Direccion> direcciones;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, double peso, boolean mayorEdad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.mayorEdad = mayorEdad;
    }
    //Set y get de todos los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
}

