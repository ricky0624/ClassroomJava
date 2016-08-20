package tw.org.iii.classroom;
// package = 目錄結構
// 2016.8.20

public class Class01
{
	public static void main(String[] args)
	{
		int year=2016;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					// 29天
					System.out.println(year+"年,是閏年");
				}
				else
				{
					// 28天
					System.out.println(year+"年,不是閏年");
				}
			}
			else
			{
				// 29天
				System.out.println(year+"年,是閏年");
			}
		}
		else
		{
			// 28天
			System.out.println(year+"年,不是閏年");
		}
	}

}
