package one;

import java.net.InetAddress;

/* A program to determine whether the given IP is IPv4 or IPv6 */
public class InetAddressDetermineIP {

    private static int getVersion(String hostName) {
        try {
            InetAddress address = InetAddress.getByName(hostName);
            byte[] arr = address.getAddress();

            if (arr.length == 4) {
                return 4;   // IPv4
            } 
            else if (arr.length == 16) {
                return 6;   // IPv6
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0; // unknown
    }

    public static void main(String[] args) {

        String host = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";  // you can change this

        int version = getVersion(host);

        if (version != 0) {
            System.out.println("Host: " + host);
            System.out.println("IP Version is: IPv" + version);
        } else {
            System.out.println("Could not determine IP type.");
        }
    }
}
