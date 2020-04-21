package Projekti;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * Klasa ne te cilen ndodhet View i programit 
 */
public class PhoneG extends JPanel {
	
			private JPanel a = this;
	
	public PhoneG() {
		
		
		JFrame frame = new JFrame("Phone Directory"); //Krijimi i JFrameit dhe emrimi i tij		
				
		frame.getContentPane().add(this);
		frame.setVisible(true);
		frame.setSize(800, 500); //Vendosja e gjeresise dhe gjatesise se frameit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(300, 150);
							    				 
	}
	public void insertBackroung() {
		
		ImageIcon img = new ImageIcon("lg.png"); //Krijimi i objektit te imazhit ku si parameter ka pathin e imazhit
		ImageIcon img1 = new ImageIcon("back2.png"); //Krijimi i objektit te imazhit ku si parameter ka pathin e imazhit
		JLabel label1= new JLabel(img1); //Krijimi i JLabel ne te cilin ndodhet imazhi pare
		JLabel label= new JLabel(img); //Krijimi i JLabel ne te cilin ndodhet imazhi dyte
		label.setBounds(170, 30, 453, 67);
		label1.setBounds(275, 125, 250, 250);
		
		this.add(label);
		this.add(label1);
		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white); 
		g.fillRect(0, 0, 800, 500);
		
		
	}
	public JPanel getPanel() {
		return a;
	}
	
	
}
