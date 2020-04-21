package Projekti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/*Klasa e Buttonave ku jane te vendosur te gjithe buttonat , pjeset tekstuale , imazhet dhe tabela*/

public class Buttons {
	
	/*Deklarimi i JPanelit si objekt i fushes (p), ashtu qe te munde te perdoret ne te gjithe klasen*/ 
	private JPanel p ;
	//Krijimi i Modelit te Tabeles Default si objekt, dhe deklarimi i saj -> model
	private	DefaultTableModel model = new DefaultTableModel();
				
	//Krijimi i JTable-s e cila merr si parameter modelin e tabeles (model) dhe deklarimi i saj -> table
	private JTable table = new JTable(model);
			
	//Krijimi i JScrollPane e cila merr si komponent tabelen "table" dhe deklarimi i saj -> js
	private JScrollPane js = new JScrollPane(table);
			
	/* Krijimi i butonave si Add , Delete , Search , AllContacts etj.
	 * Vendosja e tekstit ne buttona si dhe deklarimi i tyre
	 */
	private	JButton addB = new JButton("Add Contact");
	private JButton delB = new JButton("Delete Contact");
	private JButton allB = new JButton("All Contacts");
	private JButton searchB = new JButton("Search");
	private JButton srchB = new JButton("✔");
	private JButton cSearchB = new JButton("✘");
	private JButton backB = new JButton("Back");
	private JButton backB1 = new JButton("Back");
	private JButton saveB = new JButton("Save");
	private JButton cAddB = new JButton("Cancel");
		
	/* Krijimi i fushave ku te vendoset teksti si psh : vendosja e emrit , mbiemrit dhe numri i kontaktit ejt.
	 *  si dhe deklarimi i tyre*/
	private JTextField nameTxt = new JTextField();
	private JTextField surnameTxt = new JTextField();
	private JTextField phoneTxt = new JTextField();
	private JTextField searchTxt = new JTextField();
	
	/*Thirrja e klases PhoneL , e cila merr 3 parametra te fushave tekstuale*/
	private PhoneL logic = new PhoneL(nameTxt,surnameTxt,phoneTxt,searchTxt);
	
	/*Krijimi i imazheve dhe deklarimi i tyre , ku si parameter kane Pathin se ku gjinden*/
	private ImageIcon img = new ImageIcon("searchi.png");
	private ImageIcon img1 = new ImageIcon("conta.png");
			
	/*Krijimi dhe deklarimi i siperfaqeve tekstuale te cilat jane te paraqitura ne program , ku si parameter 
	 * kane pjesen tekstuale qe te paraqitet*/
	private JLabel nL = new JLabel("Name :");
	private JLabel sL = new JLabel("Surname :");
	private JLabel pL = new JLabel("Phone Number :");
	private JLabel srchL = new JLabel("Search →");
	private JLabel contL = new JLabel("Contacts :");
			
