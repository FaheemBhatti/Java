import javax.swing.JOptionPane;
public class Area 
{
	static int check;
	int length=0;
	int breadth=0;
	public void Question3() throws NumberFormatException 
	{
			try
			{
				String a=JOptionPane.showInputDialog(null,"Enter length");
				length=Integer.parseInt(a);
				String b=JOptionPane.showInputDialog(null,"Enter breadth");
				breadth=Integer.parseInt(b);
				check=0;
			}
			catch(NumberFormatException e)
			{
				String a=e.getMessage();
				JOptionPane.showMessageDialog(null,"WRONG INPUT");
				String b=e.getMessage();
				JOptionPane.showMessageDialog(null,"WRONG INPUT");
				check=1;
			}
	}
	public static void main(String arr[])
	{
		Area f=new Area();
		f.Question3();
		if(check==0)
		{
			JOptionPane.showMessageDialog(null, "AREA"+(f.length*f.breadth));
	    }
	}
	}
