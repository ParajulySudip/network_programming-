/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // Create a BufferedReader to read data from the server
            try ( // Create a Socket object and connect to the server
                    Socket clientSocket = new Socket("192.168.0.143", 3452); // Create a BufferedReader to read data from the server
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Create a PrintWriter to send data to the server
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
                
                
                // Send a message to the server
                String clientMessage = "  Parajuli boss ";
                writer.println(clientMessage);
                
                // Read the response from the server and display it
                String serverMessage = reader.readLine();
                System.out.println("Received from server: " + serverMessage);
                
            }
        } catch (IOException e) {
        }
    }
}
