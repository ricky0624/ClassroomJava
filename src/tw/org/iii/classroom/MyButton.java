package tw.org.iii.classroom;

import javax.swing.JButton;

public class MyButton
{
	public JButton btn;
	public String btnName;
	public boolean isNum;
	
	MyButton(String btnName)
	{
		this.btnName = btnName;
		btn=new JButton(btnName);
	}
	
	
}
