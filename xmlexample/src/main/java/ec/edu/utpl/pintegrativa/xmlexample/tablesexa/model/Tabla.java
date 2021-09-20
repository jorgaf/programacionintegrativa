package ec.edu.utpl.pintegrativa.xmlexample.tablesexa.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Tabla {
    @XmlAttribute
    private int order;
    private String nombre;
    @XmlElementWrapper(name = "campos")
    @XmlElement(name="campo")
    private List<Campo> campos;

    public Tabla() {
    }

    public Tabla(int order, String nombre, List<Campo> campos) {
        this.order = order;
        this.nombre = nombre;
        this.campos = campos;
    }
}
