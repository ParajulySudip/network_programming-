/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

/**
 *
 * @author acer
 */
//Write a program to retrieve the arbitrary header fields.

//To retrieve arbitrary header fields from an HTTP response, you can use the getHeaderField()
//method of the HttpURLConnection class. Here's an example program that demonstrates how to do this:

import java.net.*;
import java.io.*;

public class HttpArbitraryHeaders {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Send an HTTP GET request
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            // Get the value of an arbitrary header field
            String customHeader = connection.getHeaderField("X-Custom-Header");
            System.out.println("Value of X-Custom-Header: " + customHeader);

            // Get all header fields and print them
            for (int i = 0;; i++) {
                String headerName = connection.getHeaderFieldKey(i);
                String headerValue = connection.getHeaderField(i);
                if (headerName == null && headerValue == null) {
                    break; // No more headers
                }
                System.out.println(headerName + ": " + headerValue);
            }

            // Disconnect the connection
            connection.disconnect();
        } catch (IOException e) {
        }
    }
}
//In this program, we create a URL object representing the URL we want to connect to.
//We then open a connection to that URL and send an HTTP GET request.

//Next, we use the getHeaderField() method to retrieve the value of an arbitrary header field 
//(X-Custom-Header) and print it to the console.

//Finally, we use a loop to iterate over all of the header fields in the response and print them 
//to the console. The loop continues until getHeaderFieldKey(i) returns null, indicating that 
//there are no more header fields.