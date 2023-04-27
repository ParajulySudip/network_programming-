import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HTMLRetriever {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.example.com";
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder html = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                html.append(inputLine);
            }
            
            in.close();
            
            System.out.println(html.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
