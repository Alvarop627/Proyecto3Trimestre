package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


import componentes.BotonMenu;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class NuevaPartida extends JPanel{
	private Ventana ventana;
	private JTextField campoNombre;
	private JTextField campoEmail;
	private JTextField campoFNacimiento;
	private JPasswordField campoContrasenia;
	private JButton btnNuevaPartida;
	private JButton btnAtras;
	public NuevaPartida(Ventana v) {
		super();
		this.ventana=v;
		setSize(300,300);
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(38, 66, 65, 14);
		add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(38, 103, 46, 14);
		add(lblEmail);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(38, 139, 113, 14);
		add(lblFechaNacimiento);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(38, 176, 99, 14);
		add(lblContrasea);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(149, 63, 86, 20);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(149, 100, 86, 20);
		add(campoEmail);
		campoEmail.setColumns(10);
		
		campoFNacimiento = new JTextField();
		campoFNacimiento.setBounds(149, 136, 86, 20);
		add(campoFNacimiento);
		campoFNacimiento.setColumns(10);
		
		campoContrasenia = new JPasswordField();
		campoContrasenia.setBounds(149, 173, 86, 20);
		add(campoContrasenia);
		
		btnNuevaPartida = new BotonMenu("Nueva partida");
		btnNuevaPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNuevaPartida.setBounds(38, 214, 89, 23);
		add(btnNuevaPartida);
		
		JButton btnAtras = new BotonMenu("Atr\u00E1s");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAEligeCargarNueva();
			}
		});
		btnAtras.setBounds(149, 214, 89, 23);
		add(btnAtras);
		
	}
}
