package tw.org.iii.classroom;

public class Class23
{
	public static void main(String[] args)
	{
		// Brad301 obj1=new Brad301(2);
		Brad302 obj2=new Brad302("3");
	}

}
class Brad301
{
//	Brad301()
//	{
//		System.out.println("A");
//	}
	Brad301(int a)
	{
		System.out.println("B");
	}
//	Brad301(byte a)
//	{
//		System.out.println("C");
//	}
}

//Brad302將Brad301視為父類別
//如沒有建構式的話,將會視父類別的無傳參數建構式當作唯一的建構式
//任何一個物件實體,被你建構存在,其祖宗八代的建構實體都存在在記憶體裡面了
//this or super 只能在第一句敘述句,而且只存在一道
class Brad302 extends Brad301
{
	Brad302()
	{
		//super();
		super(1);
		System.out.println("D");
	}
	Brad302(int a)
	{
		//super();
		this();
		System.out.println("E");
	}
	Brad302(String b)
	{
		this(1);
		System.out.println("F");
	}
}