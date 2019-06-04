import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Question3 extends JApplet implements ActionListener
{
	String t;
	String opr;
	Double d;
	String t3;
	double d2;
	JLabel t2;
	JButton c6;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton c1;
	JButton c2;
	JButton c3;
	JButton c4;
	JButton c5;
	JButton c7;
	JButton c8;
	JButton c9;
	JButton c10;
	JLabel l1;
	JTextField t1;
	public void init()
	{
		setSize(250,200);
		t2=new JLabel("CALCULATOR ");
		 c6=new JButton("                CLEAR        ");
		 b1=new JButton("1");
		 b2=new JButton("2");
		 b3=new JButton("3");
		 b4=new JButton("4");
		 b5=new JButton("5");
		 b6=new JButton("6");
		 b7=new JButton("7");
		 b8=new JButton("8");
		 b9=new JButton("9");
		 b10=new JButton("0");
		 b11=new JButton("=");
		 c1=new JButton("+");
		 c2=new JButton("-");
		 c3=new JButton("*");
		 c4=new JButton("/");
		 c5=new JButton("%");
		c7=new JButton("MC");
		 c8=new JButton(" Mr");
		c9=new JButton("Ms");
		c10=new JButton("M+");
		 l1=new JLabel("          ");
		 t1=new JTextField(20);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 b10.addActionListener(this);
		 b11.addActionListener(this);
		 c1.addActionListener(this);
		 c2.addActionListener(this);
		 c3.addActionListener(this);
		 c4.addActionListener(this);
		 c5.addActionListener(this);
		 c6.addActionListener(this);
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
		c.setLayout(f1);
		c.add(t2);
		c.add(t1);
		c.add(c7);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(c1);
		c.add(c8);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(c2);
		c.add(c9);
		c.add(b7);
		c.add(b8);
		c.add(b9);
		c.add(c5);
		c.add(c6);
		c.add(b10);
		c.add(b11);	
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			t1.setText(""+t1.getText()+1+"");
			
		}
		else if(e.getSource()==c6)
		{
			t1.setText("");
		}
		else if(e.getSource()==b2)
		{
			t1.setText(""+t1.getText()+2+"");
			
		}
		else if(e.getSource()==b3)
		{
			t1.setText(""+t1.getText()+3+"");
			
		}
		else if(e.getSource()==b4)
		{
			t1.setText(""+t1.getText()+4+"");
			
		}
		else if(e.getSource()==b5)
		{
			t1.setText(""+t1.getText()+5+"");
			
		}
		else if(e.getSource()==b6)
		{
			t1.setText(""+t1.getText()+6+"");
			
		}
		else if(e.getSource()==b7)
		{
			t1.setText(""+t1.getText()+7+"");
		}
		else if(e.getSource()==b8)
		{
			t1.setText(""+t1.getText()+8+"");
			
		}
		else if(e.getSource()==b9)
		{
			t1.setText(""+t1.getText()+9+"");
			
		}
		else if(e.getSource()==b10)
		{
			t1.setText(""+t1.getText()+0+"");
		}
		else if(e.getSource()==c1)
		{
			t=t1.getText();
			t1.setText("");
			d=Double.parseDouble(t);
			opr="+";		
		}
		else if(e.getSource()==c2)
		{
			t=t1.getText();
			t1.setText("");
			d=Double.parseDouble(t);
			opr="-";	
		}
		else if(e.getSource()==c3)
		{
			t=t1.getText();
			t1.setText("");
			d=Double.parseDouble(t);
			opr="*";	
		}
		else if(e.getSource()==c4)
		{
			t=t1.getText();
			t1.setText("");
			d=Double.parseDouble(t);
			opr="/";	
		}
		else if(e.getSource()==c5)
		{
			t=t1.getText();
			t1.setText("");
			d=Double.parseDouble(t);
			opr="%";	
		}
		else if(e.getSource()==b11)
		{
			t3=t1.getText();
			t1.setText("");
			d2=Double.parseDouble(t3);
			if(opr=="+")
			{
				Double res;
				res=d+d2;
				t1.setText(""+res);
			}
			if(opr=="-")
			{
				Double res;
				res=d-d2;
				t1.setText(""+res);
			}
			if(opr=="*")
			{
				Double res;
				res=d*d2;
				t1.setText(""+res);
			}
			if(opr=="/")
			{
				Double res;
				res=d/d2;
				t1.setText(""+res);
			}
		}
	}
}