import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.Timer;
public class Question1 extends JApplet implements ActionListener
{
	JButton b1,b2;
	Timer t;
	int x;
	public void init()
	{
		b1=new JButton("Start");
		b2=new JButton("Stop");
		Container c=getContentPane();
		FlowLayout f=new FlowLayout(FlowLayout.CENTER);
		c.setLayout(f);
		c.add(b1);
		c.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t=new Timer(10,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				x=x+5;
				if(x==getWidth())
				{
					x=0;
				}
				repaint();
				
			}
		});	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t.start();
		}
		else if(e.getSource()==b2)
		{
			t.stop();
		}
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("hello ", x, 100);
	}
}
