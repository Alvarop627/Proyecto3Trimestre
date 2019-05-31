package interfaces;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cargar extends JPanel{
	private JTextField campoUsuario;
	private JTextField campoContrasenia;
	private Ventana ventana;
	public Cargar(Ventana v) {
		super();
		this.ventana=v;
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(46, 78, 60, 14);
		add(lblUsuario);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setBounds(46, 141, 73, 14);
		add(lblContrasenia);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(152, 75, 86, 20);
		add(campoUsuario);
		campoUsuario.setColumns(10);
		
		campoContrasenia = new JTextField();
		campoContrasenia.setBounds(152, 138, 86, 20);
		add(campoContrasenia);
		campoContrasenia.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(46, 198, 89, 23);
		add(btnLogin);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAEligeCargarNueva();
			}
		});
		btnAtras.setBounds(149, 198, 89, 23);
		add(btnAtras);
		
		this.setVisible(true);
	}
}
