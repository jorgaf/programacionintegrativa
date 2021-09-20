package ec.edu.utpl.pintegrativa.xmlexample.tablesexa.controller;

import ec.edu.utpl.pintegrativa.xmlexample.tablesexa.model.Campo;
import ec.edu.utpl.pintegrativa.xmlexample.tablesexa.model.Tabla;
import ec.edu.utpl.pintegrativa.xmlexample.tablesexa.model.Tablas;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.List;

public class TablasXMLGenerator {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Tablas.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        Campo campo1 = new Campo(1, "Nombre", "Char", 50);
        Campo campo2 = new Campo(2, "Apellidos", "Char", 100);
        Campo campo3 = new Campo(3, "dni", "Char", 10);
        List<Campo> camposT1 = List.of(campo1, campo2, campo3);

        Tabla tabla1 = new Tabla(1, "tabla1", camposT1);

        List<Campo> camposT2 = List.of(
                new Campo(1, "Código", "Int", 50),
                new Campo(2, "Nombre", "Char", 100),
                new Campo(3, "Descripción", "Char", 10));

        Tabla tabla2 = new Tabla(2, "tabla2", camposT2);

        Tablas tablas = new Tablas(List.of(tabla1, tabla2));

        marshaller.marshal(tablas, new File("tablas.xml"));
    }
}