package ec.edu.utpl.pintegrativa.ws.soap.biblioteca;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class QueryService {
    @WebMethod
    public boolean exists(String code) {
        return Repository.exists(code.toUpperCase());
    }
}
