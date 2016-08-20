package tw.org.iii.classroom;

//萬年曆程式,未完成

import javax.swing.JOptionPane;

public class Class05
{
	public static void main(String[] args)
	{
		String strYear = JOptionPane.showInputDialog("Year");
		String strMonth = JOptionPane.showInputDialog("Month");
		int intYear = Integer.parseInt(strYear);
		int intMonth = Integer.parseInt(strMonth);
		System.out.println(intYear+"/"+intMonth);
	}
}
