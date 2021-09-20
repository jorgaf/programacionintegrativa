package ec.edu.utpl.pintegrativa.semistructured.json.write.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    @SerializedName(value="mayor_edad")
    private boolean mayorEdad;
    private List<Direccion> direcciones;

    public Estudiante(String nombre, String apellido, int edad, double peso, boolean mayorEdad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.mayorEdad = mayorEdad;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}

