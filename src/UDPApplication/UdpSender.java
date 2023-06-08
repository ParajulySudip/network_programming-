package UDPApplication;
import java.io.*;
import java.net.*;

public class UdpSender {

    public static void main(String[] args) throws IOException {

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter message to send: ");
        String message = userInput.readLine();
        InetAddress address = InetAddress.getByName("localhost");
        int port = 5000;

        // Send a datagram
        try ( // Create a socket
                DatagramSocket socket = new DatagramSocket()) {
            // Send a datagram
            byte[] buffer = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
            socket.send(packet);
            System.out.println("Sent message: " + message);
            // Close the socket
        }
    }
}