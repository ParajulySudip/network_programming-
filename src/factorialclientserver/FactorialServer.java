/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.net.*;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            
            ServerSocket ss = new ServerSocket(1234);
            
            while (true) {

                try (Socket s = ss.accept()) {
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                    
                    
                    int number = dis.readInt();
                    
                    
                    int factorial = 1;
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }
                    
                    
                    dos.writeInt(factorial);
                    dos.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}