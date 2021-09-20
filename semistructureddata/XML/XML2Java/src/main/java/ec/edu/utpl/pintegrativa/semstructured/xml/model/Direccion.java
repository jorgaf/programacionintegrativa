package ec.edu.utpl.pintegrativa.semstructured.xml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "direccion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Direccion {
    @XmlAttribute
    private String type;
    private String calle;
    private String ciudad;
    private String numero;

    public Direccion() {
    }

    public String getType() {
        return type;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNumero() {
        return numero;
    }
}
