package ec.edu.utpl.pi.practice.sockets.practices.p3.client;

import java.io.IOException;

public class SPAController {
    public static void main(String[] args) {
        SPAClient client = new SPAClient();
        client.startConnection("localhost", 5555);
        try {
            System.out.printf("El código ABC existe? %b\n", client.verifyCode("ABC"));
            System.out.printf("El código DEF existe? %b\n", client.verifyCode("DEF"));
            System.out.printf("El código A1B existe? %b\n", client.verifyCode("A1B"));
            client.stop();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
