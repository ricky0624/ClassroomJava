package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Class58 extends JFrame
{
	private MyPainter painter;
	private JButton clear,undo,redo,save;
	private MyClock clock;
	
	public Class58()
	{
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		clock = new MyClock();
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);
		top.add(undo);
		top.add(redo);
		top.add(save);
		top.add(clock);
		add(top, BorderLayout.NORTH);
		
		painter = new MyPainter();
		add(painter, BorderLayout.CENTER);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setupEvent();
	}
	private void setupEvent()
	{
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doClear();
				
			}
		});
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doUndo();
				
			}
		});
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doRedo();
				
			}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
				
			}
		});
	}
	
	private void doClear()
	{
		painter.clear();
	}
	private void doUndo()
	{
		painter.undo();
	}
	private void doRedo()
	{
		painter.redo();
	}
	private void doSave()
	{
		BufferedImage bi = 
				new BufferedImage(this.getSize().width, this.getSize().height, BufferedImage.TYPE_INT_ARGB); 
		Graphics g = bi.createGraphics();
		painter.paint(g);  //this == JComponent
		g.dispose();
		try{ImageIO.write(bi,"png",new File("dir1/test.png"));}catch (Exception e) {}
	}
	public static void main(String[] args)
	{
		new Class58();
	}

}
