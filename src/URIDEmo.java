
import java.net.URI;
import java.net.URISyntaxException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class URIDEmo {
    public static void main(String[]args) throws URISyntaxException{
    URI uri1=new URI("mailto:info@asm.edu.np");
    System.out.println(uri1);
    
    URI uri2=new URI("tel:98898989898");
    System.out.println(uri2);
    
    URI uri3=new URI("file:c/myfile/abc.txt");
    System.out.println(uri3);
    
    URI uri4=new URI("ftp","c/myfile/abc.txt","abc");
    System.out.println(uri4);
    
      URI uri5 = new URI("ftp","www.asm.edu.np","/style/style.css","text");
        System.out.println(uri5);
        
        URI uri6= new URI("ftp","www.asm.edu.np:80","/style/style.css","q= network+programming","text");
        System.out.println(uri6);
        
        URI uri7= new URI("ftp","ram","gmail.com",88,"/style/style.css","q= network+programming","text");
        System.out.println(uri7);
        
        System.out.println("Parts of the URI");
        System.out.println(uri1.getScheme());
        System.out.println(uri1.getSchemeSpecificPart());
        System.out.println(uri1.getRawSchemeSpecificPart());
    }
}
