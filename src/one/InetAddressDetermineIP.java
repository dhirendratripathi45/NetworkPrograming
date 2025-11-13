package one;

import java.net.InetAddress;

/*A program to determine whether the given IP is v4 or v6 */
public class InetAddressDetermineIP {
	
	private static int getVersion(String hostName) {
		try {
			InetAddress address = InetAddress.getByName(hostName);
			
			byte[] arr = address.getAddress();
			if(arr.length == 4) {
				return 4;
			}
			else if(arr.length == 6) {
				return 6;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//return what?
		return 0;
	}
	
	public static void main(String[] args) {
		try {
			int version = getVersion("www.ipcisco.com");			
			if(version != 0) {		
				System.out.println("IP Version is : " + version);
			}
			
			return;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}


//pseudo logic
//enter the IP 
//calculate the length of binary version