package ec.edu.utpl.pintegrativa.jpa.entity;

import javax.persistence.*;

@Entity
public class Direccion {
    @Id
    private int id;
    private String type;
    private String ciudad;
    private String calle;
    private String numero;
    @ManyToOne
    @JoinColumn(name = "estudiante_id", referencedColumnName = "id")
    private Estudiante estudiante;

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
    //@Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //@Basic
    //@Column(name = "ciudad")
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //@Basic
    //@Column(name = "calle")
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    //@Basic
    //@Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direccion direccion = (Direccion) o;

        if (id != direccion.id) return false;
        if (type != null ? !type.equals(direccion.type) : direccion.type != null) return false;
        if (ciudad != null ? !ciudad.equals(direccion.ciudad) : direccion.ciudad != null) return false;
        if (calle != null ? !calle.equals(direccion.calle) : direccion.calle != null) return false;
        if (numero != null ? !numero.equals(direccion.numero) : direccion.numero != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (ciudad != null ? ciudad.hashCode() : 0);
        result = 31 * result + (calle != null ? calle.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        return result;
    }

    //@ManyToOne
    //@JoinColumn(name = "estudiante_id", referencedColumnName = "id")
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
