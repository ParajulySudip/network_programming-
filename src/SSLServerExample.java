/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sudip
 */
import javax.net.ssl.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.*;
import java.security.cert.CertificateException;

public class SSLServerExample {

    public static void main(String[] args) {
        int port = 8888; // Specify the port number you want to use
        
        try {
            // Load the keystore containing the server's private key and certificate
            String keystoreFile = "path/to/keystore.jks";
            String keystorePass = "keystore_password";
            KeyStore keystore = KeyStore.getInstance("JKS");
            keystore.load(new FileInputStream(keystoreFile), keystorePass.toCharArray());

            // Create the SSL context
            SSLContext sslContext = SSLContext.getInstance("TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
            keyManagerFactory.init(keystore, keystorePass.toCharArray());
            sslContext.init(keyManagerFactory.getKeyManagers(), null, null);

            // Create the SSL server socket factory
            SSLServerSocketFactory sslServerSocketFactory = sslContext.getServerSocketFactory();

            // Create the server socket
            ServerSocket serverSocket = sslServerSocketFactory.createServerSocket(port);

            // Accept incoming connections
            System.out.println("Server started. Listening on port " + port + "...");
            while (true) {
                SSLSocket clientSocket = (SSLSocket) serverSocket.accept();
                // Handle the client connection here
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException | UnrecoverableKeyException | KeyManagementException e) {
            e.printStackTrace();
        }
    }
}
