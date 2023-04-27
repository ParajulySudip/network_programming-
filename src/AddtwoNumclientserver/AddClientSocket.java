/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AddtwoNumclientserver;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.net.*;

public class AddClientSocket {
    public static void main(String[] args) {
        try {
            try (Socket clientSocket = new Socket("192.168.0.112", 1234)) {
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(inFromUser.readLine());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(inFromUser.readLine());
                
                outToServer.writeInt(num1);
                outToServer.writeInt(num2);
                
                int sum = Integer.parseInt(inFromServer.readLine());
                
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
            }
        } catch (IOException | NumberFormatException e) {
        }
    }
}