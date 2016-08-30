package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//內部類別方便存取外部類別成員屬性,方法
public class GuessNumber02 extends JFrame
{
	private JButton guess;
	private JTextArea edit;
	private JTextField ans;
	private int count;
	
	public GuessNumber02()
	{
		super("Guess Number");
		
		guess=new JButton("Guess");
		edit=new JTextArea();
		ans=new JTextField(48);
		
		setLayout(new BorderLayout());	
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(ans);
		top.add(guess);
		add(top,BorderLayout.NORTH);
		add(edit,BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
							
	public static void main(String[] args)
	{
		new GuessNumber02();
	}
}