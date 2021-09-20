package ec.edu.utpl.pi.practice.sockets.practices.p3.server;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BibliotecaServer {
    private static final Logger LOG = Logger.getLogger("LOGGER_BIB");
    private ServerSocket serverSocket;

    public void start(int port) {
        InetSocketAddress addr = new InetSocketAddress("localhost", port);
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(addr);
            while (true) {
                handlerRequest(serverSocket.accept());
            }
        } catch (IOException e) {
            e.printStackTrace();
            LOG.log(Level.SEVERE, e.getMessage());
        }
    }

    private void handlerRequest(Socket clientSocket) throws IOException {
        LOG.log(Level.INFO, "Ready to query");
        DataOutputStream out = new
                DataOutputStream(clientSocket.getOutputStream());
        DataInputStream in =
                new DataInputStream(clientSocket.getInputStream());

        while ( clientSocket.isConnected() && !clientSocket.isClosed() ) {
            try {
                String code = in.readUTF();
                LOG.log(Level.INFO, "code: " + code);
                out.writeBoolean(Repository.exists(code.toUpperCase()));
            } catch (EOFException eofex) {
                LOG.log(Level.INFO, "End messages");
                break;
            }
        }
        in.close();
        out.close();
        clientSocket.close();
        LOG.log(Level.INFO, "Closing everything");
    }

    public static void main(String[] args) {
        BibliotecaServer bibServer = new BibliotecaServer();
        bibServer.start(5555);
    }
}