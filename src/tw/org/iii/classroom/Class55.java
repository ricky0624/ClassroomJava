package tw.org.iii.classroom;

import java.util.LinkedList;

// list => 1.可重複 2.有順序
public class Class55 
{
	public static void main(String[] args)
	{
		LinkedList list =
				new LinkedList();
		list.add(12);
		list.add(14);
		list.add(13);
		list.add(11);
		list.add(2, 15);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(4);
		System.out.println(list);
		for (Object obj:list)
		{
			System.out.println((Integer)obj);
		}
	}

}
