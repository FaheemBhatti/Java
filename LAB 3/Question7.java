import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JApplet;
public class Question7 extends JApplet
{
	public void paint (Graphics g)
	{
		g.drawLine(50,100,100,50);
		g.drawLine(100,50,150,100);
		g.drawLine(50,100,150,100);
		g.drawLine(50,100,50,200);
		g.drawLine(150,100,150,200);
		g.drawLine(50,200,150,200);
		g.drawLine(80,200,80,170);
		g.drawLine(80,170,100,170);
		g.drawLine(100,170,100,200);
		g.drawLine(110,180,130,180);
		g.drawLine(130,180,130,190);
		g.drawLine(130,190,110,190);
		g.drawLine(110,190,110,180);
	}

}
