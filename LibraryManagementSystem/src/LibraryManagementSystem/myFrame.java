package LibraryManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JSpinner;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myFrame {
	addmember adm=new addmember();
	JFrame frame;
	private JTextField usertf;
	private JTextField psswdtf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFrame window = new myFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
	frame.setBounds(100, 100, 334, 334);
		//frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		panel.setLayout(null);
		panel.setBounds(0, 0, 325, 300);

		frame.getContentPane().add(panel);
		
		JLabel userlb = new JLabel("New label");
		userlb.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		userlb.setText("User ID:");
		userlb.setBounds(56, 67, 120, 20);
		userlb.setForeground(new Color(255, 255, 255));
		panel.add(userlb);

		
		JLabel psswdlb = new JLabel("New label");
		psswdlb.setFont(new Font("Times New Roman", Font.BOLD, 16));

		//label2.setSize(100,100);

		psswdlb.setText("Password:");
		psswdlb.setBounds(44, 97, 120, 20);
		psswdlb.setForeground(new Color(255, 255, 255));
		panel.add(psswdlb);

		
		psswdtf = new JTextField();
		psswdtf.setBounds(118, 98, 120, 20);

		panel.add(psswdtf);
		
	//	tf1.setColumns(10);
		usertf = new JTextField();
		usertf.setBounds(118, 68, 120, 20);


		panel.add(usertf);
		usertf.setColumns(10);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 frame.dispose();
				 adm.createui();
				 
			}
		});
		loginbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginbtn.setForeground(new Color(0, 0, 160));
		loginbtn.setBounds(51, 150, 89, 23);
		panel.add(loginbtn);
		
		JButton cancelbtn = new JButton("Cancel");
		cancelbtn.setForeground(new Color(0, 0, 160));
		cancelbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		cancelbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancelbtn.setBounds(170, 150, 89, 23);
		panel.add(cancelbtn);
		
		JButton forgotbtn = new JButton("Forgot Password");
		forgotbtn.setForeground(new Color(0, 0, 160));
		forgotbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		forgotbtn.setBounds(50, 208, 209, 23);
		panel.add(forgotbtn);
	}
}