package Nine;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        // Create a socket to send and receive data
        DatagramSocket clientSocket = new DatagramSocket();
        
        // Get the IP address of the server (localhost)
        InetAddress IPAddress = InetAddress.getByName("localhost");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message for server: ");
        String message = scanner.nextLine();
        
        // Convert string to bytes
        byte[] sendData = message.getBytes();
        
        // Create a packet with data, length, IP, and port (9876)
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        
        // Send the packet
        clientSocket.send(sendPacket);
        
        // Prepare a buffer for the incoming response
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        
        // Wait and receive the response from the server
        clientSocket.receive(receivePacket);
        
        // Extract the data from the received packet
        String reply = new String(receivePacket.getData(), 0, receivePacket.getLength());
        
        System.out.println("Server replied: " + reply);
        
        // Close the resources
        clientSocket.close();
        scanner.close();
    }
}
