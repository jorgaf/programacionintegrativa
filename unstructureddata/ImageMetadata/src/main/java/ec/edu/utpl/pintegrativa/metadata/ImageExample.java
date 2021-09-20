package ec.edu.utpl.pintegrativa.metadata;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.image.JpegParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageExample {
    public static void main(String[] args) throws IOException, SAXException, TikaException {
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream inputstream = new FileInputStream(new File("/Users/jorgaf/Downloads/IMG_1263.jpg"));
        ParseContext pcontext = new ParseContext();

        AutoDetectParser autoParser = new AutoDetectParser();
        autoParser.parse(inputstream, handler, metadata,pcontext);
        System.out.println("Meatadatos:");
        String[] metadataNames = metadata.names();
        for(String name : metadataNames) {
            System.out.println(name + ": " + metadata.get(name));
        }
    }
}
