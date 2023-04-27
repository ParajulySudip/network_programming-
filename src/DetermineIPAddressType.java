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

public class DetermineIPAddressType {

    public static void main(String[] args) {

        String ipAddress = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";

        try {
            InetAddress address = InetAddress.getByName(ipAddress);
            if (address instanceof java.net.Inet6Address) {
                System.out.println("IPv6 address: " + ipAddress);
            } else if (address instanceof java.net.Inet4Address) {
                System.out.println("IPv4 address: " + ipAddress);
            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not determine IP address type for " + ipAddress);
        }
    }

}
