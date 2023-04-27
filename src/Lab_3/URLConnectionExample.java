package Lab_3;

/*Write the program to demonstrate the configuration of the connection class by setting different
protected properties of the URLConnection class (url, doInput, doOutput, allowUserInteraction,
use caches, ifModifiedSince etc).Here's an example Java program that demonstrates how to configure
the URLConnection class by setting different protected properties of the URLConnection class:
*/

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com/");
        URLConnection connection = url.openConnection();

        // Set properties
        connection.setDoInput(true); // Enable input (default is true)
        connection.setDoOutput(false); // Disable output (default is false)
        connection.setAllowUserInteraction(false); // Disable user interaction (default is false)
        connection.setUseCaches(true); // Enable caching (default is true)
       // Set modification time to January 1, 1970
        // Print properties
        System.out.println("doInput: " + connection.getDoInput());
        System.out.println("doOutput: " + connection.getDoOutput());
        System.out.println("allowUserInteraction: " + connection.getAllowUserInteraction());
        System.out.println("useCaches: " + connection.getUseCaches());
        System.out.println("ifModifiedSince: " + connection.getIfModifiedSince());

        connection.connect();
        // ...
    }
}
//In this program, we create a URLConnection object using the openConnection() 
//method of the URL class. We then set various properties of the connection object using 
//the setter methods provided by the URLConnection class. Finally, we print the values 
//of these properties to the console to verify that they have been set correctly.