
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class ServerCommunicationDemoThroughGET {
    public static void main(String[] args) throws MalformedURLException, IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter your email");
        String email = sc.nextLine();
        
        URL url = new URL("https:localhost/serverdemo?fullname="+name+"&email="+email);
        URLConnection conn = url.openConnection();
        InputStream stream = conn.getInputStream(); 
        InputStreamReader  r = new InputStreamReader(stream);
        
        int c;
        while ((c= r.read())!= -1){
            System.out.println((char) c);
        }
        
    }
}