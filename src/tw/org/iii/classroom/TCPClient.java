package tw.org.iii.classroom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient
{
	public static void main(String[] args) 
	{
		// 1. read from local filesystem
		long start = System.currentTimeMillis();
		try 
		{
			File sendFile = new File("dir1/27fe19pnew.jpg");
			byte[] sendBuf = new byte[(int)sendFile.length()];
			BufferedInputStream	bin =
					new BufferedInputStream(
					new FileInputStream(sendFile));
			bin.read(sendBuf);
			bin.close();
			
		
		// 2. send by TCP
		Socket client = new Socket(InetAddress.getByName("10.2.24.130"),6666);
		BufferedOutputStream bout =
				new BufferedOutputStream(client.getOutputStream());
		bout.write(sendBuf);
		bout.flush();
		bout.close();
		client.close();
		System.out.println(System.currentTimeMillis()-start);
		System.out.println("Send OK");
		}
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}

		
	}
}

