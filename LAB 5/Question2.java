import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Question2 extends JApplet
{
	public void init()
	{
		Container c=getContentPane();
		GridLayout g=new GridLayout(3,1);
		c.setLayout(g);
		JLabel label1 = new JLabel("BottomRight", SwingConstants.RIGHT);
        label1.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel label2 =new JLabel("CENTER LEFT",SwingConstants.LEFT);
        label2.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel label3=new JLabel("TOP CENTRE",SwingConstants.CENTER);
        label3.setBorder(BorderFactory.createLineBorder(Color.black));
        c.add(label1);
        c.add(label2);
        c.add(label3);
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.TOP);
	}
	

}
