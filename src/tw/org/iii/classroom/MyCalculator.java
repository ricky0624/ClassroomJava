package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame
{
	private MyButton [] mbtn=new MyButton[16];
	private MyButton preBtn;
	private StringBuffer numSB;
	private double result;
	private JTextField tf;
	private StringBuffer sb;
	String text;
	String [] buttonString={"7","8","9","+",
							"4","5","6","-",
							"1","2","3","*",
							".","0","=","/"};
	
	MyCalculator()
	{
		//�������D
		super("�p��L");
		
		//�]�w����
		for(int i=0;i<buttonString.length;i++)
		{
			mbtn[i]=new MyButton(buttonString[i]);
			if(i == 3 || i == 7 || i == 11 ||
			   i == 12 || i == 14 || i == 15)
			{
				 mbtn[i].isNum=false;
			}
			else
			{
				mbtn[i].isNum = true;
			}
		}
		
		
		tf=new JTextField(48);
		sb=new StringBuffer();
		tf.setPreferredSize(new Dimension(200, 60));
		
		//�[�J����
		setLayout(new BorderLayout());
		JPanel top = new JPanel();
		JPanel bottom = new JPanel(new GridLayout(4, 4));
		top.add(tf);
		for(int i=0;i<mbtn.length;i++)
		{
			bottom.add(mbtn[i].btn);
		}
		
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.CENTER);
		
		//�����j�p,��ܵ���,��������
		setSize(550, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		for(int i=0;i<mbtn.length;i++)
		{
			MyButton myBtn = mbtn[i];
			myBtn.btn.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent arg0) 
				{
					processText(myBtn);
				}
			});
		}
	}
	
	public void processText(MyButton myBtn)
	{
		// 1. �S�� preBtn (�q�ӨS���L)
		// 2. preBtn.isNum = true
		// 3. preBtn.isNum = false
//		if(preBtn == null || preBtn.isNum)
//		{
//		
//		}
//		else
//		{
//			
//		}
		if(preBtn != null && !preBtn.isNum && !myBtn.isNum)
		{
			return;
		}
		
		sb.append(myBtn.btnName);
		tf.setText(sb.toString());
		preBtn = myBtn;
	}
	
	public void doPlus()
	{
		
	}
	public static void main(String[] args)
	{
		new MyCalculator();

	}

}
