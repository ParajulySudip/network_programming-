import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
public class NetworkInterfacesDemo {
    public static void main(String[]args) throws SocketException, UnknownHostException{
        Enumeration<NetworkInterface> ips=NetworkInterface.getNetworkInterfaces();
        while(ips.hasMoreElements()){
            NetworkInterface ip=ips.nextElement();
            System.out.println(ip);
        }
        NetworkInterface e=NetworkInterface.getByName("eth1");
        System.out.println(e.getDisplayName());
        
        
        InetAddress myip=InetAddress.getLocalHost();
        NetworkInterface m=NetworkInterface.getByInetAddress(myip);
        System.out.println(m.getDisplayName());
    }
    
}
