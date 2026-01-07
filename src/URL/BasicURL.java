 package URL;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicURL {

	public static void main(String[] args) {
		//URL class  
		try {
//			URL url = new URL("https://www.googlehkjhkj.com");
//			URL url = new URL("https://com");
//			URL url = new URL("https://");
			
			//absolute url and relative url 
			URL url = new URL("https://www.freechess.org"); //abs
			System.out.println(url);
			
			URL relativeURL = new URL(url, "/aboutus.html"); //relative
			System.out.println(relativeURL);
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
