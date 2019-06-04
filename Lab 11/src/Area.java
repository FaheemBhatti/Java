import javax.swing.JOptionPane;
public class Area 
{
	int length=0;
	int breadth=0;
	public static void main(String arr[])
	{
		Area a=new Area();
		JOptionPane.showMessageDialog(null, "AREA"+(a.length*a.breadth));
	}
	public void Question3() throws NumberFormatException 
	{
		while (true){
			try
			{
				String a=JOptionPane.showInputDialog(null,"Enter length");
				length=Integer.parseInt(a);
			}
			catch(NumberFormatException e)
			{
				String a=e.getMessage();
				JOptionPane.showMessageDialog(null,"WRONG INPUT");
			}
		}
		while(true)
		{
			try
			{
				String b=JOptionPane.showInputDialog(null,"Enter breadth");
				breadth=Integer.parseInt(b);
			}
			catch(NumberFormatException e)
			{
				String b=e.getMessage();
				JOptionPane.showMessageDialog(null,"WRONG INPUT");
			}
		}
		}
	}
}