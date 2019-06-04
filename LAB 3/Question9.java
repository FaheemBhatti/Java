import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JApplet;
public class Question9 extends JApplet
{
	public void paint(Graphics g)
	{
		g.drawLine(50,50,50,100);
		g.drawLine(50,75,70,75);
		g.drawLine(70,50,70,100);
		g.drawLine(80,50,100,50);
		g.drawLine(80,50,80,100);
		g.drawLine(80,100,100,100);
		g.drawLine(80,75,100,75);
		g.drawLine(110,50,110,100);
		g.drawLine(120,50,120,100);
		g.drawOval(130, 50, 50, 50);
		
	}
}
