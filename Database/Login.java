import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener{
	JTextField t,t1;
	JButton b;
	JLabel l,l1;
	JPasswordField pass;
	String username,password;
	int i;
	Boolean success=false;
	Connection conn = null;
	Login()
	{
	t=new JTextField(15);
	b=new JButton("Login");
	b.addActionListener(this);
	l=new JLabel("Enter Password");
	l1=new JLabel("Enter username");
	pass=new JPasswordField(15);
	Container c=getContentPane();
	c.setLayout(new GridLayout(3,1));
	JPanel p=new JPanel();
	p.setLayout(new GridLayout(2,1));
	p.add(l1);
	p.add(t);
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(2,1));
	p.add(l);
	p.add(pass);
	c.add(p);
	c.add(p1);
	c.add(b);
	}
public static void main(String args[]){	
Login lo=new Login();
lo.setSize(200,200);
lo.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b){
		username=t.getText();
		password=pass.getText();
	//	System.out.println(password);
		// register jdbc driver
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch(ClassNotFoundException a) {
		System.out.println(a);
		}
		// connect to DB
		try{
		conn = DriverManager.getConnection("jdbc:odbc:db1");
		} catch(SQLException se) {
		System.out.println(se);
		}
		//System.out.println("connection is successful!!!");
		try{
			String selectSQL = "select username, password from Table1";
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(selectSQL);
			while(rset.next()){
				success=false;
			if(rset.getString(1).equals(username)&&  rset.getString(2).equals(password)){
			JOptionPane.showMessageDialog(null, "successful Login!");
			success=true;
			break;
			}
			}
			if(!success){
				JOptionPane.showMessageDialog(null, "Login Failed!");	
			}
			stmt.close();
			} catch(SQLException se) {
			System.out.println(se);
			}
	}
}}