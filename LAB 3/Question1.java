import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class Question1 extends JApplet
{
	double sum;
	public void init()
	{
		String Fn=JOptionPane.showInputDialog("Enter firts number");
		String Sn=JOptionPane.showInputDialog("Enter second number");
		double n1=Double.parseDouble(Fn);
		double n2=Double.parseDouble(Sn);
		sum=n1+n2;
	}
	public void paint(Graphics g)
	{
		g.drawString("the sum is"+ sum ,25,30);
		
	}
	

}
