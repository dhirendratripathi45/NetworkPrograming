package two;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressIpCharacteristics {

	public static void main(String[] args) {		
		try {
			InetAddress address = InetAddress.getByName("FEC0:0000:0000:0000:0000:0000:0000:0000");
			
			//any local address 
			if(address.isAnyLocalAddress()) {
				System.out.println("The given IP is Any Local Address");
			}
			//Loop Back Address 
			else if(address.isLoopbackAddress()) {
				System.out.println("The given IP is Loop Back Address");
			}
			//Link Local Address => the given IP should be v6 and begin with FE80
			else if(address.isLinkLocalAddress()) {
				System.out.println("The given IP is Link Local Address");
			}
			//Site Local => v6 and begins with FEC0
			else if(address.isSiteLocalAddress()) {
				System.out.println("The given IP is Site Local Address");
			}
			//Multicast 
			else if(address.isMulticastAddress()) {
				if(address.isMCGlobal()) {
					System.out.println("The given IP is MCGlobal");
				}
				else if(address.isMCOrgLocal()) {
					System.out.println("The given IP is MCOrgLocal");
				}
				else if(address.isMCSiteLocal()) {
					System.out.println("The given IP is MCSiteLocal");
				}
				else if(address.isMCLinkLocal()) {
				System.out.println("The given IP is MCLinkLocal ");	
				}
				/*
				 * System.out.println("The given IP is Multicast address");
				 */		
				else if (address.isMCNodeLocal()) {
					System.out.println("The given IP is MCNodeLocal");
				}
				
			}
			else {
				System.out.println("not");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
