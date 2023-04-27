import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class ProxyDemo {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.example.com";
            URL url = new URL(urlString);
            
            String proxyHost = "192.168.1.100";
            int proxyPort = 8080;
            InetSocketAddress proxyAddress = new InetSocketAddress(proxyHost, proxyPort);
            Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyAddress);
            
            HttpURLConnection conn = (HttpURLConnection)url.openConnection(proxy);
            conn.setRequestMethod("GET");
            
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            
        } catch (IOException e) {
        }
    }
}
