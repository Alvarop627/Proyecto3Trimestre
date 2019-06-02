package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Font;
import java.awt.Graphics;

import componentes.BotonMenu;
import componentes.MiLabel;
import componentes.MiPanel;

import javax.swing.border.LineBorder;

import clases.Division;
import clases.Equipo;
import clases.Jornada;
import clases.Jugador;
import clases.Partido;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Cursor;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EligeCargarNueva extends JPanel{
	private Ventana ventana;
	ImageIcon imagen;
	public EligeCargarNueva() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		initComponents();
	}
	
	public EligeCargarNueva(Ventana v) {
		super();
		this.ventana=v;	
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		initComponents();
	}
	public EligeCargarNueva(Ventana v,String rutaImagen) {
		super();
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		this.ventana=v;	
		
		
		imagen = new ImageIcon(getClass().getResource(rutaImagen));
		setSize(imagen.getIconWidth(),imagen.getIconHeight());
		initComponents();
	}
		
	public void initComponents() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
		gridBagLayout.columnWidths = new int[]{(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/10)};
		gridBagLayout.rowHeights = new int[]{(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10),(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/10)};
		setLayout(gridBagLayout);
		
		MiPanel panelMini = new MiPanel(ventana,"../imagenes/mini2.png");
		GridBagConstraints gbc_panelMini = new GridBagConstraints();
		gbc_panelMini.gridheight = 2;
		gbc_panelMini.gridwidth = 2;
		gbc_panelMini.insets = new Insets(0, 0, 5, 5);
		gbc_panelMini.fill = GridBagConstraints.BOTH;
		gbc_panelMini.gridx = 1;
		gbc_panelMini.gridy = 2;
		add(panelMini, gbc_panelMini);
		
		MiPanel panel = new MiPanel(ventana,"../imagenes/logoRobinson.png");
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.gridheight = 5;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		
		
		
		MiLabel lblBienvenido = new MiLabel("Bienvenido/a");
		lblBienvenido.setPreferredSize(new Dimension(192, 108));
		lblBienvenido.setFont(new Font("Bauhaus 93", Font.PLAIN, 75));
		lblBienvenido.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblBienvenido = new GridBagConstraints();
		gbc_lblBienvenido.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenido.gridwidth = 3;
		gbc_lblBienvenido.gridx = 4;
		gbc_lblBienvenido.gridy = 5;
		add(lblBienvenido, gbc_lblBienvenido);
		
		MiLabel lblSubtitulo = new MiLabel("<html><center>Elige cargar partida si quieres seguir con tu partida actual o inicia una nueva partida</center></html>",12);
		lblSubtitulo.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		lblSubtitulo.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblSubtitulo = new GridBagConstraints();
		gbc_lblSubtitulo.anchor = GridBagConstraints.NORTH;
		gbc_lblSubtitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSubtitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubtitulo.gridwidth = 3;
		gbc_lblSubtitulo.gridx = 4;
		gbc_lblSubtitulo.gridy = 6;
		add(lblSubtitulo, gbc_lblSubtitulo);
		
		BotonMenu btnCargar = new BotonMenu("Cargar Partida");
		btnCargar.setEnabled(false);
		btnCargar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//ventana.irAClasificacionJornada();
				JOptionPane.showMessageDialog(ventana, "Funcion no disponible, actualmente en desarrollo");
			}
});
		GridBagConstraints gbc_btnCargar = new GridBagConstraints();
		gbc_btnCargar.fill = GridBagConstraints.BOTH;
		gbc_btnCargar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargar.gridx = 5;
		gbc_btnCargar.gridy = 7;
		add(btnCargar, gbc_btnCargar);
		
		
		BotonMenu btnNuevaPartida = new BotonMenu("Nueva Partida",135, 206, 250);
		btnNuevaPartida.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNuevaPartida.setBackground(new Color(135, 206, 250));
		btnNuevaPartida.setPreferredSize(new Dimension(117, 17));
		btnNuevaPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(ventana, "Iniciando...Tiempo de espera estimado: 1min");
				try {
					Connection con;
					con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pcfutbolmini", "localhost", "localhost");
					Statement smt=con.createStatement();
					String borrarJugadores = "Delete from jugadores where id!=-1;";
					String borrarEquipos = "Delete from equipos where nombre!='-';";
					String borrarPartidos = "Delete from partidos where jornada!=-1;";
					String autoInc = "ALTER TABLE jugadores AUTO_INCREMENT = 1";
					smt.executeUpdate(borrarJugadores);
					smt.executeUpdate(borrarEquipos);
					smt.executeUpdate(borrarPartidos);
					smt.executeUpdate(autoInc);
					PreparedStatement smt7 = con.prepareStatement("insert into equipos values(?,?,?,?,?,?,?,?,?,?)");
					PreparedStatement smt8 = con.prepareStatement("insert into jugadores values(?,?,?,?,?,?,?,?,?)");
					PreparedStatement smt9 = con.prepareStatement("insert into partidos values(?,?,?,?,?,?)");
					for (Division d : ventana.getDivisiones()) {
						for(Jornada j : d.getJornadas()) {
							for(Partido p: j.getPartidos()) {
								String partidos = "INSERT INTO partidos values(" + j.getNumJornada() + ",'" + p.getLocal().getNombre() + "','" + p.getVisitante().getNombre()
										+ "'," + p.getGolesLocal()+"," + p.getGolesVisitante()+","+0+ ");";
							smt9.executeUpdate(partidos);
							}
						}
						for (Equipo e : d.getEquipos()) {
							
							String SQL = "INSERT INTO equipos values('" + e.getNombre() + "'," + e.getPuntos() + ","
									+ e.getGolesAFavor() + "," + e.getGolesEnContra() + "," + e.getPartidosJugados() + ","
									+ e.getVictorias() + "," + e.getEmpates() + "," + e.getDerrotas() + ",'" + d.getNombre()
									+ "'," + 0 + ");";
							smt7.executeUpdate(SQL);
							for (Jugador j : e.getPlantilla()) {
								
								String SQL2 = "INSERT INTO jugadores (nombre,apellidos,fuerza,velocidad,resistencia,tecnica,titular,posicion,nombreEquipo) values('"
										+ j.getNombre() + "','" + j.getApellidos() + "'," + j.getFuerza() + ","
										+ j.getVelocidad() + "," + j.getResistencia() + "," + j.getTecnica() + ","
										+ j.esTitular() + ",'" + j.getPosicion() + "','" + e.getNombre() + "');";
								smt8.executeUpdate(SQL2);
							}
						}
					}
					ventana.LeerTablaBaseDatos();
					con.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				ventana.irASeleccionaEquipo();
			}
		});
		GridBagConstraints gbc_btnNuevaPartida = new GridBagConstraints();
		gbc_btnNuevaPartida.fill = GridBagConstraints.BOTH;
		gbc_btnNuevaPartida.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevaPartida.gridx = 5;
		gbc_btnNuevaPartida.gridy = 8;
		add(btnNuevaPartida, gbc_btnNuevaPartida);
		
		
		
		BotonMenu btnSalirDelJuego = new BotonMenu("Salir del juego",139, 0, 0);
		btnSalirDelJuego.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		GridBagConstraints gbc_btnSalirDelJuego = new GridBagConstraints();
		gbc_btnSalirDelJuego.fill = GridBagConstraints.BOTH;
		gbc_btnSalirDelJuego.gridx = 9;
		gbc_btnSalirDelJuego.gridy = 9;
		add(btnSalirDelJuego, gbc_btnSalirDelJuego);
		
		btnSalirDelJuego.setBackground(new Color(139, 0, 0));
		btnSalirDelJuego.setForeground(new Color(255, 255, 255));
		btnSalirDelJuego.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.getSonido().close();
				ventana.dispose();
			}
		});
		
		
		this.setVisible(true);
	}
	
	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
}
