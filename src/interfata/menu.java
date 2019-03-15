package interfata;
import java.awt.EventQueue;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import Pol.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.text.StyledDocument;
import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

public class menu {
	
	private JFrame frame;
	public JButton btnSuma; 
	public JButton btnDiferenta;
	public JButton btnInmultire;
	public JButton btnImpartire;
	public JButton btnDerivare;
	public JButton btnIntegrare;
	public JTextField textField;
	public JTextField textField1;
	public JTextField rezultat;
	public JLabel rez;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
					Comenzi comenzi=new Comenzi(window);
					comenzi.setEvents();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public menu() {
		initialize();
	}
	
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(700, 300, 680, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Sistem de procesare a polinoamelor");
		
		
		btnSuma = new JButton("+ (Suma)");
		btnSuma.setBounds(320, 75, 120, 50);
		frame.getContentPane().add(btnSuma);
		
		btnDiferenta = new JButton("- (Diferenta)");
		btnDiferenta.setBounds(480, 75, 120, 50);
		frame.getContentPane().add(btnDiferenta);
		
		btnInmultire = new JButton("* (Inmultire)");
		btnInmultire.setBounds(320, 175, 120, 50);
		frame.getContentPane().add(btnInmultire);
		
		btnImpartire = new JButton("/ (Impartire)");
		btnImpartire.setBounds(480, 170, 120, 50);
		frame.getContentPane().add(btnImpartire);
		
		btnDerivare = new JButton("Derivare");
		btnDerivare.setBounds(320, 275, 120, 50);
		frame.getContentPane().add(btnDerivare);
		
		btnIntegrare = new JButton("Integrare");
		btnIntegrare.setBounds(480, 275, 120, 50);
		frame.getContentPane().add(btnIntegrare);
	
		textField = new JTextField(20);
		textField.setBounds(100, 100, 150, 30);
		frame.getContentPane().add(textField);
		
		textField1 = new JTextField(20);
		textField1.setBounds(100, 150, 150, 30);
		frame.getContentPane().add(textField1);
		
		rezultat = new JTextField(20);
		rezultat.setBounds(70, 250, 200, 30);
		frame.getContentPane().add(rezultat);
		
		
		//JLabel label1= new JLabel("Polinom");
		//label1.setBounds(30, 100, 120, 30);
		//label1.add("polinom 1", label1);
		//frame.getContentPane().add(new JLabel("Polinom 1: "));
		
		//label1.setLocation(730, 330);
		//frame.add(label1);	
	}
}
