package Projekti;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/* Klasa PhoneL eshte klase Model ne te cilen ndodhet e gjithe lojika e programit*/
public class PhoneL {
	
	private ArrayList<String> name = new ArrayList<String>(); //Inicializimi dhe deklarimi si objekte te fushes i ArrayList ku ndodhen emrat e kontakteve
	private ArrayList<String> surname = new ArrayList<String>(); //Inicializimi dhe deklarimi si objekte te fushes i ArrayList ku ndodhen mbiemrat e kontakteve
	private ArrayList<String> phone = new ArrayList<String>(); //Inicializimi dhe deklarimi si objekte te fushes i ArrayList ku ndodhen numrat e kontakteve
	private String [] a ; //Array ne te cilen ruhen emri , mbiemri dhe numri i nje kontakti
	 
	
	private JTextField n1;//Deklarimi i fushes tekstuale ku vendoset emri i kontaktit qe ruhet, si objekte te fushes qe te perdoren brenda gjith klases
	private JTextField s1;//Deklarimi i fushes tekstuale ku vendoset mbiemri i kontaktit qe ruhet, si objekte te fushes qe te perdoren brenda gjith klases
	private JTextField p1;//Deklarimi i fushes tekstuale ku vendoset numri i kontaktit qe ruhet, si objekte te fushes qe te perdoren brenda gjith klases
	private JTextField s2;//Deklarimi i fushes tekstuale ku vendoset kontakti i cili kerkohet, si objekte te fushes qe te perdoren brenda gjith klases
	
	/**
	 * 
	 * @param n : JTextField ku vendoset emri i kontaktit
	 * @param s : JTextField ku vendoset mbiemri i kontaktit
	 * @param p : JTextField ku vendoset numri i kontaktit
	 * @param srch : JTextField ku vendoset kontakti i cili kerkohet
	 */
	public PhoneL(JTextField n,JTextField s,JTextField p,JTextField srch) {
		n1 = n; //Inicializimi i objektit te fushes n1 me parametrin n
		s1 = s; //Inicializimi i objektit te fushes s1 me parametrin s
		p1 = p; //Inicializimi i objektit te fushes p1 me parametrin p
		s2 = srch;	//Inicializimi i objektit te fushes s2 me parametrin srch
				
	}
	
	//Metode e cila ruan kontaktet 
	public void addContact() {
					if(!(n1.getText().equals("")&&s1.getText().equals("")&&p1.getText().equals(""))){
									
		name.add(n1.getText());
		surname.add(s1.getText());
		phone.add(p1.getText());
		
					}
					
	}
	//Metode e cila kerkon kontaktet
	public void searchContact(DefaultTableModel t) {
		
					
		for(int i =0 ;i<name.size();i++) {
			
			//Variabel e tipit boolean e cila kontrollon se a ekziston ndonje kontakt me ate pjese te shkruar te tekstit
			boolean rez = name.get(i).startsWith(s2.getText())||surname.get(i).startsWith(s2.getText())||phone.get(i).startsWith(s2.getText());
			int value = (rez) ? 1:0; //Konvertimi nga tipi boolean ne tipin int ashtu qe te funksionoj Switch
			
			switch(value) {
			case 1 : a =new String[] {name.get(i),surname.get(i),phone.get(i)};//Inicializimi i vargut a me vlerat e kontaktit qe eshte i ngjashem me tekstin e shkruar
					 t.addRow(a); //Shtimi i rreshtit me vlerat e ati kontakti
					 break;
			case 0 : JOptionPane.showMessageDialog(null, "You don't have contats that starrts with " + s2.getText() + " !");
					 break;
			}
		}
	}
	//Metode e cila shfaqe te gjithe kontaktet e ruajtur , ku si parameter merr DefaultTableModel ne te cilin i vendose
	public void allContacts(DefaultTableModel t) {
		for(int i = 0; i<name.size();i++) {
			t.addRow(new String[] {name.get(i),surname.get(i),phone.get(i)});//Kod i cili ben shtimin e rreshtave me vlerat e kontakteve te cilat ekzistojne
		}		
	}
	
	//Metode e cila fshine kontaktet e klikuara , ku si parameter merr JTable dhe DefaultTableModel nga te cilet 
	//kontrollon kontaktin e klikuar dhe heqjen e tij nga tabela
	public void deleteContact(JTable t,DefaultTableModel d) {
		if(t.getSelectedRow()>=0) // Kontrollimi se a eshte klikuar ndonje rresht
		{
			name.remove(t.getSelectedRow()); //Fshirja e emrit te ati kontakti nga ArrayLista
			surname.remove(t.getSelectedRow()); //Fshirja e mbiemrit te ati kontakti nga ArrayLista
			phone.remove(t.getSelectedRow()); //Fshirja e numrit te ati kontakti nga ArrayLista
			d.removeRow(t.getSelectedRow()); //Fshirja e rreshtit nga tabela 
		} else {
			JOptionPane.showMessageDialog(null, "There's no Contact to delete!");
		}
	}	
}
