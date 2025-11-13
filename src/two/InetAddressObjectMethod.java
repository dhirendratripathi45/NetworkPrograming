package two;

import java.net.InetAddress;

public class InetAddressObjectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii");
		
		try {
			InetAddress googleAddress = InetAddress.getByName("www.ibiblio.org");
			InetAddress facebookAddress = InetAddress.getByName("helios.ibiblio.org");
			
			if(googleAddress.equals(facebookAddress)) {
				System.out.println("Both are Same");
			} else {
				System.out.println("Both are not Same");
			}
					
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
