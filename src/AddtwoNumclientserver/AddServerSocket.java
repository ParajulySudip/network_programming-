/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AddtwoNumclientserver;

import java.io.*;
import java.net.*;

public class AddServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);

            while (true) {
                try (Socket connectionSocket = ss.accept()) {
                    DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
                    int num1 = inFromClient.readInt();
                    int num2 = inFromClient.readInt();
                    
                    int sum = num1 + num2;
                    
                    PrintWriter outToClient = new PrintWriter(connectionSocket.getOutputStream(), true);
                    outToClient.println(sum);
                }
            }
        } catch (IOException e) {
        }
 }
}