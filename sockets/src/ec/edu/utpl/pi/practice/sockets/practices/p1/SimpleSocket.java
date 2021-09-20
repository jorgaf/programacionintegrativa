package ec.edu.utpl.pi.practice.sockets.practices.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class SimpleSocket {
    public static void main(String[] args) throws  IOException {
        var serverName = "j4loxa.com";
        Socket socket = new Socket(serverName, 80);
        PrintStream out = new PrintStream( socket.getOutputStream() );
        BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream()) );

        out.print("GET /index.html HTTP/1.1\r\n");
        out.printf("Host: %s\r\n", serverName);
        out.print("\r\n");

        String line = in.readLine();
        while ( line != null ) {
            System.out.println(line);
            line = in.readLine();
        }

        in.close();
        out.close();
        socket.close();
    }
}
