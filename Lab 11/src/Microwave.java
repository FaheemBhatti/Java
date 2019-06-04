import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Microwave extends JApplet implements ActionListener {
	JButton arr[],b;
	JTextField t;
	int counter;
	ImageIcon icon;
	Thread a;
	public void init()
	{
		setSize(400,200);
		t=new JTextField(10);
		t.setEditable(false);
		arr=new JButton[12];
		for(int i=0;i<12;i++)
		{
			arr[i]=new JButton();
		}
		b=new JButton("Food to be placed here");
		arr[0]=new JButton("1");
		arr[1]=new JButton("2");
		arr[2]=new JButton("3");
		arr[3]=new JButton("4");
		arr[4]=new JButton("5");
		arr[5]=new JButton("6");
		arr[6]=new JButton("7");
		arr[7]=new JButton("8");
		arr[8]=new JButton("9");
		arr[9]=new JButton("0");
		arr[10]=new JButton("start");
		arr[11]=new JButton("stop");
		arr[11].setEnabled(false);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,3));
		for(int i=0;i<12;i++)
		{
			p.add(arr[i]);
		}
		b.addActionListener(this);
		JPanel p2=new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(t,BorderLayout.NORTH);
		p2.add(p);
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,2));
		c.add(b);
		c.add(p2);
		for(int i=0;i<12;i++)
		{
			arr[i].addActionListener(this);
		}
		a=new Thread()
		{
			public void run()
			{
				while(counter>=0)
				{
					counter--;
					t.setText(""+counter);
					if(counter==0)
					{
						t.setText("Food is ready");
						arr[10].setEnabled(true);
						arr[11].setEnabled(false);
					}
					try
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 	
					{
						e.printStackTrace();
					}
					validate();
				}
			}
		};
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==arr[0])
		{
			t.setText(""+t.getText()+"1");
		}
		else if(e.getSource()==arr[1])
		{
			t.setText(""+t.getText()+"2");
		}
		else if(e.getSource()==arr[2])
		{
			t.setText(""+t.getText()+"3");
		}
		else if(e.getSource()==arr[3])
		{
			t.setText(""+t.getText()+"4");
		}
		else if(e.getSource()==arr[4])
		{
			t.setText(""+t.getText()+"5");
		}
		else if(e.getSource()==arr[5])
		{
			t.setText(""+t.getText()+"6");
		}
		else if(e.getSource()==arr[6])
		{
			t.setText(""+t.getText()+"7");
		}
		else if(e.getSource()==arr[7])
		{
			t.setText(""+t.getText()+"8");
		}
		else if(e.getSource()==arr[8])
		{
			t.setText(""+t.getText()+"9");
		}
		else if(e.getSource()==arr[9])
		{
			t.setText(""+t.getText()+"0");
		}
		else if(e.getSource()==arr[10])
		{
			counter=Integer.parseInt(t.getText());
			arr[10].setEnabled(false);
			arr[11].setEnabled(true);
			a.start(); 
			
		}
		else if(e.getSource()==b)
		{
			ImageIcon icon = new ImageIcon("images.jpg");
			Image im=icon.getImage();
			im=im.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			icon = new ImageIcon(im); 
			b.setIcon(icon);
			validate();
		}
		else if(e.getSource()==arr[11])
			{
				t.setText("");
				arr[10].setEnabled(true);
				a.stop();
			}
		}
	}

