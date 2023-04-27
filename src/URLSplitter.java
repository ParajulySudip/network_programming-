import java.net.URL;

public class URLSplitter {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.example.com:8080/path/to/file.html?query=param#fragment";
            URL url = new URL(urlString);
            
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String path = url.getPath();
            String query = url.getQuery();
            String fragment = url.getRef();
            
            System.out.println("Protocol: " + protocol);
            System.out.println("Host: " + host);
            System.out.println("Port: " + port);
            System.out.println("Path: " + path);
            System.out.println("Query: " + query);
            System.out.println("Fragment: " + fragment);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
