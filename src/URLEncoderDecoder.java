import java.net.URLEncoder;
import java.net.URLDecoder;

public class URLEncoderDecoder {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.example.com/search?q=java programming";
            
            // URL encode the query string
            String encodedQueryString = URLEncoder.encode(urlString, "UTF-8");
            System.out.println("Encoded URL: " + encodedQueryString);
            
            // URL decode the query string
            String decodedQueryString = URLDecoder.decode(encodedQueryString, "UTF-8");
            System.out.println("Decoded URL: " + decodedQueryString);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
