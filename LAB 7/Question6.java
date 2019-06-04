import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Question6 extends JApplet
{
	public void init()
	{
		JTextField f=new JTextField(5);
		JTextField f1=new JTextField(5);
		JTextField f2=new JTextField(5);
		JTextField f3=new JTextField(5);
		JTextField f4=new JTextField(5);
		JTextField f5=new JTextField(5);
		JTextField f6=new JTextField(5);
		JTextField f7=new JTextField(5);
		JPanel p=new JPanel();
		GridLayout g=new GridLayout(8,1);
		p.setLayout(g);
		p.add(f);
		p.add(f1);
		p.add(f2);
		p.add(f3);
		p.add(f4);
		p.add(f5);
		p.add(f6);
		p.add(f7);
		Container c=getContentPane();
		c.add(p,BorderLayout.EAST);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
