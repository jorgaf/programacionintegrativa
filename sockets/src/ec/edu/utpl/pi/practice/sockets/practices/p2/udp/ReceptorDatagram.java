package ec.edu.utpl.pi.practice.sockets.practices.p2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class ReceptorDatagram {
    public static void main(String[] args) throws IOException {
        System.out.println("Creando socket datagram");
        InetSocketAddress address = new InetSocketAddress("localhost", 5555);
        DatagramSocket datagramSocket = new DatagramSocket(address);
        System.out.println("Recibiendo mensaje");

        byte[] mensaje = new byte[25];
        DatagramPacket datagram = new DatagramPacket(mensaje, 25);
        datagramSocket.receive(datagram);
        System.out.printf("Mensaje recibido: %s\n", new String(mensaje));

        System.out.println("Cerrando el socket datagram");
        datagramSocket.close();
        System.out.println("Terminado");
    }
}
