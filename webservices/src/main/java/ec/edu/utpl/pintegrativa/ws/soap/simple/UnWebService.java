package ec.edu.utpl.pintegrativa.ws.soap.simple;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class UnWebService {
    @WebMethod
    public int suma(int a, int b) {
        return a + b;
    }
}
