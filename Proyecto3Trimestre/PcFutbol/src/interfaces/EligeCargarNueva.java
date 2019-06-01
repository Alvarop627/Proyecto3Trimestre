package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;

import componentes.BotonMenu;
import componentes.MiLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EligeCargarNueva extends JPanel{
	private Ventana ventana;
	ImageIcon imagen;
	public EligeCargarNueva() {
		initComponents();
	}
	
	public EligeCargarNueva(Ventana v) {
		super();
		this.ventana=v;	
		initComponents();
	}
	public EligeCargarNueva(Ventana v,String nombre) {
		super();
		this.ventana=v;	
		
		
		imagen = new ImageIcon(getClass().getResource(nombre));
		setSize(imagen.getIconWidth(),imagen.getIconHeight());
		initComponents();
	}
		
	public void initComponents() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{328, 85, 137, 0};
		gridBagLayout.rowHeights = new int[]{52, 34, 146, 38, 38, 42, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		BotonMenu btnSalirDelJuego = new BotonMenu("Salir del juego",139, 0, 0);
		
		btnSalirDelJuego.setBackground(new Color(139, 0, 0));
		btnSalirDelJuego.setForeground(new Color(255, 255, 255));
		btnSalirDelJuego.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.dispose();
			}
		});
		
		BotonMenu btnCargar = new BotonMenu("Cargar Partida");
		btnCargar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irAClasificacionJornada();
			}
});
		
		MiLabel lblBienvenido = new MiLabel("Bienvenido/a");
		lblBienvenido.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblBienvenido.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblBienvenido = new GridBagConstraints();
		gbc_lblBienvenido.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBienvenido.insets = new Insets(0, 0, 5, 0);
		gbc_lblBienvenido.gridwidth = 3;
		gbc_lblBienvenido.gridx = 0;
		gbc_lblBienvenido.gridy = 0;
		add(lblBienvenido, gbc_lblBienvenido);
		
		MiLabel lblSubtitulo = new MiLabel("<html><center>Elige cargar partida si quieres seguir con tu partida actual o inicia una nueva partida</center></html>",12);
		lblSubtitulo.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
		lblSubtitulo.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblSubtitulo = new GridBagConstraints();
		gbc_lblSubtitulo.gridheight = 2;
		gbc_lblSubtitulo.anchor = GridBagConstraints.NORTH;
		gbc_lblSubtitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSubtitulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblSubtitulo.gridwidth = 3;
		gbc_lblSubtitulo.gridx = 0;
		gbc_lblSubtitulo.gridy = 1;
		add(lblSubtitulo, gbc_lblSubtitulo);
		GridBagConstraints gbc_btnCargar = new GridBagConstraints();
		gbc_btnCargar.fill = GridBagConstraints.VERTICAL;
		gbc_btnCargar.anchor = GridBagConstraints.EAST;
		gbc_btnCargar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargar.gridx = 0;
		gbc_btnCargar.gridy = 3;
		add(btnCargar, gbc_btnCargar);
		
		BotonMenu btnNuevaPartida = new BotonMenu("Nueva Partida",135, 206, 250);
		btnNuevaPartida.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNuevaPartida.setBackground(new Color(135, 206, 250));
		btnNuevaPartida.setPreferredSize(new Dimension(117, 17));
		btnNuevaPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irASeleccionaEquipo();
			}
		});
		GridBagConstraints gbc_btnNuevaPartida = new GridBagConstraints();
		gbc_btnNuevaPartida.fill = GridBagConstraints.VERTICAL;
		gbc_btnNuevaPartida.anchor = GridBagConstraints.EAST;
		gbc_btnNuevaPartida.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevaPartida.gridx = 0;
		gbc_btnNuevaPartida.gridy = 4;
		add(btnNuevaPartida, gbc_btnNuevaPartida);
		btnSalirDelJuego.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		GridBagConstraints gbc_btnSalirDelJuego = new GridBagConstraints();
		gbc_btnSalirDelJuego.fill = GridBagConstraints.VERTICAL;
		gbc_btnSalirDelJuego.anchor = GridBagConstraints.EAST;
		gbc_btnSalirDelJuego.gridx = 2;
		gbc_btnSalirDelJuego.gridy = 5;
		add(btnSalirDelJuego, gbc_btnSalirDelJuego);
		
		this.setVisible(true);
	}
	
	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
}
