package ec.edu.utpl.pintegrativa.semistructured.json.read.controller;

import com.google.gson.Gson;
import ec.edu.utpl.pintegrativa.semistructured.json.read.model.Estudiante;

public class CtrlReadJSON {
    public static void main(String[] args) {
        String json = """
                {
                  "nombre": "Josúe",
                  "apellido": "Piedra",
                  "edad": 7,
                  "peso": 35.5,
                  "mayor_edad": false,
                  "direcciones": [
                    {
                      "ciudad": "Loja",
                      "calle": "El Salvador",
                      "numero": "488-19"
                    },
                    {
                      "ciudad": "Guayaquil",
                      "calle": "Juan Tanca Marengo",
                      "numero": "123-654"
                    }
                  ]
                }
                """;
        Gson gson = new Gson();
        Estudiante est = gson.fromJson(json, Estudiante.class);
        System.out.printf("Apellido: %s\tNombre:%s\n",
                est.getApellido(),
                est.getNombre() );
    }
}
