package ec.edu.utpl.pintegrativa.semistructured.xml.controller;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;

public class CtrlDOMXPath {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
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
        String xPahtExpression = "/estudiante/apellido";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xmlData));
        Document document = builder.parse(is);
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodos = (NodeList) xPath.evaluate(xPahtExpression, document, XPathConstants.NODESET);
        for(int i = 0; i < nodos.getLength(); i ++) {
            System.out.printf("%s: %s\n",
                    nodos.item(i).getNodeName(),
                    nodos.item(i).getTextContent());
        }
    }
}
