package tw.org.iii.classroom;

import java.io.*;
public class HWCH6_02
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入考試的成績。(輸入0就結束)");
		int sum=0;
		while(true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			int value=Integer.parseInt(str);
			sum+=value;
			if(value==0)
			{
				break;
			}
		}
		System.out.println("總分為"+sum+"分。");
	}
}
