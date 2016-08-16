package tw.org.iii.classroom;

import java.io.*;
public class HWCH4_03
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入三角形的底和高：");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int value1=Integer.parseInt(str1);
		int value2=Integer.parseInt(str2);
		
		System.out.println("三角形的面積為："+(double)(value1+value2)/2);
	}
}