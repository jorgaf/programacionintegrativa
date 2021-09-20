package ec.edu.utpl.pintegrativa.metadata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class PDFExample {
    public static void main(String[] args) throws IOException, SAXException, TikaException {
        BodyContentHandler handler = new BodyContentHandler(-1);
        PDFParser parser = new PDFParser();
        Metadata metadata = new Metadata();
        ParseContext pcontext = new ParseContext();
        InputStream stream = new FileInputStream(new File("/Users/jorgaf/Library/Mobile Documents/com~apple~CloudDocs/Proyectos/ninja-projects/planesacademicos/src/main/java/assets/pdffiles/5110_T5_PRE-TNCCO203.pdf"));
        parser.parse(stream, handler, metadata, pcontext);
        System.out.printf("Document Content:\n%s\n", handler);
        System.out.println("Document Metadata:");
        String[] metadataNames = metadata.names();
        for (String name : metadataNames) {
            System.out.printf("%s: %s\n", name, metadata.get(name));
        }

    }
}