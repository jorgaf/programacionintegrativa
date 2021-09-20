package ec.edu.utpl.pintegrativa.structureddata.jdbc;

import java.sql.*;

public class JDBCPractice {
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
        try (Connection conn = DriverManager.getConnection(dbURL, "root", "")) {
            PreparedStatement selectStatement = conn.prepareStatement(selectQry);
            ResultSet rs = selectStatement.executeQuery();

            while (rs.next()) {
                System.out.printf(frmtOutput,
                        rs.getString("apellido"),
                        rs.getString("ciudad"),
                        rs.getString("calle"));
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
    }
}
