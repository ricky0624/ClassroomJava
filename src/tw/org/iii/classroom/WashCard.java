package tw.org.iii.classroom;

public class WashCard
{
	public static void main(String[] args)
	{
		// 洗牌
		int[] poker = new int[52];
		int temp;
		// 先將牌按順序排好
		for(int i=0;i<poker.length;i++)
		{
			poker[i]=i;
		}
		// 取任意兩亂數做交換來達成洗牌的目的
		for(int j=0;j<poker.length;j++)
		{
			int r1 =(int)(Math.random()*poker.length);
			int r2 =(int)(Math.random()*poker.length);
			temp=poker[r2];
			poker[r2]=poker[r1];
			poker[r1]=temp;
		}
		// 將洗完的牌排列出來
		for(int v:poker)
		{
			System.out.print(v+" ");
		}
	}

}
