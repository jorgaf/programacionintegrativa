package ec.edu.utpl.pintegrativa.semistructured.json.write.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.utpl.pintegrativa.semistructured.json.write.model.Direccion;
import ec.edu.utpl.pintegrativa.semistructured.json.write.model.Estudiante;

import java.util.List;

public class CtrlWriteJSON {
    public static void main(String[] args) {
        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        var estudiante = generateData();

        String estJSON = gson.toJson(estudiante);
        System.out.println(estJSON);
    }

    private static Estudiante generateData() {
        Estudiante est = new Estudiante("Jorge", "Cabrera", 7, 45.8, false);
        List<Direccion> direcciones = List.of(
                new Direccion("Loja", "Adam Smith", "451-190"),
                new Direccion("Quito", "Napo", "87W5-6S")
                );
        est.setDirecciones(direcciones);
        return est;
    }
}
