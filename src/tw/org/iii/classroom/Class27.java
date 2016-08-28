package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//內部類別方便存取外部類別成員屬性,方法
public class Class27 extends JFrame implements ActionListener
{
	private JButton open,save,exit;
	private JTextArea edit;
	private int count;
	
	public Class27()
	{
		super("My Window App");
		
		open=new JButton("Open");
		save=new JButton("Save");
		exit=new JButton("Exit");
		edit=new JTextArea();
		
		setLayout(new BorderLayout());	
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		add(top,BorderLayout.NORTH);
		add(edit,BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		open.addActionListener(this);
		save.addActionListener(this);
		open.addActionListener(new MyListener());
		open.addActionListener(new tw.org.iii.classroom.MyListener());
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				doOpen();
			}
		});
	}
	private void doOpen()
	{
		System.out.println("InnerListener");	
	}
		
		
	public static void main(String[] args)
	{
		new Class27();
	}

	class MyListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("MyListener2:"+ count++);
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event)
	{
		//equals跟 == 一樣
		if(event.getSource().equals(open))
		{
			System.out.println("open");
		}
		else if(save.equals(event.getSource()))
		{
			System.out.println("save");
		}
	}

}


class MyListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("MyListener1");
		
	}
	
}