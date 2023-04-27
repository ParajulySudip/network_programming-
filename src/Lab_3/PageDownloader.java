/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

/**
 *
 * @author acer
 */
import java.net.*;
import java.io.*;

public class PageDownloader {
  public static void main(String[] args) throws Exception {
    URL url = new URL("https://www.example.com");
    URLConnection conn = url.openConnection();

    // Set request properties
    conn.setRequestProperty("User-Agent", "Mozilla/5.0");

    // Get content type
    String contentType = conn.getContentType();
    System.out.println("Content Type: " + contentType);

    // Get content length
    int contentLength = conn.getContentLength();
    System.out.println("Content Length: " + contentLength);

    // Get last modified time
    long lastModified = conn.getLastModified();
    System.out.println("Last Modified: " + lastModified);

      try ( // Read response body
              BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
          String line;
          while ((line = reader.readLine()) != null) {
              System.out.println(line);
          } }
  }
}
/*
In this program, we create a new URL object with the URL we want to download. 
Then we use the openConnection() method to establish a connection to that URL.

We set some request properties, such as the User-Agent header, to identify our client to the server.

Next, we retrieve and print the content type, content length and last modified time of the webpage
using getContentType(), getContentLength() and getLastModified() methods of URLConnection.

Finally, we read the response body using getInputStream() method and print each line to the 
console until there are no more lines to read, and then close the reader.*/