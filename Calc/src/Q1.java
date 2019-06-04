import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
public class Q1 extends JFrame implements ActionListener
{
	JLabel lgn , pass;
	JTextField lg;
	JPasswordField pas;
	static JButton ok;
	Container c=getContentPane();
	Q1()
	{
		ok=new JButton("LOGIN");
		lgn=new JLabel("Usename");
		pass = new JLabel("Password");
		pas=new JPasswordField();
		lg=new JTextField();
		c.setLayout(null);
		ok.setBounds(60, 80, 80, 30);
		lgn.setBounds(5, 10, 60, 50);
		pass.setBounds(5,35,60,50);
		pas.setBounds(100,50,100,20);
		lg.setBounds(100,30,100,20);
		c.add(lg);
		c.add(pass);
		c.add(lgn);
		c.add(pas);
		c.add(ok);	
	}
	public static void main(String a[])
	{
		Q1 q=new Q1();
		q.setVisible(true);
		q.setSize(250, 200);
		q.setResizable(false);
		ok.addActionListener(q);	
	}
	public void actionPerformed(ActionEvent arg0) {
		boolean login=false;
		Connection cann=null;
		try
		{
			String sa ="jdbc:odbc:bd1";
			Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
			cann = DriverManager.getConnection(sa);
			System.out.println("Succesfully Connected");
		}
			catch (Exception e)
		{
			System.out.println("Unable to connect"+e);
		}
		String username=lg.getText();
		String password=pas.getText();
		try
		{
			String db="Select * from tab";
			Statement stmt = cann.createStatement();
			ResultSet rset = stmt.executeQuery(db);
			while(rset.next())
			{
				login=false;
				if(rset.getString(2).equals(username)&& rset.getString(3).equals(password))
				{
					JOptionPane.showMessageDialog(null,"Succesfully Login");
					login=true;
					break;
				}
			}
			if(!login)
			{
				JOptionPane.showMessageDialog(null, "Login Failed");
		}
	}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}