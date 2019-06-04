import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JApplet;
public class Question10 extends JApplet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawOval(50, 50, 70, 70);
		g.setColor(Color.BLACK);
		g.drawOval(100, 50, 70, 70);
		g.setColor(Color.red);
		g.drawOval(150, 50, 70, 70);
		g.setColor(Color.YELLOW);
		g.drawOval(70, 100, 70, 70);
		g.setColor(Color.GREEN);
		g.drawOval(120, 100, 70, 70);
		
	}

}
