/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
   import java.net.InetAddress;
import java.net.UnknownHostException;
public class PrintIPAddress {
 



    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP address: " + address.getHostAddress());
        } catch (UnknownHostException ex) {
            System.out.println("Could not find IP address of this machine.");
        }
    }
}