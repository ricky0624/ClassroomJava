package tw.org.iii.classroom;

import java.io.*;
public class HWCH4_04
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入科目1~5的分數：");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		int value1=Integer.parseInt(str1);
		int value2=Integer.parseInt(str2);
		int value3=Integer.parseInt(str3);
		int value4=Integer.parseInt(str4);
		int value5=Integer.parseInt(str5);
		int sum=value1+value2+value3+value4+value5;
		double average = (double)sum/5;
		
		System.out.println("5個科目的總分為："+sum);
		System.out.println("5個科目的平均為："+average);
	}
}