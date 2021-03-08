package carte;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biblioteca {

	private JFrame frmBiblioteca;
	private JTextField textF0;
	private JTextField textF1;
	private JTextField textF2;
	private JTextField textF3;
	private JTextField textF4;
	private JTextField textF5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biblioteca window = new Biblioteca();
					window.frmBiblioteca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Biblioteca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBiblioteca = new JFrame();
		frmBiblioteca.setTitle("Biblioteca ");
		frmBiblioteca.setBounds(100, 100, 493, 362);
		frmBiblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBiblioteca.getContentPane().setLayout(null);
		
		JButton btnRun = new JButton("Introdu carte");
		btnRun.setBounds(180, 37, 112, 23);
		frmBiblioteca.getContentPane().add(btnRun);
		
		JLabel lblTitlu = new JLabel("Titlul: ");
		lblTitlu.setBounds(23, 77, 46, 14);
		frmBiblioteca.getContentPane().add(lblTitlu);
		
		textF0 = new JTextField(40);
		textF0.setBounds(97, 77, 179, 20);
		frmBiblioteca.getContentPane().add(textF0);
		textF0.setColumns(10);
		
		
		
		JLabel lblGen = new JLabel("Genul: ");
		lblGen.setBounds(23, 108, 46, 14);
		frmBiblioteca.getContentPane().add(lblGen);
		
		textF1 = new JTextField(20);
		textF1.setColumns(10);
		textF1.setBounds(97, 108, 86, 20);
		frmBiblioteca.getContentPane().add(textF1);
		
		JLabel lblAutor = new JLabel("Autorul: ");
		lblAutor.setBounds(23, 139, 52, 14);
		frmBiblioteca.getContentPane().add(lblAutor);
		
		textF2 = new JTextField(40);
		textF2.setColumns(10);
		textF2.setBounds(97, 139, 137, 20);
		frmBiblioteca.getContentPane().add(textF2);
		
		JLabel lblEditura = new JLabel("Editura: ");
		lblEditura.setBounds(23, 170, 46, 14);
		frmBiblioteca.getContentPane().add(lblEditura);
		
		textF3 = new JTextField(20);
		textF3.setColumns(10);
		textF3.setBounds(97, 170, 86, 20);
		frmBiblioteca.getContentPane().add(textF3);
		
		JLabel lblNrPagini = new JLabel("Nr Pagini:");
		lblNrPagini.setBounds(23, 232, 60, 14);
		frmBiblioteca.getContentPane().add(lblNrPagini);
		
		textF4 = new JTextField(20);
		textF4.setColumns(10);
		textF4.setBounds(97, 201, 86, 20);
		frmBiblioteca.getContentPane().add(textF4);
		
		JLabel lblPret = new JLabel("Pretul:");
		lblPret.setBounds(23, 201, 46, 14);
		frmBiblioteca.getContentPane().add(lblPret);
		
		textF5 = new JTextField(5);
		textF5.setColumns(10);
		textF5.setBounds(97, 232, 86, 20);
		frmBiblioteca.getContentPane().add(textF5);
		
		JLabel lblNrvolum = new JLabel("Nr Volume:");
		lblNrvolum.setBounds(23, 271, 70, 14);
		frmBiblioteca.getContentPane().add(lblNrvolum);
		
		Choice choice = new Choice();
		choice.setBounds(144, 265, 39, 20);
		choice.add("0");
		choice.add("1");
		choice.add("2");
		choice.add("3");
		choice.add("4");
		choice.add("5");
		frmBiblioteca.getContentPane().add(choice);
		
		btnRun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				
				String txt0= textF0.getText();
				
				textF0.setEditable(true);
				textF0.setText(txt0);
				System.out.println("Titlu: "+txt0);
				
				String txt1= textF1.getText();
				
				textF1.setEditable(true);
				textF1.setText(txt1);
				System.out.println("Genul: "+txt1);
				
				String txt2= textF2.getText();
				
				textF2.setEditable(true);
				textF2.setText(txt2);
				System.out.println("Autorul: "+txt2);
				
				String txt3= textF3.getText();
				
				textF3.setEditable(true);
				textF3.setText(txt3);
				System.out.println("Editura: "+txt3);
				
				String txt4= textF4.getText();
				
				textF4.setEditable(true);
				textF4.setText(txt4);
				System.out.println("Pretul: "+txt4);
				
				String txt5= textF5.getText();
				
				textF5.setEditable(true);
				textF5.setText(txt5);
				System.out.println("Nr Pagini: "+txt5);
				
				String txt6=choice.getSelectedItem();
				System.out.println("Nr Volume: "+txt6+"\n");
				
				if (s.substring(0) == "Introdu carte") { 
					textF0.setText(null); 
					textF1.setText(null); 
					textF2.setText(null); 
					textF3.setText(null); 
					textF4.setText(null); 
					textF5.setText(null); 
					choice.select(0);
				} 
				
				
			}
		});
		
	}
}