	/*Krijimi dhe deklarimi i siperfaqeve ku do te paraqiten imazhet e programit, ku si parameter kane objektin 
			  e imazhit*/
	private JLabel imgL = new JLabel(img);
	private JLabel img1L = new JLabel(img1);
	
/**
 * 
 * @param panel : Vendosja e JPanelit kryesor si parameter ashtu qe te lidhen klaset 
 */
	public Buttons(JPanel panel) {
		
		
		p = panel;//Inicializimi i Objektit te fushes p (JPanel) me panelin e parametrin e dhene ne konstruktore 
				
		/*Krijimi dhe emerimi i 3 kolonave qe ndodhen ne tabele permes metodes addColumn nga objekti "model"*/
		model.addColumn("Name");
		model.addColumn("Surname");
		model.addColumn("PhoneNumber");
				
		js.setBounds(260, 150, 300, 200);//Metode e cila cakton koordinatat , gjeresine dhe gjatesine e JScrollPane, ku ne te eshte e vendosur tabela
		
		//Metode e cila mundeson qe tabela te behet transparente
		js.setOpaque(false);
		js.getViewport().setOpaque(false);
		
		//Metode e cila i ben tabelen dhe pjesen ku eshte vendosur ajo jo te dukshme
		js.setVisible(false);
		table.setVisible(false);
				   
		/*Metoda te JLabel-it ku behen caktimi i koordinatav, gjatesia dhe gjeresia e te gjitha siperfaqeve ku paraqiten tekstet
		 * dhe imazhet te cilat ndodhen ne panelin e programit*/
		imgL.setBounds(45, 233, 35, 35);
	    imgL.setVisible(false);	    
	    
	    img1L.setBounds(150, 164, 35, 35);
	    img1L.setVisible(false);   
	    	    
	    srchL.setBounds(87, 239, 90, 20);
	    srchL.setVisible(false);
	    	    
	    contL.setBounds(193, 170, 90, 20);
	    contL.setVisible(false);
	    
	    nL.setBounds(106, 190, 80, 20);
		nL.setVisible(false);
		
		sL.setBounds(88, 215, 80, 20);
		sL.setVisible(false);
		
		pL.setBounds(55, 240, 100, 20);		
		pL.setVisible(false);
	    
	    /*
	     * Metoda te JButton-it ku behen caktimi i koordinatav, gjatesia dhe gjeresia e te gjitha butonave ku paraqiten 
		 * ne panelin e programit
	     */
	    
	    srchB.setBounds(315, 235, 50, 30);
		srchB.setVisible(false);
		
		cSearchB.setBounds(375, 235, 50, 30);
		cSearchB.setVisible(false);
		
		backB.setBounds(160, 219, 90, 20);
		backB.setVisible(false);
		
		backB1.setBounds(160, 219, 90, 20);
		backB1.setVisible(false);
		
		saveB.setBounds(130, 280, 90, 20);
		saveB.setVisible(false);
		
		cAddB.setBounds(240, 280, 90, 20);
		cAddB.setVisible(false);
		
		allB.setBounds(600,260,110,30);
		
		delB.setBounds(600,300,110,30);
		delB.setEnabled(false);   //Metoda setEnable() eshte metode e klases JButton e cila merr nje parameter te tipit boolean 
								  //dhe mundeson qe buttoni te jete i klikueshem apo jo.
		
	    searchB.setBounds(600,220,110,30);
	   	addB.setBounds(600,180,110,30);
	   	
		/*
	     * Metoda te JTextField-it ku behen caktimi i koordinatav, gjatesia dhe gjeresia e te gjitha fushave ku vendosen tekstet
	     * te cilat paraqiten ne panelin e programit
	     */
		
		nameTxt.setBounds(150, 190, 150, 20);
		nameTxt.setVisible(false);
			
		surnameTxt.setBounds(150, 215, 150, 20);
		surnameTxt.setVisible(false);
		
		phoneTxt.setBounds(150, 240, 150, 20);
		phoneTxt.setVisible(false);
		
		searchTxt.setBounds(150, 240, 150, 20);
		searchTxt.setVisible(false);
		
		/*
		 * Vendosja e te gjitha elementeve ne panel , ashtu qe te paraqiten ne program
		 */
				
		p.add(srchB);
		p.add(cSearchB);
		p.add(backB);
		p.add(backB1);
	    p.add(searchB);
		p.add(srchL);
		p.add(contL);		
		p.add(addB);
	    p.add(nameTxt);
	    p.add(surnameTxt);
	    p.add(phoneTxt);
	    p.add(nL);
	    p.add(sL);
	    p.add(pL);
	    p.add(saveB);
		p.add(cAddB);
		p.add(delB);
	    p.add(allB);
	    p.add(searchTxt);
	    p.add(js);
	    p.add(imgL);
		p.add(img1L);	    
	    
	    //p.setLayout(null); 
	}
	    public void addContact() {
	    /*
	     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni addB e cila e mundeson metoda addActionListener
	     */	        
		addB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveB.setVisible(true);
				cAddB.setVisible(true);
				nameTxt.setVisible(true);
				surnameTxt.setVisible(true);
				phoneTxt.setVisible(true);
				searchB.setEnabled(false);
				allB.setEnabled(false);
				addB.setEnabled(false);
				
				nL.setVisible(true);
				sL.setVisible(true);
				pL.setVisible(true);
	
				 /*
			     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni saveB e cila e mundeson metoda addActionListener
			     */
				saveB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						logic.addContact();     //Thirrja e metodes addContact nga klasa PhoneL
						
						nameTxt.setText(null);  //Metoda setText ben te mundur vendosjen e tekstit ne ate objekt , ne kete rast JTextField
												// per ta bere ate te zbrazet (null).
						surnameTxt.setText(null);
						phoneTxt.setText(null);
						
						nameTxt.setVisible(false);
						surnameTxt.setVisible(false);
						phoneTxt.setVisible(false);
						searchB.setEnabled(true);
						
						allB.setEnabled(true);
						addB.setEnabled(true);
						
						nL.setVisible(false);
						sL.setVisible(false);
						pL.setVisible(false);
						
						saveB.setVisible(false);
						cAddB.setVisible(false);
				
						p.revalidate();  //Metoda revalidiate() eshte metode e cila eshte thirrur nga JPaneli dhe ben rishkrimin apo
										 //rivizatimin e panelit.
						
									
							
						}		
					});
				
				 /*
			     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni cAddB e cila e mundeson metoda addActionListener
			     */
				
				cAddB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						nameTxt.setText(null);
						surnameTxt.setText(null);
						phoneTxt.setText(null);
						
						nameTxt.setVisible(false);
						surnameTxt.setVisible(false);
						phoneTxt.setVisible(false);
						
						searchB.setEnabled(true);
						allB.setEnabled(true);
						addB.setEnabled(true);
						
						nL.setVisible(false);
						sL.setVisible(false);
						pL.setVisible(false);
						
						saveB.setVisible(false);
						cAddB.setVisible(false);
						
						p.revalidate(); 
						
						
						}		
					});
					
				p.revalidate();
				
			}
		});
	  }
		
	    public void deleteContact() {
		 /*
	     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni delB e cila e mundeson metoda addActionListener
	     */
		
		delB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					logic.deleteContact(table, model);	//Thirrja e metodes deleteContact() nga klasa PhoneL e cila merr dy parametra
														// njerin JTable dhe tjetrin JDefaultTableModel
					
					p.revalidate();
				
				
			}
		});
	    }
	    
	    public void showAllContact() {
		 /*
	     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni allB e cila e mundeson metoda addActionListener
	     */
		    
		allB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					logic.allContacts(model); // Thirrja e metodes allContact nga klasa PhoneL e cila ka si parameter JDefaultTableModel
															
					contL.setVisible(true);
					img1L.setVisible(true);
					
					backB.setVisible(true);
					
					addB.setEnabled(false);
					allB.setEnabled(false);
					searchB.setEnabled(false);
					delB.setEnabled(true);
					
					table.setEnabled(true);
					table.setVisible(true);
					js.setVisible(true);
					
					 /*
				     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni backB e cila e mundeson metoda addActionListener
				     */					
					backB.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							contL.setVisible(false);
							img1L.setVisible(false);
							
							table.setVisible(false);
							js.setVisible(false);
							
							//Metoda te klases DefaultTableModel te cilat fshine rreshtat nga tabela
							model.getDataVector().removeAllElements(); 
							model.fireTableDataChanged();
							model.setRowCount(0);
														
							addB.setEnabled(true);
							allB.setEnabled(true);
							backB.setVisible(false);
							searchB.setEnabled(true);
							searchB.setEnabled(true);
							delB.setEnabled(false);
													
							p.revalidate();
						}
					});
			}
		});
	    }
	    public void searchContact() {
		 /*
	     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni searchB e cila e mundeson metoda addActionListener
	     */
		
		searchB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
								
					
					imgL.setVisible(true);
					srchL.setVisible(true);
					
					searchTxt.setVisible(true);
					
					addB.setEnabled(false);
					allB.setEnabled(false);
					searchB.setEnabled(false);
					srchB.setEnabled(true);
					
					srchB.setVisible(true);
					cSearchB.setVisible(true);
					
					 p.revalidate();
					
					 /*
					     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni srchB e cila e mundeson metoda addActionListener
					     */
					
					srchB.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
														
							logic.searchContact(model);
							srchL.setVisible(false);
							imgL.setVisible(false);
							img1L.setVisible(true);
							contL.setVisible(true);
							
							backB1.setVisible(true);
							srchB.setVisible(false);
							cSearchB.setVisible(false);
							delB.setEnabled(true);
							
							table.setVisible(true);
							js.setVisible(true);
														
							searchTxt.setVisible(false);
													
							p.revalidate();
							
							 /*
						     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni backB1 e cila e mundeson metoda addActionListener
						     */
							
							backB1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
															
									srchL.setVisible(true);
									imgL.setVisible(true);
									img1L.setVisible(false);
									contL.setVisible(false);
									
									delB.setEnabled(false);
									backB1.setVisible(false);
									srchB.setVisible(true);
									cSearchB.setVisible(true);
									
									table.setVisible(false);
									js.setVisible(false);
																		
									model.getDataVector().removeAllElements();
									model.fireTableDataChanged();
									model.setRowCount(0);
															
									searchTxt.setVisible(true);									
									searchTxt.setText(null);
																																									
									p.revalidate();
									
								}
							});
						
							
					}
				});
					
					 /*
				     *Pjesa e kodit e cila tregon se qka duhet te ndodhe kur te shtypet buttoni cSearchB e cila e mundeson metoda addActionListener
				     */
					
					cSearchB.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
														
							srchL.setVisible(false);
							imgL.setVisible(false);
							
							searchTxt.setVisible(false);
							searchTxt.setText(null);
							
							addB.setEnabled(true);
							allB.setEnabled(true);
							srchB.setEnabled(false);
							srchB.setVisible(false);
							cSearchB.setVisible(false);
							searchB.setEnabled(true);
																																																						
							p.revalidate();
							
					}
				});							
									
			}
		});
		
	  } 
	    
					
	}