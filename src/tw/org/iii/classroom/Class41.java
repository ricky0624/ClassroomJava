package tw.org.iii.classroom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Class41
{
	public static void main(String[] args)
	{
		File f1=new File("dir1/ricky01.txt");
		try
		{
			FileReader reader = new FileReader(f1);
			int c;
			while((c = reader.read())!=-1)
			{
				System.out.print((char)c);
			}
			reader.close();
		}
		catch (Exception e)
		{

		}

	}

}
