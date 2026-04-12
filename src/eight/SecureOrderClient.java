package eight;

import javax.net.ssl.*;
import java.io.*;

public class SecureOrderClient {
    public static void main(String[] args) {
        try {
            // This file must be in the 'src' folder
            System.setProperty("javax.net.ssl.trustStore", "clienttruststore.jks");
            System.setProperty("javax.net.ssl.trustStorePassword", "2andnotafrod");

            SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket s = (SSLSocket) sf.createSocket("localhost", 7000);
            
            System.out.println("Connected securely to server.");
            System.out.println("Enter order (type 'exit' to quit):");

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String order;
            while ((order = userInput.readLine()) != null) {
                out.println(order);
                if (order.equalsIgnoreCase("exit")) break;
            }

            s.close();
        } catch (Exception e) {
            System.err.println("Client Error: " + e.getMessage());
        }
    }
}