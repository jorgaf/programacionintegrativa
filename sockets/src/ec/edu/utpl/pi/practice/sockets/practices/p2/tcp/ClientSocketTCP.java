package ec.edu.utpl.pi.practice.sockets.practices.p2.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocketTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("Creando socket cliente");
        Socket clienteSocket = new Socket();
        System.out.println("Estableciendo conexión");
        InetSocketAddress address = new InetSocketAddress("localhost", 5555);
        clienteSocket.connect(address);
        InputStream inStream = clienteSocket.getInputStream();
        OutputStream outStream = clienteSocket.getOutputStream();
        System.out.println("Enviando mensaje");
        String mensaje = "Mensaje desde el cliente";
        outStream.write(mensaje.getBytes());
        System.out.println("Mensaje enviado");
        System.out.println("Cerrando el socket cliente");
        clienteSocket.close();
        System.out.println("Terminado");
    }
}
