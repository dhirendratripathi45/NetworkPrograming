package ten;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class PacketSendDemo {
    public static void main(String[] args) throws IOException {
        int argc = args.length;

        if (argc != 1) {
            System.out.println("Syntax:");
            System.out.println("java PacketSendDemo <hostname>");
            return; // 🔴 stop execution here
        }

        String hostname = args[0];
        System.out.println("Binding to the local port");

        try {
            DatagramSocket socket = new DatagramSocket();
            System.out.println("Bound to local port: " + socket.getLocalPort());

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);

            pout.print("Greetings"); // fixed spelling

            byte[] barray = bout.toByteArray();

            DatagramPacket packet = new DatagramPacket(barray, barray.length);

            System.out.println("Looking up hostname: " + hostname);

            InetAddress remote_addr = InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as: " + remote_addr.getHostAddress());

            packet.setAddress(remote_addr);
            packet.setPort(1000);

            socket.send(packet);
            System.out.println("Packet sent");

            socket.close(); // good practice

        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}