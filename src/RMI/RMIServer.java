/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

/**
 *
 * @author sudip
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the CalculatorImpl
            Calculator calculator = new CalculatorImpl();

            // Create and start the RMI registry
            LocateRegistry.createRegistry(1099);

            // Bind the calculator object to the registry
            Naming.rebind("CalculatorService", calculator);

            System.out.println("RMI Server is running...");
        } catch (MalformedURLException | RemoteException e) {
        }
    }
}
