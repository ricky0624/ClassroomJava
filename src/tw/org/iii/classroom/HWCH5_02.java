package tw.org.iii.classroom;

import java.io.*;
public class HWCH5_02
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入兩個整數。");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		int value1=Integer.parseInt(str1);
		int value2=Integer.parseInt(str2);
		
		if(value1==value2)
		{
			System.out.println("兩個數值是相同的。");
		}
		else if(value1>value2)
		{
			System.out.println(value1+"比"+value2+"來得大。");
		}
		else if(value1<value2)
		{
			System.out.println(value2+"比"+value1+"來得大。");
		}
	}
}
