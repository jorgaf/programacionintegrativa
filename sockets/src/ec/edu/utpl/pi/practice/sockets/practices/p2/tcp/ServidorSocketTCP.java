package ec.edu.utpl.pi.practice.sockets.practices.p2.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocketTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("Creando socket servidor");
        ServerSocket serverSocket = new ServerSocket();
        System.out.println("Realizando el bind");
        InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
        serverSocket.bind(addr);
        System.out.println("Aceptando conexiones");
        Socket clienteConexion = serverSocket.accept();
        System.out.println("Conexión recibida");

        InputStream inStream = clienteConexion.getInputStream();
        OutputStream outStream = clienteConexion.getOutputStream();

        byte[] mensaje = new byte[25];
        inStream.read(mensaje);

        System.out.printf("Mensaje recibido: %s\n", new String(mensaje));
        System.out.println("Cerrando el nuevo socket");
        clienteConexion.close();
        System.out.println("Cerrando el socket servidor");
        inStream.close();
        outStream.close();
        serverSocket.close();
    }
}
