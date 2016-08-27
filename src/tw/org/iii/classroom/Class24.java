package tw.org.iii.classroom;

public class Class24
{
	public static void main(String[] args)
	{
		//a不會變
		//要改變字串內容,強烈使用StringBuffer
		String a="0123";
		System.out.println(a.concat("brad"));
		System.out.println(a);
		System.out.println(a.replace('2', 'k'));
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("123456789012345678901234");
		System.out.println(sb1.capacity());
		sb1.append("12");
		System.out.println(sb1.capacity());

	}

}
