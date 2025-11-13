package one;

import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args) {
		//INetAddress demo 
		
		try {
			InetAddress address = InetAddress.getByName("www.bibektripathi.com.np");
			System.out.println(address);
//			InetAddress address1 = InetAddress.getByName("www.bibekkarki.com.np");
//			System.out.println(address1);
			InetAddress address2 = InetAddress.getByName("ww");
			System.out.println(address2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		 
	}

}
