import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetaddressType{
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            if (localhost.isAnyLocalAddress()) {
                System.out.println("The IP address is a wildcard address.");
            }
            if (localhost.isLinkLocalAddress()) {
                System.out.println("The IP address is a link-local address.");
            }
            if (localhost.isLoopbackAddress()) {
                System.out.println("The IP address is a loopback address.");
            }
            if (localhost.isMCGlobal()) {
                System.out.println("The IP address is a globally scoped multicast address.");
            }
            if (localhost.isMCLinkLocal()) {
                System.out.println("The IP address is a link-local multicast address.");
            }
            if (localhost.isMCNodeLocal()) {
                System.out.println("The IP address is a node-local multicast address.");
            }
            if (localhost.isMCOrgLocal()) {
                System.out.println("The IP address is an organization-local multicast address.");
            }
            if (localhost.isMCSiteLocal()) {
                System.out.println("The IP address is a site-local multicast address.");
            }
            if (localhost.isMulticastAddress()) {
                System.out.println("The IP address is a multicast address.");
            }
            if (localhost.isSiteLocalAddress()) {
                System.out.println("The IP address is a site-local address.");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}