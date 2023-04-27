
import java.net.MalformedURLException;
import java.net.URL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class URLDemo {
    public static void main(String[]args) throws MalformedURLException{
        URL url1 = new URL("http://www.asm.edu.np:80/style/abc.css?q=network+programmingkey1=val&key2=val2#java");
        URL url2 = new URL("http","www.asm.edu.np:80","/style/abc.css");
        URL url3 = new URL("http", "www.asm.edu.np", 80, "/style/abc.css");
        System.out.println(url1);
        System.out.println(url2);
        System.out.println(url3);
        
        URL url = new URL ( "http://www.asm.edu.np");
        URL rurl = new URL(url, "/style/style.css");
        System.out.println(rurl);
        
        System.out.println("Part of the url\n");
        System.out.println(url1.getProtocol());
        System.out.println(url1.getAuthority());
        System.out.println(url1.getHost());
        System.out.println(url1.getPort());
        System.out.println(url1.getPath());
        System.out.println(url1.getFile());
        System.out.println(url1.getQuery());
        System.out.println(url1.getPath());
        System.out.println(url1.getRef());
        
        
    }
}
