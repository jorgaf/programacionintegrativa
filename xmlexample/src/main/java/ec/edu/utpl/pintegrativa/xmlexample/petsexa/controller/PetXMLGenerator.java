package ec.edu.utpl.pintegrativa.xmlexample.petsexa.controller;

import ec.edu.utpl.pintegrativa.xmlexample.petsexa.model.Pet;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class PetXMLGenerator {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Pet.class);
        Marshaller marshaller  = context.createMarshaller();
        marshaller.marshal(new Pet("Gaudí", 2), new File("gaudi.xml"));
    }
}
