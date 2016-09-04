package tw.org.iii.classroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Class51 
{
	//Sender
	public static void main(String[] args)
	{
		String data="這次搶到頭香了";
		byte[] sendData = data.getBytes();
		try 
		{
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet =
					new DatagramPacket(sendData, sendData.length,
							InetAddress.getByName("10.2.24.106"),7777);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		} 
		catch (SocketException e)
		{
			
		}
		catch (UnknownHostException e)
		{
			
		}
		catch (IOException e)
		{
			
		}

	}

}
