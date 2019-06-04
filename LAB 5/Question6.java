import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class Question6 extends JApplet
{
	public void init()
	{
		JPanel p=new JPanel();
		ImageIcon icon = new ImageIcon("images.jpg");
		Image im=icon.getImage();
		im=im.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(im);
		JLabel l = new JLabel("Smile", icon, SwingConstants.CENTER);
		l.setVerticalTextPosition(JLabel.TOP);
		l.setHorizontalTextPosition(JLabel.LEFT); 
		p.add(l);
		p.add(l);
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel p1=new JPanel();
		ImageIcon icon1 = new ImageIcon("images.jpg");
		Image im1=icon1.getImage();
		im1=im1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(im1);
		JLabel l1 = new JLabel("Smile", icon1, SwingConstants.CENTER);
		l1.setVerticalTextPosition(JLabel.TOP);
		l1.setHorizontalTextPosition(JLabel.CENTER); 
		p1.add(l1);
		p1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel p2=new JPanel();
		ImageIcon icon2 = new ImageIcon("images.jpg");
		Image im2=icon2.getImage();
		im2=im2.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(im2);
		JLabel l2 = new JLabel("Smile", icon2, SwingConstants.CENTER);
		l2.setVerticalTextPosition(JLabel.CENTER);
		l2.setHorizontalTextPosition(JLabel.RIGHT); 
		p2.add(l2);
		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel p3=new JPanel();
		ImageIcon icon3 = new ImageIcon("images.jpg");
		Image im3=icon3.getImage();
		im3=im3.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon3 = new ImageIcon(im3);
		JLabel l3 = new JLabel("Smile", icon3, SwingConstants.CENTER);
		l3.setVerticalTextPosition(JLabel.TOP);
		l3.setHorizontalTextPosition(JLabel.LEFT); 
		p3.add(l3);
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel p4=new JPanel();
		ImageIcon icon4 = new ImageIcon("images.jpg");
		Image im4=icon4.getImage();
		im4=im4.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon4 = new ImageIcon(im4);
		JLabel l4 = new JLabel("Smile", icon4, SwingConstants.CENTER);
		l4.setVerticalTextPosition(JLabel.CENTER);
		l4.setHorizontalTextPosition(JLabel.CENTER); 
		p4.add(l4);
		p4.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		JPanel p5=new JPanel();
		ImageIcon icon5 = new ImageIcon("images.jpg");
		Image im5=icon5.getImage();
		im5=im5.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon5 = new ImageIcon(im5);
		JLabel l5 = new JLabel("Smile", icon5, SwingConstants.CENTER);
		l5.setVerticalTextPosition(JLabel.CENTER);
		l5.setHorizontalTextPosition(JLabel.RIGHT); 
		p5.add(l5);
		p5.setBorder(BorderFactory.createLineBorder(Color.black));
	
		
		JPanel p6=new JPanel();
		ImageIcon icon6 = new ImageIcon("images.jpg");
		Image im6=icon6.getImage();
		im6=im6.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon6 = new ImageIcon(im6);
		JLabel l6 = new JLabel("Smile", icon6, SwingConstants.CENTER);
		l6.setVerticalTextPosition(JLabel.BOTTOM);
		l6.setHorizontalTextPosition(JLabel.LEFT); 
		p6.add(l6);
		p6.setBorder(BorderFactory.createLineBorder(Color.black));
	
		JPanel p7=new JPanel();
		ImageIcon icon7 = new ImageIcon("images.jpg");
		Image im7=icon7.getImage();
		im7=im7.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon7 = new ImageIcon(im7);
		JLabel l7 = new JLabel("Smile", icon6, SwingConstants.CENTER);
		l7.setVerticalTextPosition(JLabel.BOTTOM);
		l7.setHorizontalTextPosition(JLabel.CENTER); 
		p7.add(l7);
		p7.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel p8=new JPanel();
		ImageIcon icon8 = new ImageIcon("images.jpg");
		Image im8=icon8.getImage();
		im8=im8.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		icon8 = new ImageIcon(im8);
		JLabel l8 = new JLabel("Smile", icon8, SwingConstants.CENTER);
		l8.setVerticalTextPosition(JLabel.BOTTOM);
		l8.setHorizontalTextPosition(JLabel.RIGHT); 
		p8.add(l8);
		p8.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		Container c=getContentPane();
		setSize(400,200);
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
		setLayout(f1);
		c.add(p);
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		c.add(p6);
		c.add(p7);
		c.add(p8);
	
	
		
		
	}

}
