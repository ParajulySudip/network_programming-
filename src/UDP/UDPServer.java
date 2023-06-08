/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP;

/**
 *
 * @author sudip
 */
import java.io.IOException;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(12345)) {

// Create a socket
                        byte[] receiveData = new byte[1024];

            while (true) {
                // Receive the packet from the client
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Message received from client: " + message);

                // Process the message (optional)
                String response = "Hello, client!";

                // Convert the response to bytes
                byte[] sendData = response.getBytes();

                // Get the client's address and port from the received packet
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                // Create a datagram packet to send
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);

                // Send the response packet to the client
                socket.send(sendPacket);

                System.out.println("Response sent to client.");
            }
        } catch (IOException e) {
        }
    }
}
