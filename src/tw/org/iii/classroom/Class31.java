package tw.org.iii.classroom;

public class Class31
{
	public static void main(String[] args)
	{
		
	}
}
//存取範圍=>public(全世界),protected(相同package,繼承之子類別),沒有,private(本類別)
class Brad381
{
	private void m1(){}
}
class Brad382 extends Brad381
{
	void m1(){}
}