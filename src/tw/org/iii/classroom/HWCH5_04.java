package tw.org.iii.classroom;

import java.io.*;
public class HWCH5_04
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入成績。");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int grade=Integer.parseInt(str);
		
		switch(grade)
		{
		case 1:
			System.out.println("請拼命加油吧！");
			break;
		case 2:
			System.out.println("請再加油一點！");
			break;
		case 3:
			System.out.println("您還可以作得更好！");
			break;
		case 4:
			System.out.println("幹得好！");
			break;
		case 5:
			System.out.println("您真是太優秀了！");
			break;
		default:
			System.out.println("輸入錯誤！");
			break;
		}
	}
}
