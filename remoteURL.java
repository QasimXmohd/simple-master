

import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class remoteURL {
	
	public static void main (String args[]) throws IOException {
		
		String url =" http http://Qasim:Qassom2001@localhost:8080/job/simple/build?token=1234";
		URL obj= new URL(url);
		
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		int x=con.getResponseCode();
		System.out.println("THIS IS RESPONSE = "+x);
		con.disconnect();
	}

}
