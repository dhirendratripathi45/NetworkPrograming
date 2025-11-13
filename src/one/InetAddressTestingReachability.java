package one;

import java.net.InetAddress;

public class InetAddressTestingReachability {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address = InetAddress.getByName("www.bibekkarkee.com");
			if (address.isReachable(1000)) {
				System.out.println("The host is reachable");
			} else {
				System.out.println("The host is not reachable");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
