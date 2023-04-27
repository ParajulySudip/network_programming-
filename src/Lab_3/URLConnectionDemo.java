/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

/**
 *
 * @author acer
 */
//an example Java program that demonstrates the use of URLConnection class and its openConnection() method to establish a connection to a given URL and read its content:
import java.net.*;
import java.io.*;

public class URLConnectionDemo {
  public static void main(String[] args) throws Exception {
    URL url = new URL("https://www.example.com");
    URLConnection conn = url.openConnection();

    // Set request properties
    conn.setRequestProperty("User-Agent", "Mozilla/5.0");

    // Get response headers
    System.out.println("Response headers:");
    for (String key : conn.getHeaderFields().keySet()) {
      System.out.println(key + ": " + conn.getHeaderField(key));
    }

    // Get response body
    System.out.println("Response body:");
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
          String line;
          while ((line = reader.readLine()) != null) {
              System.out.println(line);
          } }
  }
}
/*In this program, we create a new URL object with the URL we want to connect to. 
Then we use the openConnection() method to establish a connection to that URL.
We set some request properties, such as the User-Agent header, to identify our client to the server.
We can get the response headers using getHeaderFields() method and print them to the console.
Finally, we get the response body using getInputStream() method and read it line by line using a BufferedReader.
We print each line to the console until there are no more lines to read, and then close the reader.*/