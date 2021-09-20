package ec.edu.utpl.pintegrativa.xmlexample.tablesexa.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Campo {
    @XmlAttribute
    private int order;
    private String nombre;
    private String tipo;
    private int longitud;

    public Campo() {
    }

    public Campo(int order, String nombre, String tipo, int longitud) {
        this.order = order;
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
    }
}
