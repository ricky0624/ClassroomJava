package tw.org.iii.classroom;

public class Class29
{
	public static void main(String[] args)
	{
		String a = "Brad";
		String b = "Brad";
		String c = new String("Brad");
		String d = new String("Brad");
		if(d.equals(c))
		{
			System.out.println("OK");
		}
		else
		{
			System.out.println("XX");
		}
	}

}
