import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Question4 extends JApplet implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public void init()
	{
		setSize(220,150);
		l1=new JLabel("x = ");
		l2=new JLabel("y = ");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b1=new JButton(" + ");
		b2=new JButton(" - ");
		b3=new JButton(" * ");
		b4=new JButton(" / ");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		Container c=getContentPane();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		GridLayout g=new GridLayout(4,1);
		c.setLayout(g);
		p1.add(l1);
		p1.add(t1);
		p1.setBorder(BorderFactory.createLineBorder(Color.black));
		p2.add(l2);
		p2.add(t2);
		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(t3,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String a;
			String b;
			Double x;
			Double y;
			Double z;
			a=t1.getText();
			b=t2.getText();
			x=Double.parseDouble(a);
			y=Double.parseDouble(b);
			z=x+y;
			t3.setText("	x+y"+z);
		}
		else if(e.getSource()==b2)
		{
			String a;
			String b;
			Double x;
			Double y;
			Double z;
			a=t1.getText();
			b=t2.getText();
			x=Double.parseDouble(a);
			y=Double.parseDouble(b);
			z=x-y;
			t3.setText("	x-y"+z);
		}
		else if(e.getSource()==b3)
		{
			String a;
			String b;
			Double x;
			Double y;
			Double z;
			a=t1.getText();
			b=t2.getText();
			x=Double.parseDouble(a);
			y=Double.parseDouble(b);
			z=x*y;
			t3.setText("	x*y"+z);
		}
		else if(e.getSource()==b4)
		{
			String a;
			String b;
			Double x;
			Double y;
			Double z;
			a=t1.getText();
			b=t2.getText();
			x=Double.parseDouble(a);
			y=Double.parseDouble(b);
			z=x+y;
			t3.setText("	x/y"+z);
		}
		
	}

}
