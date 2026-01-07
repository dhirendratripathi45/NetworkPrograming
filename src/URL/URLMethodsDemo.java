package URL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMethodsDemo {

	public static void main(String[] args) {
		//url methods observation
		try {
			URL url = new URL("https://www.abcd.com:8000/donaldtrump/files/index.html#324?search=usa");
			System.out.println(url);
			
			URL url2 = new URL(url, "/test.html");
			System.out.println(url2);
			
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port Number : " + url.getPort());
			System.out.println("Default Port Number : " + url.getDefaultPort());
			System.out.println("File " + url.getFile());
			System.out.println("Authority : " + url.getAuthority());
			System.out.println("String : " + url.toString());
			System.out.println("Query : " + url.getQuery());
			System.out.println("Equals : " + url.equals(url2));
			//System.out.println("Content : " + url.getContent());
			System.out.println("Ref : " + url.getRef());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
