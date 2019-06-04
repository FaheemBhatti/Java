import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class image extends JApplet implements ActionListener
{
	JButton b;
	public void init()
	{
		b=new JButton("                LOAD IMAGE             ");
		b.addActionListener(this);
		Container c=getContentPane();
		FlowLayout f=new FlowLayout();
		setLayout(f);
		c.add(b);
	}
	public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==b)
			{

				JPanel p=new JPanel();
				ImageIcon icon = new ImageIcon("image.jpg");
				Image im=icon.getImage();
				im=im.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(im);
				JLabel l = new JLabel( icon, SwingConstants.CENTER);
				p.add(l);
				Container c=getContentPane();
				setSize(400,250);
				FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
				setLayout(f1);
				c.setBackground(Color.GREEN);
				c.add(p);
			}
		}
			
}
