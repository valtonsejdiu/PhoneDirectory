package Projekti;

import javax.swing.JPanel;

public class PhoneDirectoryController {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PhoneG phone = new PhoneG();
		JPanel a = phone.getPanel();
		Buttons b = new Buttons(a); //Krijimi i klases Buttons dhe vendosja ne parametrin e tij panelin ekzistues
		a.setLayout(null);  //Metode e cila mundeson vendosjen e te gjitha elementeve ne panel ne menyre manuale
		b.addContact(); 
		b.deleteContact();
		b.searchContact();
		b.showAllContact();
		phone.insertBackroung();
		a.repaint();
				
	}

}
