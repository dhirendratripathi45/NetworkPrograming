package seven;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class ConstructorDemo {

	public static void main(String[] args) {
		System.out.println("dfhkjsfhsk");
			
		try {
			ServerSocket sc = new ServerSocket(8080, 10, InetAddress.getLocalHost());
			System.out.println(sc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
	}

}
