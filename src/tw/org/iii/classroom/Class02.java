package tw.org.iii.classroom;

public class Class02
{
	public static void main(String[] args)
	{
		// 任何數字以0開頭都是8進位
		int a=10 , b=3;
		// --a , --是先做 
		// a-- , 是以現在值運算,運算完之後才做--的動作
		// System.out.println(a--);
		// System.out.println(a);
		
		//&&=And,判斷式裡兩個條件都要符合
		//&=二進位的And,判斷式前後都會跑
		if(--a >=10 & b++ <=3)
		{
			System.out.println("OK；a="+a+",b="+b);
		}
		else
		{
			System.out.println("XX；a="+a+",b="+b);
		}
		//用&&,b值不動是因為if前面已經可以判斷,後面就沒繼續執行,所以維持原本的值
		//用&,if前後都會跑,所以b會變4
	}
}
