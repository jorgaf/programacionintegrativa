package ec.edu.utpl.pintegrativa.ws.soap.simple;

import jakarta.xml.ws.Endpoint;

public class CtrlUnWebService {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/UnWebService", new UnWebService());
    }
}
