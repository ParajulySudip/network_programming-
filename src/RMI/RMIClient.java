/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

/**
 *
 * @author Sudip
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Lookup the remote calculator object
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");

            // Invoke remote methods
            int result1 = calculator.add(5, 3);
            System.out.println("Addition result: " + result1);

            int result2 = calculator.subtract(10, 4);
            System.out.println("Subtraction result: " + result2);
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
        }
    }
}
