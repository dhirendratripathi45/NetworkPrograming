package Nine;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        // Create a server socket on port 9876
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];
        
        System.out.println("UDP server is running and waiting for client...");
        
        while (true) {
            // Prepare to receive the packet
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            
            // Convert received bytes to String
            String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Client says: " + clientMessage);
            
            // Prepare the response message
            String data = "Received: " + clientMessage;
            byte[] sendData = data.getBytes();
            
            // Get client's IP and Port to send the response back
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            
            // Create and send the response packet
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}