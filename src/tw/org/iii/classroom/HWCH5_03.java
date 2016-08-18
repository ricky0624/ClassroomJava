package tw.org.iii.classroom;

import java.io.*;
public class HWCH5_03
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入0~10之間的整數。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int value=Integer.parseInt(str);
		
		if(value>=0 && value<=10)
		{
			System.out.println("正確答案。");
		}
		else
		{
			System.out.println("答錯了。");
		}
	}
}
