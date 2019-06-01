package interfaces;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Jugador;
import javax.swing.JScrollPane;

public class Mercado extends JPanel{
	private Ventana ventana;
	private static ArrayList<Jugador> jugadores;

	public Mercado(Ventana v) {
		super();
		this.ventana = v;
		
		this.jugadores = jugadores;
		for (int i = 0; i < 20; i++) {
			jugadores.add(new Jugador());
		}
		this.initComponents();
	}

	private void initComponents() {
		setBackground(new Color(34, 139, 34));
		setLayout(null);
		
		JLabel lblMercado = new JLabel("MERCADO");
		lblMercado.setBounds(170, 5, 117, 23);
		lblMercado.setForeground(new Color(255, 255, 255));
		lblMercado.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		GridBagConstraints gbc_lblMercado = new GridBagConstraints();
		gbc_lblMercado.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblMercado.insets = new Insets(0, 0, 5, 5);
		gbc_lblMercado.gridx = 0;
		gbc_lblMercado.gridy = 0;
		add(lblMercado);
		
		JPanel scroll = new JPanel();
		FlowLayout flowLayout = (FlowLayout) scroll.getLayout();
		scroll.setBounds(10, 22, 851, 200);
		scroll.setBackground(Color.WHITE);
		JScrollPane desp = new JScrollPane(scroll, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_desp = new GridBagConstraints();
		gbc_desp.fill = GridBagConstraints.BOTH;
		gbc_desp.insets = new Insets(0, 0, 5, 5);
		gbc_desp.gridx = 1;
		gbc_desp.gridy = 1;
		add(desp, gbc_desp);
	}

	public static ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

}
