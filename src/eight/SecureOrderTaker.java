package eight;

import javax.net.ssl.*;
import java.io.*;

public class SecureOrderTaker {
    public static void main(String[] args) {
        try {
            // These files must be in the 'src' folder
            System.setProperty("javax.net.ssl.keyStore", "serverkeystore.jks");
            System.setProperty("javax.net.ssl.keyStorePassword", "2andnotafrod");

            SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket ss = (SSLServerSocket) ssf.createServerSocket(7000);
            
            System.out.println("--- Secure Server Ready (Port 7000) ---");
            
            try (SSLSocket s = (SSLSocket) ss.accept();
                 BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
                
                System.out.println("Connection established safely.");
                String input;
                while ((input = br.readLine()) != null) {
                    System.out.println("Received: " + input);
                    if (input.equalsIgnoreCase("exit")) break;
                }
            }
            ss.close();
        } catch (Exception e) {
            System.err.println("Server Error: " + e.getMessage());
        }
    }
}