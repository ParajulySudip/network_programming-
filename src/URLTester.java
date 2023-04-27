import java.io.IOException;
import java.net.*;

public class URLTester {
    public static void main(String[] args) {
        String urlString = "https://www.example.com";
        
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            int responseCode = conn.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("The URL is reachable.");
            } else {
                System.out.println("The URL is not reachable. Response code: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while testing the URL: " + e.getMessage());
        }
    }
}
