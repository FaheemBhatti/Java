import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Question5 extends JApplet
{
	public void init()
	{
		JTextField t1=new JTextField(10);
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		JButton b0=new JButton("0");
		JButton b10=new JButton("START");
		JButton b11=new JButton("STOP");
		JButton b12=new JButton("ENTER FOOD HERE");
		
		JPanel p=new JPanel();
		GridLayout g=new GridLayout(4,3);
		p.setLayout(g);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b0);
		p.add(b10);
		p.add(b11);
	
		JPanel p1=new JPanel();
		p1.add(t1);
		
		
		Container c=getContentPane();
		setSize(400,200);
		
		c.add(b12,BorderLayout.WEST);
		c.add(p1,BorderLayout.NORTH);
		c.add(p,BorderLayout.CENTER);
	
		
	
	}
}
