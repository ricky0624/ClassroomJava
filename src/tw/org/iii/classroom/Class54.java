package tw.org.iii.classroom;

import java.util.Iterator;
import java.util.TreeSet;

// 只要is a collection 就可以 foreach
// Set => 1.不會重覆 2.無順序性(但可排序)
public class Class54
{
	public static void main(String[] args)
	{
		//樂透
		TreeSet set = new TreeSet();
		while(set.size()<6)
		{
			set.add((int)(Math.random()*49+1));
		}

		System.out.println(set);
		System.out.println("-------");
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println((Integer)obj);
		}
		System.out.println("-------");
		for(Object obj :set)
		{
			System.out.println((Integer)obj);
		}
	}

}
