import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Question3 extends JApplet
{
	public void init()
	{
		setSize(300,100);
		JTextField t1=new JTextField(10);
		JLabel l1=new JLabel("CELCIUS");
		l1.setForeground(Color.BLUE);
		JButton b1=new JButton("CONVERT");
		JLabel l2=new JLabel("FARENHEIT");
		l2.setForeground(Color.BLUE);
		GridLayout g=new GridLayout(2,2);
		Container c=getContentPane();
		c.setLayout(g);
		c.add(t1);
		c.add(l1);
		c.add(b1);
		c.add(l2);
	}
	

}
