import java.net.InetAddress;
import java.net.UnknownHostException;

public class DomainComparisonExample {
    public static void main(String[] args) {
        try {
            InetAddress address1 = InetAddress.getByName("www.fb.com");
            InetAddress address2 = InetAddress.getByName("www.facebook.com");

            if (address1.equals(address2)) {
                System.out.println("www.fb.com and www.facebook.com are the same.");
            } else {
                System.out.println("www.fb.com and www.facebook.com are different.");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
