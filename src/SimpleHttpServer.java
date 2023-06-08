import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        int port = 8000;

        // Create a new HTTP server
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // Create a new handler for the root path
        server.createContext("/", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<h1> ramro garis</h1>";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
                // Create a new handler for the root path
        server.createContext("/about", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<h1> this is about page</h1>";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
                        // Create a new handler for the root path
        server.createContext("/contact", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<h1> this is contact page</h1>";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });


        // Start the server
        server.start();

        System.out.println("Server started on port " + port);
    }
}
