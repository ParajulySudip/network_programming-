import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Marshall
 */
public class ServerinSingleClass {
    public static PrintWriter printWriter=null;
    public static void main(String[] args) throws IOException {
        ServerSocket socketServer=new ServerSocket(4389);
        System.out.println("Server is waiting");
        while (true) {
            Socket sc=socketServer.accept();
            System.out.println("New request is accepted");
            printWriter=new PrintWriter(sc.getOutputStream(),true);
            new Thread(new Runnable() {
                @Override
                public void run() {
                   Date date=new Date();
                   printWriter.println(date);
                   printWriter.flush();
                }
            }).start();
                
            
            
        }
        
    }
    
}