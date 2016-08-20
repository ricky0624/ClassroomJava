package tw.org.iii.classroom;

public class Class10
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				//continue就是下面不用做了,直接跳回開頭
				continue;
			}
			System.out.println(i);
		}

	}

}
