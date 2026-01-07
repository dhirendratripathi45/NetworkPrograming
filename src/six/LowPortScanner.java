package six;
import java.net.*;
import java.io.*;

public class LowPortScanner {
	
	public static void main(String[] args) {
		String host = "localhost";
		for (int i = 14145; i < 14149; i++) {
			Socket s;
			try {
				s = new Socket(host, i);
				System.out.println(s);
				System.out.println("The port " + i +  " is available.");
				s.close();
				System.out.println("---------------");

			} catch (Exception e) {
				System.out.println("---------------");
				System.out.println("The port " + i + " is not available.");
			}
	    }
	}
}
