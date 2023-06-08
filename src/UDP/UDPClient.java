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

public class UDPClient {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {

// Create a socket
                        String message = "Hello, server!";
            InetAddress serverAddress = InetAddress.getByName("198.168.1.75");
            int serverPort = 12345;

            // Convert the message to bytes
            byte[] sendData = message.getBytes();

            // Create a datagram packet to send
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            // Send the packet
            socket.send(sendPacket);

            System.out.println("Message sent to the server.");

            // Receive the response from the server
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Response from the server: " + response);
        } catch (IOException e) {
        }
    }
}
