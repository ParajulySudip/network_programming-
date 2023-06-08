package UDPApplication;
/**
 *
 * @author Sudip
 */
import java.io.*;
import java.net.*;

public class UdpReceiver {

    public static void main(String[] args) throws IOException {

        int port = 5000;

        // Receive a datagram
        try ( // Create a socket
                DatagramSocket socket = new DatagramSocket(port)) {
            // Receive a datagram
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);
            // Close the socket
        }
    }
}