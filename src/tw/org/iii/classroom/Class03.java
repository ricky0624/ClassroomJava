package tw.org.iii.classroom;

public class Class03
{
	public static void main(String[] args)
	{
		// switch 只能使用 byte short int char型別
		// 擺在case裡一定要是不能變動的數字
		int dir=10;
		final int b=9;
		//用final就會固定不動
		switch(dir)
		{
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B1");
			break;
		case b+2:
			System.out.println("B2");
			break;
		default:
			System.out.println("X");
			break;
		}
	}
}
