package tw.org.iii.classroom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class42
{
	public static void main(String[] args)
	{
		File f1 = new File("dir1/ricky03.txt");
		try 
		{
			FileOutputStream fout = new FileOutputStream(f1);
			fout.write("Hello,Ricky".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}
		catch(Exception e) 
		{
			System.out.println(e.toString());
		}

	}

}
