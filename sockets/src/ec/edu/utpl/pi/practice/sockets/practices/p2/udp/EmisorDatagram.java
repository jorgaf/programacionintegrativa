package ec.edu.utpl.pi.practice.sockets.practices.p2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EmisorDatagram {
    public static void main(String[] args) throws IOException {
        System.out.println("Creando socket datagram");
        DatagramSocket datagramSocket = new DatagramSocket();

        System.out.println("Enviando mensaje");
        String mensaje = "mensaje desde el emisor";

        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket datagram = new DatagramPacket(mensaje.getBytes(),mensaje.getBytes().length, address, 5555);
        datagramSocket.send(datagram);

        System.out.println("Mensaje enviado");
        System.out.println("Cerrando el socket datagram");
        datagramSocket.close();
        System.out.println("Terminado");
    }
}