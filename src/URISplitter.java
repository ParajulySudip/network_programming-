import java.net.URI;

public class URISplitter {
    public static void main(String[] args) {
        try {
            String uriString = "https://www.example.com:8080/path/to/file.html?query=param#fragment";
            URI uri = new URI(uriString);
            
            String scheme = uri.getScheme();
            String host = uri.getHost();
            int port = uri.getPort();
            String path = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            
            System.out.println("Scheme: " + scheme);
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
