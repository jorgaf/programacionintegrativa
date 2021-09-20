package ec.edu.utpl.pi.practice.sockets.practices.p3.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SPAClient {
    private static final Logger LOG = Logger.getLogger("LOGGER_SPAClient");

    private Socket clientSocket;
    private DataInputStream in;
    private DataOutputStream out;

    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
        LOG.log(Level.INFO, "Connected");
    }

    public boolean verifyCode(String code) throws IOException {
        out.writeUTF(code);
        return in.readBoolean();
    }

    public void stop() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
        }
    }
}
