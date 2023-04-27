

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;


public class SocketDemo {
    public static void main(String[] args) {
        try {
            SocketAddress scAdd;
            try (//            Socket sc= new Socket();  // empty socket
//            //SocketAddress class(server address represent)
//            SocketAddress add=new InetSocketAddress("s1.yahoo.com",1233);
//            sc.connect(add); //connection request sent
//            sc.close();
//
            //getting information about the socket
                    Socket sc2 = new Socket("localhost",3452)) {
                scAdd = sc2.getRemoteSocketAddress();
            }
            System.out.println(scAdd);
            
            //new Socket
            Socket sc3= new Socket();
            sc3.connect(scAdd); //reconnect with new socket
            
        } catch (IOException e) {
        }
    }
    
}