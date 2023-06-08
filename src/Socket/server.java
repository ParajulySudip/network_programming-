
package Socket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class server {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main (String[]args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(3452);
        System.out.println("socket is started waiting for request");
        Socket sc = serverSocket.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        String msg = reader.readLine();
        System.out.println(msg);
    }
}

