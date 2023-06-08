/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multicast;

/**
 *
 * @author sudip
 */
import java.io.IOException;
import java.net.*;

public class MulticastReceiver {
    public static void main(String[] args) {
        MulticastSocket socket = null;
        try {
            // Create a multicast socket bound to the multicast group and port
            InetAddress group = InetAddress.getByName("192.168.1.75");
            int port = 8888;
            socket = new MulticastSocket(port);

            // Join the multicast group
            socket.joinGroup(group);

            byte[] receiveData = new byte[1024];

            while (true) {
                // Receive the packet from the multicast group
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Message received from multicast group: " + message);
            }
        } catch (IOException e) {
        } finally {
            if (socket != null) {
                try {
                    // Leave the multicast group and close the socket
                    InetAddress group = InetAddress.getByName("239.0.0.1");
                    socket.leaveGroup(group);
                    socket.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
