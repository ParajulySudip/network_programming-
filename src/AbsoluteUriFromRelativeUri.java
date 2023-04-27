import java.net.URI;
import java.net.URISyntaxException;

public class AbsoluteUriFromRelativeUri {
    public static void main(String[] args) {
        String relativeUri = "/path/to/resource?query=string#fragment";
        String baseUri = "https://www.example.com/base/";

        try {
            URI absoluteUri = new URI(baseUri).resolve(relativeUri);
            System.out.println("Absolute URI: " + absoluteUri);
        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }
    }
}
