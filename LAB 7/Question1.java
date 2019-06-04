import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
public class Question1 extends JApplet implements ActionListener
{
	JButton b1;
	JButton b2;
	JTextField t1;
	JTextField t2;
	public void init()
	{
		t2=new JTextField(10);
		t1=new JTextField(10);
		b1=new JButton("       COPY");
		b2=new JButton("CLEAR");
		b1.addActionListener (this);
		b2.addActionListener(this);
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		c.add(t1);
		c.add(t2);
		c.add(b1);
		c.add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t2.setText(t1.getText());
		}
		else
		{
			t1.setText("");
			t2.setText("");
		}
	}
	

}
