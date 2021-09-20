package ec.edu.utpl.pintegrativa.ws.soap.biblioteca;

import jakarta.xml.ws.Endpoint;

public class ServerTest {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/biblioteca/qryservice",
                new QueryService());
    }
}
