package tw.org.iii.classroom;

public class Class13
{
	public static void main(String[] args)
	{
		int[] p=new int[6];
		
		for(int i=0;i<10000;i++)
		{
			int point=(int)(Math.random()*9); //0-8的亂數
			p[(point>=6?point-3:point)]++;
//			switch(point)
//			{
//			case 1:
//				p[0]++;
//				break;
//			case 2:
//				p[1]++;
//				break;
//			case 3:
//				p[2]++;
//				break;
//			case 4: case 7:
//				p[3]++;
//				break;
//			case 5: case 8:
//				p[4]++;
//				break;
//			case 6: case 9:
//				p[5]++;
//				break;
//			default:
//				System.out.println("Error");
//				break;
//			}
		}
		for(int i=0;i<p.length;i++)
		{
			System.out.println((i+1)+":" +p[i]);
		}
	}
}
