import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
public class Question3 extends JApplet 
{
	public void paint(Graphics g)
	{
		super.paint(g);
		int a=0;
		int b=0;
		a=getHeight();
		b=getWidth();
		a=a/2;
		b=b/2;
		Font f=new Font("Serif" ,Font.BOLD,24);
		g.setFont(f);
		g.drawString("FAHEEM ",b-60,a);
		Font q=new Font("Serif",Font.PLAIN,24);
		g.setFont(q);
		g.drawString("FAHEEM", b-60, a+20);
		Font w=new Font("Italic",Font.BOLD,24);
		g.setFont(w);
		g.drawString("FAHEEM", b-60, a+40);
		Font e=new Font("italic",Font.PLAIN,24);
		g.setFont(e);
		g.drawString("FAHEEM",b-60,a+60);
	}
	

}
