/*MIME stands for Multipurpose Internet Mail Extensions. It is a standard for formatting non-text 
attachments (such as images, audio, video, and other binary data) in email messages and other protocols
such as HTTP.MIME headers are used to describe the type of data being sent or received. 
The MIME type is specified in the Content-Type header, which consists of a type
and subtype separated by a slash (/). For example, the MIME type for a JPEG image is "image/jpeg".
MIME headers can also contain additional parameters, such as the charset (character encoding) for 
text data, and the boundary for multipart messages.

MIME is widely used on the Internet and is an important part of many protocols, including
email (SMTP, POP, and IMAP), HTTP, and SIP. It allows different types of data to be transmitted
and received in
a standardized way, which helps ensure interoperability between different systems and applications.
This program sends an HTTP GET request to https://www.example.com/, reads the response headers using 
the getHeaderFields() method, and extracts the Content-Type header.
It then parses the header to extract the MIME type and charset, 
if present, and prints them to the console.*/
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

public class MimeHeaderExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.google.com.np/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();

        if (status == HttpURLConnection.HTTP_OK) {
            Map<String, List<String>> headers = con.getHeaderFields();
            List<String> contentTypeList = headers.get("Content-Type");
            if (contentTypeList != null && !contentTypeList.isEmpty()) {
                String contentType = contentTypeList.get(0);
                String[] parts = contentType.split(";");
                String mimeType = parts[0].trim();
                System.out.println("MIME type: " + mimeType);
                for (int i = 1; i < parts.length; i++) {
                    String part = parts[i].trim();
                    if (part.startsWith("charset=")) {
                        String charset = part.substring("charset=".length());
                        System.out.println("Charset: " + charset);
                    }
                }
            }
        }

        con.disconnect();
    }
}
