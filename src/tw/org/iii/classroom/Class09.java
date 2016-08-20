package tw.org.iii.classroom;

public class Class09
{
	public static void main(String[] args)
	{
		//標籤語法,要緊跟著迴圈敘述句,中間不得有東西
		brad:
		for(int j=3;j>0;j--)
		{
			for(int i=0;i<3;i++)
			{
				System.out.println(i + ";" + j);
				if(i==1)
				{
					break brad;
				}
			}
		}
	}
}
