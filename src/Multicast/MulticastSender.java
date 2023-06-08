/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multicast;

/**
 *
 * @author Sudip
 */
import java.io.IOException;
import java.net.*;

public class MulticastSender {
    public static void main(String[] args) {
        try (MulticastSocket socket = new MulticastSocket()) {

// Create a multicast socket
                        String message = "Hello, multicast group!";
            InetAddress group = InetAddress.getByName("192.168.1.75");
            int port = 8888;

            // Set the time-to-live (TTL) for the multicast packets (0-255)
            socket.setTimeToLive(1);

            // Convert the message to bytes
            byte[] sendData = message.getBytes();

            // Create a datagram packet to send
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, group, port);

            // Send the packet to the multicast group
            socket.send(sendPacket);

            System.out.println("Message sent to the multicast group.");
        } catch (IOException e) {
        }
    }
}
