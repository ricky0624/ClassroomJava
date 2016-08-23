package tw.org.iii.classroom;

public class WashCard
{
	public static void main(String[] args)
	{
		// 洗牌
		int[] poker = new int[52];
		int temp;
		for(int i=0;i<poker.length;i++)
		{
			poker[i]=i;
		}
		for(int j=0;j<poker.length;j++)
		{
			int r1 =(int)(Math.random()*poker.length);
			int r2 =(int)(Math.random()*poker.length);
			temp=poker[r2];
			poker[r2]=poker[r1];
			poker[r1]=temp;
		}
		for(int v:poker)
		{
			System.out.print(v+" ");
		}
	}

}
