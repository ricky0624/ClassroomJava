package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//內部類別方便存取外部類別成員屬性,方法
public class GuessNumber02 extends JFrame
{
	private JButton guess;
	private JTextArea edit;
	private JTextField tf;
	private StringBuffer sb;
	private int count;
	boolean isWINNER;
	String answer,text,result,setText;
	
	GuessNumber02()
	{
		//視窗標題
		super("Guess Number");
		
		//設定物件
		guess=new JButton("Guess");
		edit=new JTextArea();
		tf=new JTextField(48);
		sb=new StringBuffer();
		
		//加入物件
		setLayout(new BorderLayout());	
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(tf);
		top.add(guess);
		add(top,BorderLayout.NORTH);
		add(edit,BorderLayout.CENTER);
		
		//視窗大小,顯示視窗,關閉視窗
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//產生謎底
		answer = createAnswer(3);
		System.out.println(answer);
		
		//觸發
		guess.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(doRun())
				{
					return;
				}
				if(count > 2)
				{
					JOptionPane.showConfirmDialog(null, "嗨,魯蛇!\n答案是:"+answer,
							"ByeBye!!!",JOptionPane.CLOSED_OPTION);
				}
			}
		});
	}
	//開始猜			
	public boolean doRun()
	{
		count++;
		text = tf.getText().toString();
		isWINNER = false;
		if(answer.equals(text))
		{
			JOptionPane.showMessageDialog(null, "恭喜答對了",
					"Congratulation!!!", JOptionPane.CLOSED_OPTION);
			return true;
		}
		//比對
		else
		{
			result = createAB(answer, text);
			setText = (text + ":" + result + "\n");
			sb.append(setText);
			edit.setText(sb.toString());
			return false;
		}
	}
	public static void main(String[] args)
	{
		new GuessNumber02();
	}
	
	static String createAB(String a, String t)
	{
		int A = 0, B = 0;
		try
		{
			for (int i = 0; i < t.length(); i++)
			{
				if (a.charAt(i) == t.charAt(i))
				{
					A++;
				} 
				else if (a.indexOf(t.charAt(i)) != -1)
				{
					B++;
				}
			}
		} catch (StringIndexOutOfBoundsException se){
			JOptionPane.showMessageDialog(null, "輸入字數有誤");

		}
		return A + "A" + B + "B";
	}
	
	static String createAnswer(int n)
	{
		int[] num = new int[n];
		boolean isOK;
		int rand;
		for (int i = 0; i < num.length; i++)
		{
			do
			{
				isOK = true;
				rand = (int) (Math.random() * 10);
				for (int j = 0; j < i; j++)
				{
					if (num[j] == rand)
					{
						isOK = false;
						break;
					}
				}
			}while (!isOK);
			num[i] = rand;
		}
		String ret = "";
		for (int v : num)
		{
			ret += v;
		}
		return ret;
	}
}