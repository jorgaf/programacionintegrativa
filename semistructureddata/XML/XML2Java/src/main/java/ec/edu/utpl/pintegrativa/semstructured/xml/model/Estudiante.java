package ec.edu.utpl.pintegrativa.semstructured.xml.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "estudiante")
@XmlAccessorType(XmlAccessType.FIELD)
public class Estudiante {
    @XmlAttribute
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private boolean mayorEdad;
    @XmlElementWrapper(name = "direcciones")
    @XmlElement(name = "direccion")
    private List<Direccion> direcciones;

    public Estudiante() {
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }
}
