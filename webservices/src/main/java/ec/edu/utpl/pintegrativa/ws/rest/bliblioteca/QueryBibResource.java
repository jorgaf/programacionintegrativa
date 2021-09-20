package ec.edu.utpl.pintegrativa.ws.rest.bliblioteca;

import com.google.gson.Gson;
import ec.edu.utpl.pintegrativa.ws.soap.biblioteca.Repository;

import static spark.Spark.*;

public class QueryBibResource {
    public static void main(String[] args) {
        before((request, response) -> {
            if (!request.headers("Accept").equalsIgnoreCase("application/json")) {
                halt(406);
            }
        });

        get("/bibresource/:code", (request, response) -> {
            Gson gson = new Gson();
            var code = request.params(":code").toUpperCase();
            var exists = Repository.exists(code);
            BibResponse bibResponse = new BibResponse(code, exists);

            if (exists) {
                response.status(200);
            } else {
                response.status(400);
            }
            response.type("application/json");

            return gson.toJson(bibResponse);
        });
    }
}
