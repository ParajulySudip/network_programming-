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
import java.util.Scanner;

public class FindHostname {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.next();

        try {
            InetAddress address = InetAddress.getByName(ipAddress);
            String hostname = address.getHostName();
            System.out.println("Hostname: " + hostname);
        } catch (UnknownHostException ex) {
            System.out.println("Could not find the hostname for the given IP address.");
        }
    }

    
}
