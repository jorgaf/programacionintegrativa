package ec.edu.utpl.pintegrativa.jpa.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Estudiante {
    @Id
    private int id;
    private String code;
    private String apellido;
    private String nombre;
    private Integer edad;
    private Integer peso;
    @Column(name = "mayor_edad")
    private Byte mayorEdad;
    @OneToMany(mappedBy = "estudiante")
    private Collection<Direccion> direcciones;

    //Get y Set por cada atributo

    //@Id
    //@Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //@Basic
    //@Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //@Basic
    //@Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //@Basic
    //@Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //@Basic
    //@Column(name = "edad")
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    //@Basic
    //@Column(name = "peso")
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    //@Basic
    //@Column(name = "mayor_edad")
    public Byte getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(Byte mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estudiante that = (Estudiante) o;

        if (id != that.id) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (edad != null ? !edad.equals(that.edad) : that.edad != null) return false;
        if (peso != null ? !peso.equals(that.peso) : that.peso != null) return false;
        if (mayorEdad != null ? !mayorEdad.equals(that.mayorEdad) : that.mayorEdad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        result = 31 * result + (mayorEdad != null ? mayorEdad.hashCode() : 0);
        return result;
    }

    //@OneToMany(mappedBy = "estudiante")
    public Collection<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Collection<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
}
