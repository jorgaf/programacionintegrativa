package ec.edu.utpl.ti.pintegrativa.microservices.biblioteca;

import java.util.List;

public class BibRepository {
    private static List<String> dataBase;
    static {
        dataBase = List.of("ABC","DEF", "GHI", "JKL", "MNO", "PQR", "STU", "VWX","YZ");
    }

    public static boolean exists(String code) {
        return dataBase.contains(code);
    }
}
