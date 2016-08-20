package tw.org.iii.classroom;

public class Class08
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
            //判斷是否為質數
			boolean isOK=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isOK=false;
					break;
				}
			}
			System.out.print(i+(isOK?"*":" ")+"  ");
			if(i%10==0)
			{
				System.out.println();
			}
		}
		
		
//		for(int j=0;j<10;j++)
//		{
//			for(int i=1;i<=10;i++)
//			{
//				int v=j*10+i;
//				//判斷是否為質數(除了1和自己本身,無法被其他數整除的數就是質數)
//				boolean isOK = true;
//				for(int k=2;k<=v/2;k++)
//				{
//					if(v%k==0)
//					{
//						//不是質數
//						isOK = false;
//						break;
//					}
//				}
//				System.out.print(v +(isOK?"*":" ")+"  ");
//			}
//			System.out.println();
//		}
	}
}
