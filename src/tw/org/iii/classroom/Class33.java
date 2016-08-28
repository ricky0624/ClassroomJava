package tw.org.iii.classroom;

public class Class33 
{
	public static void main(String[] args)
	{
		Brad401 obj1=new Brad401(); //車子:車子
		Brad402 obj2=new Brad402(); //跑車:跑車
		Brad401 obj3=new Brad402(); //車子:跑車
		//Brad402 obj4=new Brad401(); 跑車:車子(不行)
		obj1.m1();
		obj2.m1();
		obj3.m1();
	}
}
class Brad401
{
	int a=1;
	void m1(){System.out.println("Brad401:m1():"+a);}
}
class Brad402 extends Brad401
{
	int a=2;
	void m1(){System.out.println("Brad402:m1():"+a);}
	void m2(){System.out.println("Brad402:m2()");}
}
