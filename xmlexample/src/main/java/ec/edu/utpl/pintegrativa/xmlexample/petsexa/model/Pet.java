package ec.edu.utpl.pintegrativa.xmlexample.petsexa.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pet {
    private String name;
    private int age;

    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
