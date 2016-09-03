package tw.org.iii.classroom;

import java.io.File;

public class Class39
{
	public static void main(String[] args)
	{
		File[] roots = File.listRoots();
		for(File root:roots)
		{
			System.out.println(root.getAbsolutePath());
		}

	}

}
