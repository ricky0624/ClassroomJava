package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lotto extends JFrame
{
	private JButton go;
	private JLabel label;
	
	Lotto()
	{
		//視窗標題
		super("樂透號碼產生器");
		
		//設定物件
		go = new JButton("產生號碼!");
		label = new JLabel();

		//加入物件
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
		top.add(go);
		add(go,BorderLayout.NORTH);
		add(label,BorderLayout.CENTER);
		

		//視窗大小,顯示視窗,關閉視窗
		setSize(550,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//觸發
		go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				doRun();
			}
		});
		
	}
	public void doRun()
	{
		String ans = createAns(6);
		label.setText(ans);
		//改變字型
		Font font = new Font(Font.DIALOG_INPUT, Font.BOLD, 35);
        label.setFont(font);
	}
	public static void main(String[] args)
	{
		new Lotto();
	}
	
	//產生樂透號碼
	static String createAns(int a)
	{
		TreeSet set = new TreeSet();
		while(set.size()<a)
		{
			set.add((int)(Math.random()*49+1));
		}
		return set.toString();
	}
}