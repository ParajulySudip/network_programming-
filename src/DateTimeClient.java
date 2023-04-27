
import java.net.*;
import java.io.*;

public class DateTimeClient {
    public static void main(String[] args) throws IOException {
        String hostName = "192.168.0.102";
        int portNumber = 9999;

        try (
            Socket socket = new Socket(hostName, portNumber);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        ) {
           
            String dateTimeString = in.readLine();

           
            System.out.println("The current date and time is: " + dateTimeString);
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        }
    }
}