package six;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketCreationDemo {
	
	public static void createOne() {
		Socket socket;
		try {
			socket = new Socket("www.oreilly.com", 80);
			System.out.println("Connected: " + socket);	
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void createTwo() {
		InetAddress inetAddress;
		try {
			inetAddress = InetAddress.getByName("www.oreilly.com");
			Socket socket = new Socket(inetAddress, 80);
			System.out.println("Connected: " + socket);	
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		createOne();
		createTwo();
	}

}
