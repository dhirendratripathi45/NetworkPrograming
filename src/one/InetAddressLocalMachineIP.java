package one;

import java.net.InetAddress;

/*
 * A program to find the IP address of a local machine
 * */
public class InetAddressLocalMachineIP {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
			
			System.out.println(address.getAddress());
			
			String dottedQuad = address.getHostAddress();
			System.out.println(dottedQuad);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
