package five;

import java.io.*;
import java.net.*;

// A program to print all the headers (keys and values)
public class URLConnectionHeadersPrint {

	public static void main(String[] args) {
		try {
			// create a URL instance
			URL url = new URL("https://facebook.com");
			try {
				//create a URLConnection instance
				URLConnection uc = url.openConnection();
				
				//the infinite loop
				for(int i = 01; ;i++) {
					// retrieve the header
					String headerKey = uc.getHeaderFieldKey(i);
					String headerValue = uc.getHeaderField(i);
										
					//exit condition 
					if(headerKey == null) break;
					
					// print the header key and value
					System.out.println(headerKey + " : " + headerValue);
				}				
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}			
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}
	}
}
