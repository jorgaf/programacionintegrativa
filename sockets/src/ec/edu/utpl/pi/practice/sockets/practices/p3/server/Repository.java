package ec.edu.utpl.pi.practice.sockets.practices.p3.server;

import java.util.List;

public class Repository {
    private static List<String> dataBase;
    static {
        dataBase = List.of("ABC","DEF", "GHI", "JKL", "MNO", "PQR", "STU", "VWX","YZ");
    }

    public static boolean exists(String code) {
        return dataBase.contains(code);
    }
}
