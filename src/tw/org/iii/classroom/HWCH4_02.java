package tw.org.iii.classroom;

import java.io.*;
public class HWCH4_02
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入正方形的邊長：");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int value=Integer.parseInt(str);
		
		System.out.println("正方形的面積為："+value*value);
	}
}
