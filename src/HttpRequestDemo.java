import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class HttpRequestDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://localhost/serverdemo/addrecord.php");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter your mail");
        String email = sc.nextLine();
        System.out.println("enter your address");
        String address = sc.nextLine();
        String q = "name = "+name+"&email = "+email+"&address ="+address;
        
        byte[]postData = q.getBytes(StandardCharsets.UTF_8);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        OutputStream stream = conn.getOutputStream();
        stream.write(postData);
        
        InputStream in_stream = conn.getInputStream();
        InputStreamReader r = new InputStreamReader(in_stream);
        int c;
        while((c=r.read())!=-1){
            System.out.println((char)c);
            
        }
        
    }
}
