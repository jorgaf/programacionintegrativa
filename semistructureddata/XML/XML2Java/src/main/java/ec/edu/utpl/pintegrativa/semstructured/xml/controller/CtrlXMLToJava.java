package ec.edu.utpl.pintegrativa.semstructured.xml.controller;

import ec.edu.utpl.pintegrativa.semstructured.xml.model.Direccion;
import ec.edu.utpl.pintegrativa.semstructured.xml.model.Estudiante;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class CtrlXMLToJava {
    public static void main(String[] args) throws JAXBException {
        String xmlData = """
                <?xml version="1.0" encoding="UTF-8"?>
                <estudiante id="321">
                   <apellido>Piedra</apellido>
                   <direcciones>
                      <direccion type="main">
                         <calle>El Salvador</calle>
                         <ciudad>Loja</ciudad>
                         <numero>488-19</numero>
                      </direccion>
                      <direccion type="alt">
                         <calle>Juan Tanca Marengo</calle>
                         <ciudad>Guayaquil</ciudad>
                         <numero>123-654</numero>
                      </direccion>
                   </direcciones>
                   <edad>7</edad>
                   <mayorEdad>false</mayorEdad>
                   <nombre>Francisco</nombre>
                   <peso>35.5</peso>
                </estudiante>
                """;
        JAXBContext jaxbContext;
        jaxbContext = JAXBContext.newInstance(Estudiante.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xmlData);

        Estudiante estudiante = (Estudiante) unmarshaller.unmarshal(reader);
        viewEstudianteData(estudiante);
    }
    private static void viewEstudianteData(Estudiante estudiante) {
        System.out.println("Datos del estudiante:");
        System.out.printf("Id: %s\n", estudiante.getId());
        System.out.printf("%s, %s\n", estudiante.getApellido(), estudiante.getNombre());
        System.out.printf("Edad: %d años. Peso: %.2fKG. Mayor de edad: %b\n",
                estudiante.getEdad(), estudiante.getPeso(), estudiante.isMayorEdad());
        System.out.println("Direcciones");
        for(Direccion dir : estudiante.getDirecciones()) {
            System.out.println("============");
            System.out.printf("Tipo: %s\n",dir.getType());
            System.out.printf("Ciudad: %s\n",dir.getCiudad());
            System.out.printf("Calle: %s\n",dir.getCalle());
            System.out.printf("Número: %s\n",dir.getNumero());
        }
    }
}
