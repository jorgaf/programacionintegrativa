package ec.edu.utpl.pintegrativa.xmlexample.tablesexa.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Tablas {
    @XmlElement(name = "tabla")
    private List<Tabla> tablas;

    public Tablas() {
    }

    public Tablas(List<Tabla> tablas) {
        this.tablas = tablas;
    }
}
