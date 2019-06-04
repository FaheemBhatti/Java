import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Converter extends JApplet implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JButton b;
	
	public void init()
	{
		setSize(300,100);
		l1=new JLabel("  Celsius");
		l1.setForeground(Color.BLUE);
		l2=new JLabel("  Fahrenheit");
		l2.setForeground(Color.BLUE);
		t1=new JTextField(15);
		b=new JButton("Convert...");
		b.addActionListener(this);
		Container c=getContentPane();
		GridLayout g=new GridLayout(2,2);
		c.setLayout(g);
		c.add(t1);
		c.add(l1);
		c.add(b);
		c.add(l2);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			Double x=0.0;
			Double y=0.0;
			String a;
			a=t1.getText();
			x=Double.parseDouble(a);
			y=x*(9/5+32);
			t1.setText(""+y);	
		}
		
	}

}
