package eight;

import java.net.*;
import java.io.*;
import javax.net.ssl.*;

public class SSLSocketClient {
    public static void main(String[] args) {
        try {
            // Get the default SSL socket factory
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            
            // Create a secure socket connecting to verisign.com on port 443 (HTTPS)
            SSLSocket socket = (SSLSocket) factory.createSocket("www.verisign.com", 443);
            
            // Initiate the SSL handshake
            socket.startHandshake();
            
            // Set up the output stream to send a GET request
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            
            out.println("GET / HTTP/1.0");
            out.println();
            out.flush();
            
            // Check for errors in the output stream
            if (out.checkError()) {
                System.out.println("SSLSocketClient: java.io.PrintWriter error");
            }
            
            // Set up the input stream to read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            // Close all resources
            in.close();
            out.close();
            socket.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
