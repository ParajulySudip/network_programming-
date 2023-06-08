/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureSocket;

/**
 *
 * @author sudip
 */
import java.io.*;


import javax.net.ssl.*;




public class SecureClientSocketExample {

   public static void main(String[] args) {

      try {

         // Create an SSL context

         SSLContext sslContext = SSLContext.getInstance("TLS");




         // Initialize the SSL context with the default key and trust managers

         sslContext.init(null, null, new java.security.SecureRandom());




         // Create a socket factory from the SSL context

         SSLSocketFactory socketFactory = sslContext.getSocketFactory();




         // Create a socket to connect to the server

         SSLSocket socket = (SSLSocket) socketFactory.createSocket("192.168.1.75", 8000);




         // Perform SSL handshake

         socket.startHandshake();




         // Send data to the server

         PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

         out.println("Hello, server!");

         out.flush();




         // Read data from the server

         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

         String response = in.readLine();

         System.out.println("Server response: " + response);




         // Close the socket

         socket.close();

      } catch (Exception e) {

         e.printStackTrace();

      }

   }

}