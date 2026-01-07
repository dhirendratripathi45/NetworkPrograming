package five;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//A program to read the data from the URL
public class URLConnectionTest {
	public static void main(String[] args) {
		try {
			//construct a url
			URL url = new URL("https://mocki.io/v1/a59bc356-1f77-4645-895a-8479ec1ec62d");
		
			//create an instance of URLConnection
			try {
				//open the connection
				URLConnection uc = url.openConnection();
				System.out.println("Connected >> ");
				
				//read content type
				System.out.println("Content-Type: " + uc.getContentType());
				
				//read from the response 
				InputStream inputStream = uc.getInputStream();
				
				//buffer
				BufferedInputStream buffer = new BufferedInputStream(inputStream);
				
				InputStreamReader inputStreamReader = new InputStreamReader(buffer);
				int c;
				while((c = inputStreamReader.read()) != -1) {
					char ch = (char)c;
					System.out.print(ch);
				}
				
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.out.println("Not connected.");
			}
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}

	}

}
