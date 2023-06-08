/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureSocket;

/**
 *
 * @author sudip
 */
import javax.net.ssl.*;
import java.io.*;
import java.security.*;

public class SecureServerSocketExample {

    private static final int PORT = 1234;
    private static final String KEYSTORE_PATH = "/path/to/keystore.jks";
    private static final String TRUSTSTORE_PATH = "/path/to/truststore.jks";
    private static final String KEYSTORE_PASSWORD = "keystore_password";
    private static final String TRUSTSTORE_PASSWORD = "truststore_password";

    public static void main(String[] args) throws Exception {

        // Create an SSL context
        SSLContext sslContext = SSLContext.getInstance("TLS");

        // Initialize the SSL context with key and trust managers
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        InputStream keystoreInputStream = new FileInputStream(KEYSTORE_PATH);
        keyStore.load(keystoreInputStream, KEYSTORE_PASSWORD.toCharArray());
        keyManagerFactory.init(keyStore, KEYSTORE_PASSWORD.toCharArray());
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        InputStream truststoreInputStream = new FileInputStream(TRUSTSTORE_PATH);
        trustStore.load(truststoreInputStream, TRUSTSTORE_PASSWORD.toCharArray());
        trustManagerFactory.init(trustStore);
        sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), new SecureRandom());

        // Create an SSL server socket factory
        SSLServerSocketFactory socketFactory = sslContext.getServerSocketFactory();

        // Create an SSL server socket
        SSLServerSocket serverSocket = (SSLServerSocket) socketFactory.createServerSocket(PORT);

        // Configure the SSL server socket
        String[] enabledCipherSuites = serverSocket.getSupportedCipherSuites();
        serverSocket.setEnabledCipherSuites(enabledCipherSuites);
        serverSocket.setNeedClientAuth(true);

        // Listen for incoming connections
        System.out.println("Server listening on port " + PORT);
        SSLSocket socket = (SSLSocket) serverSocket.accept();
        System.out.println("Client connected");

        // Perform the SSL/TLS handshake
        socket.startHandshake();

        // Use the secure connection
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello, client!");
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = in.readLine();
        System.out.println("Client says: " + message);

        // Close the socket and server socket
        socket.close();
        serverSocket.close();
    }
}