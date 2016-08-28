package tw.org.iii.classroom;

import java.lang.instrument.IllegalClassFormatException;

import javax.swing.tree.ExpandVetoException;
import javax.xml.datatype.DatatypeConfigurationException;

public class Class35
{
	public static void main(String[] args)
	{
		Bird b1=new Bird();
		try
		{
			b1.setLeg(3);
			System.out.println(b1.leg);
		}
		catch(RuntimeException re)
		{
			System.out.println("cccccc");
		}
		
		Brad421 obj1=new Brad421();
		try
		{
			obj1.m1(2);
		}
		catch(IllegalClassFormatException ie)
		{
			
		}
		catch(DatatypeConfigurationException de)
		{
			
		}
		
		Brad422 obj2=new Brad422();
		obj2.m1(2);
	}

}
class Bird
{
	int leg;
	void setLeg(int n)
	{
		if(n<0 || n>2)
		{
			throw new RuntimeException();
		}
		leg=n;
	}
}

class Brad421
{
	void m1(int n) throws IllegalClassFormatException,DatatypeConfigurationException
	{
		if(n<0)
		{
			throw new IllegalClassFormatException();
		}
		else if(n>100)
		{
			throw new DatatypeConfigurationException();
		}
	}
}
//extends=發揚光大 , 好的事情要被父類別多 , 壞事要比父類別少跟小
class Brad422 extends Brad421
{
	void m1(int n)
	{
		int a=10,b=3;
		try
		{
			int c = a/b;
			return;
		}
		catch(RuntimeException re)
		{
			System.out.println("catch");
			//return;
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("OK");
	}
}
