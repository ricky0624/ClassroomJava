package tw.org.iii.classroom;

import java.io.File;

public class Class38 
{
	public static void main(String[] args) 
	{
		File dir2 = new File("dir1/dir3/dir4/dir5/dir6");
		if (!dir2.exists())
		{
			if(dir2.mkdirs())
			{
				System.out.println("Create dir2 OK");
			}
		}
	}

}
