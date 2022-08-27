package LibraryManagementSystem;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class addmember {
	Font myfont=new Font("Times New Roman",Font.BOLD,16);
	Font myfonthead=new Font("Times New Roman",Font.BOLD,20);
	Color forcolor=new Color(255,255,255);
	Color bgcolor=new Color(255,255,255);
	Color panel=new Color(0, 128, 255);
	JFrame addmemberfr=new JFrame();
	JPanel addmemberpl=new JPanel();
	JButton addmem, cancel, back;
	JLabel name,lastname,mobile,email,address,dob,welcome,lms;
	JTextField  nametf, lastnametf,mobiletf,emailtf,addresstf,dobtf;
	
	
/*
 * naming convention 
 * name<type>
 * e.g.
 * addmemberfr
 * addmemberpl
 */
	// class variables here
	/*
	 * declare all frames , addmemberpls , buttons, textfields, labels and any other variables to store data
	 */
	/*
	 *  other class object instanciation here
	 *  this must be made static;
	 */
	
	
	// constructor
	addmember(){
		
	}
	
	/*
	 * initialize all class frames addmemberpls etc and add actionlisteners to all buttons here
	 */
	void createui() {
		addmemberfr.getContentPane().setBackground(new Color(0, 64, 128));
		addmemberfr.getContentPane().setLayout(null);
		addmemberfr.getContentPane().setBounds(500,500,1000,800);
		addmemberfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addmemberpl.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Fill Data To Add User", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 160)));
		addmemberpl.setBounds(923, 113, 166, 481);
		addmemberpl.setLayout(null);
		

	 addmem=new JButton("Add");
	 cancel =new JButton("Cancel");
	 back=new JButton("Back");
/*
 * format all buttons here	 
 */
	 addmem.setFont(myfont);
	 cancel.setFont(myfont);
	 back.setFont(myfont);
/*
 * format all labels here	 
 * forgroundcolor
 * font
 * 
 */
	 //labels
	 name= new JLabel("First Name:");
	 lastname= new JLabel("Last Name:");
	 mobile= new JLabel("Mobile Number:");
	 email= new JLabel("Email Id:");
	 address= new JLabel("Address:");
	 dob= new JLabel("Date Of Birth:");
	 
	  welcome = new JLabel("Welcome:");
	  welcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
	  welcome.setForeground(forcolor);
	  welcome.setBackground(bgcolor);
	  welcome.setBounds(10, 11, 135, 46);
	 
	  lms = new JLabel("Library Management System:");
	  lms.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
	  lms.setForeground(forcolor);
	  lms.setBackground(bgcolor);
	  lms.setBounds(150, 11, 500, 46);
	 
	  name.setForeground(forcolor);
	  name.setHorizontalAlignment(SwingConstants.CENTER);
	  name.setFont(myfonthead);
	  
	  lastname.setForeground(forcolor);
	  lastname.setHorizontalAlignment(SwingConstants.CENTER);
	  lastname.setFont(myfonthead);
	  
	  mobile.setForeground(forcolor);
	  mobile.setHorizontalAlignment(SwingConstants.CENTER);
	  mobile.setFont(myfonthead);
	  
	  email.setForeground(forcolor);
	  email.setHorizontalAlignment(SwingConstants.CENTER);
	  email.setFont(myfonthead);
	  
	  address.setForeground(forcolor);
	  address.setHorizontalAlignment(SwingConstants.CENTER);
	  address.setFont(myfonthead);
	  
	  dob.setForeground(forcolor);
	  dob.setHorizontalAlignment(SwingConstants.CENTER);
	  dob.setFont(myfonthead);
	 
	  
	  //textfields
	 nametf=new JTextField(50);
	 lastnametf=new JTextField(50);
 	 mobiletf=new JTextField(10);
	 emailtf=new JTextField(50);
	 addresstf=new JTextField(50);
 	 dobtf=new JTextField(8);
 	 
 	addmemberfr.setBounds(100,100,600,600);
	addmemberpl.setBounds(0, 60, 600, 539);
	welcome.setBounds(10, 11, 135, 46);
	name.setBounds(10,40,135,46);
	lastname.setBounds(10,70,135,46);
	mobile.setBounds(26,100,140,46);
	email.setBounds(0,130,135,46);
	address.setBounds(0,160,135,46);
	dob.setBounds(24,250,135,46);
	
	addmem.setBounds(10, 400, 120, 25);
	cancel.setBounds(230, 400, 120, 25);
	back.setBounds(450, 400, 120, 25);
	
	nametf.setBounds(168,50,100,26);
	lastnametf.setBounds(168,80,100,26);
	mobiletf.setBounds(168,110,100,26);
	emailtf.setBounds(168,140,100,26);
	addresstf.setBounds(168,170,200,80);
	dobtf.setBounds(168,260,100,26);
	
 	 addmemberpl.setForeground(panel);
 	 addmemberpl.setBackground(panel);
     addmemberpl.add(addmem);
	 addmemberpl.add(cancel);
	 addmemberpl.add(back);
	
	 addmemberpl.add(name);
	 addmemberpl.add(lastname);
	 addmemberpl.add(mobile);
	 addmemberpl.add(address);
	 addmemberpl.add(email);
	 addmemberpl.add(dob);
	
	 addmemberpl.add(nametf);
	 addmemberpl.add(lastnametf);
	 addmemberpl.add(mobiletf);
	 addmemberpl.add(addresstf);
	 addmemberpl.add(emailtf);
	 addmemberpl.add(dobtf);
	
 	
	 addmemberfr.add(addmemberpl);
	 addmemberfr.setVisible(true);
 	
	 addmemberfr.add(lms);
	 addmemberfr.add(welcome);
	 addmemberpl.add(name);
	 addmemberpl.add(lastname);
	 addmemberpl.add(mobile);
	 addmemberpl.add(email);
	 addmemberpl.add(address);
	 addmemberpl.add(dob);
	 }
	
	/*
	 * method to send collected data to DAO class
	 */

}
