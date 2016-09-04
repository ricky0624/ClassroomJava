package tw.org.iii.classroom;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Class53
{
	public static void main(String[] args)
	{
		try
		{
			URL url = new URL("http://pdfmyurl.com/?url=http://tw.yahoo.com");
			URLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
//			conn.getInputStream();
//			BufferedReader reader = 
//					new BufferedReader(
//							new InputStreamReader(conn.getInputStream()));
//			String line;
//			while((line = reader.readLine())!=null)
//			{
//				System.out.println(line);
//			}
//			reader.close();
			
			InputStream in = conn.getInputStream();
			FileOutputStream fout =
					new FileOutputStream("upload/ricky3.pdf");
			int b;
			while((b=in.read())!=-1)
			{
				fout.write(b);
			}
			fout.flush();
			fout.close();
			in.close();
			System.out.println("OK");
		} 
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

	}

}
