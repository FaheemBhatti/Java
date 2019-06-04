import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Question1 extends JApplet
{
	public void init()
	{
		JLabel l1=new JLabel("   LAST NAME");
		JLabel l2=new JLabel("MIDDLENAME");
		JLabel l3=new JLabel("  FIRST NAME");
		l3.setDisplayedMnemonic('F');
		JTextField t1=new JTextField(9);
		JTextField t2=new JTextField(9);
		JTextField t3=new JTextField(9);
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
		c.setLayout(f1);
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(l3);
		c.add(t3);	
	}
	

}
