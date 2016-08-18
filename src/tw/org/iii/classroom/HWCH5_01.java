package tw.org.iii.classroom;

import java.io.*;

public class HWCH5_01
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入整數。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int value = Integer.parseInt(str);
		
		if(value%2==0)
		{
			System.out.println(value+"是偶數。");
		}
		else
		{
			System.out.println(value+"是奇數。");
		}
	}
}
