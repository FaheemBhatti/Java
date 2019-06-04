import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
public class Questoin4 extends JApplet
{
	public void init()
	{
		JLabel t1=new JLabel("x =");
		JLabel t2=new JLabel("y =");
		JTextField j1=new JTextField(10);
		JTextField j2=new JTextField(10);
		JTextField j3=new JTextField(15);
		JButton b1=new JButton("+");
		JButton b2=new JButton("-");
		JButton b3=new JButton("*");
		JButton b4=new JButton("/");
		JPanel p=new JPanel();
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
		p.setLayout(f1);
		p.add(t1);
		p.add(j1);	
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel p2=new JPanel();
		FlowLayout f2=new FlowLayout(FlowLayout.CENTER);
		p2.setLayout(f2);
		p2.add(t2);
		p2.add(j2);
		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel p3=new JPanel();
		GridLayout g=new GridLayout(1,4);
		p3.setLayout(g);
		p3.setSize(100,50);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3 .setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel p4=new JPanel();
		FlowLayout f4=new FlowLayout(FlowLayout.CENTER);
		p4.setLayout(f4);
		p4.add(j3);
		p4.setBorder(BorderFactory.createLineBorder(Color.black));
		Container c=getContentPane();
		GridLayout g1=new GridLayout(4,1);
		setLayout(g1);
		c.add(p);
		c.add(p2);
		c.add(p3);
		c.add(p4);	
	}
}
