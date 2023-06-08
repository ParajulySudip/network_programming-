//write a java program to calculate the factorial of the number passed by client in server. The result should be displayed in client machine.
package factorialclientserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class FactorialClient {
    public static void main(String[] args) {
        try {
            
            try (Socket s = new Socket("192.168.0.103", 1234)) {
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                System.out.print("Enter number: ");
                int number = Integer.parseInt(inFromUser.readLine());
                dos.writeInt(number);
                dos.flush();
                int result = dis.readInt();
                
                System.out.println("The factorial of " + number + " is " + result);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}