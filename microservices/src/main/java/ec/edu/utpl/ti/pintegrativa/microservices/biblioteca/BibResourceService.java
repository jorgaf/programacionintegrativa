package ec.edu.utpl.ti.pintegrativa.microservices.biblioteca;

import io.helidon.common.http.Http;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import java.util.Collections;

public class BibResourceService implements Service {
    private BibRepository repository;
    private static final JsonBuilderFactory JSON =
            Json.createBuilderFactory(Collections.emptyMap());

    public BibResourceService(BibRepository repository) {
        this.repository = repository;
    }

    @Override
    public void update(Routing.Rules rules) {
        rules.get("/{code}", this::getResourceById);
    }

    private void getResourceById(ServerRequest request, ServerResponse response) {
        String code = request.path().param("code").toUpperCase();
        boolean exists = repository.exists(code);
        if (exists) {
            JsonObject returnObject = JSON.createObjectBuilder()
                    .add("code", code)
                    .add("exist", exists)
                    .build();
            response.send(returnObject);
        } else {
            response.status(Http.Status.NOT_FOUND_404).send();
            System.out.println("No hay nada");
        }
    }
}
