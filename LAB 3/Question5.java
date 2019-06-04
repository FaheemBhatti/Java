import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
public class Question5 extends JApplet 
{
	int r=0;
	public void init()
	{
		String q=JOptionPane.showInputDialog("Enter radius");
		 r=Integer.parseInt(q);
	}
	public void paint(Graphics g)
	{
		g.drawOval(r*2,r*2,r,r);
	}
}
