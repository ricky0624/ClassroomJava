package tw.org.iii.classroom;

public class Class26 
{
	public static void main(String[] args)
	{
		Brad332 obj1 = new Brad332();
		//obj1.m1();
		obj1.m1(3);
		//obj1.m2();
	}
}
//overloading看參數個數跟參數型別
class Brad331
{
	int a;
	void m1()
	{
		System.out.println("Brad331:m1()");
		a++;
	}
}
class Brad332 extends Brad331
{
	int a;
//	void m1()
//	{
//		super.m1();
//		System.out.println("Brad332:m1()");
//	}
	void m1(int a)
	{
		super.m1();
		a++;
		System.out.println("Brad332:m1(int)"+ this.a++);
	}
	void m2()
	{
		System.out.println("Brad332:m2()");
	}
}
