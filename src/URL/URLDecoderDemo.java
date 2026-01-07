package URL;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecoderDemo {
	
    public static void main(String[] args) {
        try {
            System.out.println(URLDecoder.decode("This+string+has+spaces", "UTF-8"));
            System.out.println(URLDecoder.decode("This+string+has+spaces", "UTF-16"));
            System.out.println(URLDecoder.decode("This%2Astring%2Ahas%2Aspaces", "UTF-8"));
            System.out.println(URLDecoder.decode("This%25string%25has%25spercentages", "UTF-8"));
            System.out.println(URLDecoder.decode("This%2Bstring%2Bhas%2Bpluses", "UTF-8"));
            System.out.println(URLDecoder.decode("This%2Fstring%2Fhas%2F", "UTF-8"));
            System.out.println(URLDecoder.decode("This%5Cstring%5Chas", "UTF-8"));
            System.out.println(URLDecoder.decode("This%3Astring%3Ahas%3Acolon", "UTF-8"));
            System.out.println(URLDecoder.decode("This%7Estring%7Ehas%7Etilde%7Esign", "UTF-8"));
            System.out.println(URLDecoder.decode("This%28string%29has%28parenthesis", "UTF-8"));
            System.out.println(URLDecoder.decode("This.string.has.periods", "UTF-8"));
            System.out.println(URLDecoder.decode("This%3Dstring%3Dhas%3D", "UTF-8"));
            System.out.println(URLDecoder.decode("This%26string%26has%26ampersands", "UTF-8"));
            System.out.println(URLDecoder.decode("This%24string%24hasnon-ASCIIcharacters", "UTF-8"));

        } catch (UnsupportedEncodingException e) {
            System.err.println(e.getMessage());
        }
    }
}
