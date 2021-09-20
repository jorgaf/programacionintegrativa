package ec.edu.utpl.pintegrativa.jdbi.controller;

import ec.edu.utpl.pintegrativa.jdbi.model.StudentAddress;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class JDBIExample {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost/P_INTEGRATIVA";
        String selectQry = """
                SELECT e.`apellido`, d.`ciudad`, d.`calle`
                FROM DIRECCION d, ESTUDIANTE e
                WHERE d.`type` = "main"
                AND d.`estudiante_id` = e.`id`                                
                """;
        String frmtOutput = """
                Apellido: %s
                Ciudad: %s
                Calle: %s
                """;

        Jdbi jdbi = Jdbi.create(dbURL, "root", "");
        List<StudentAddress> data = jdbi.withHandle(handle ->
                handle.createQuery(selectQry)
                        .mapToBean(StudentAddress.class)
                        .list());
        for (StudentAddress sa : data) {
            System.out.printf(frmtOutput,
                    sa.getApellido(),
                    sa.getCiudad(),
                    sa.getCalle());
        }
    }
}