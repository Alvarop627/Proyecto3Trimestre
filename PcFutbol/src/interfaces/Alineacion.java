package interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;

import clases.Division;
import clases.Jornada;
import clases.Jugador;
import clases.Partido;
import clases.PosicionJugador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import componentes.BotonMenu;
import excepciones.JugadorNoPerteneceAlEquipoException;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Alineacion extends JPanel {
	private Ventana ventana;
	public static JLabel numJornada;
	private JTable table;
	private ImageIcon imagen;

	public Alineacion(Ventana v) {
		super();
		this.ventana = v;
		initComponents();
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
	}

	/**
	 * @wbp.parser.constructor
	 */
	public Alineacion(Ventana v, String rutaImagen) {
		super();

		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		this.ventana = v;
		imagen = new ImageIcon(getClass().getResource(rutaImagen));
		setSize(imagen.getIconWidth(), imagen.getIconHeight());
		initComponents();

	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0 };
		gridBagLayout.columnWidths = new int[] { (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10) };
		gridBagLayout.rowHeights = new int[] { (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10), 81,
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10) };
		setLayout(gridBagLayout);

		JLabel lblAlineacion = new JLabel("ALINEACI\u00D3N");
		lblAlineacion.setForeground(Color.WHITE);
		lblAlineacion.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
		GridBagConstraints gbc_lblAlineacion = new GridBagConstraints();
		gbc_lblAlineacion.fill = GridBagConstraints.BOTH;
		gbc_lblAlineacion.gridwidth = 3;
		gbc_lblAlineacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlineacion.gridx = 0;
		gbc_lblAlineacion.gridy = 0;
		add(lblAlineacion, gbc_lblAlineacion);

		JComboBox DI = new JComboBox();
		GridBagConstraints gbc_DI = new GridBagConstraints();
		gbc_DI.ipady = 10;
		gbc_DI.ipadx = 30;
		gbc_DI.fill = GridBagConstraints.BOTH;
		gbc_DI.insets = new Insets(0, 0, 5, 5);
		gbc_DI.gridx = 3;
		gbc_DI.gridy = 1;
		ArrayList<Jugador> todosLosDi = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DI);
		DI.setModel(new DefaultComboBoxModel(todosLosDi.toArray()));
		add(DI, gbc_DI);
		ArrayList<Jugador> todosLosDd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DD);

		JComboBox MI = new JComboBox();
		GridBagConstraints gbc_MI = new GridBagConstraints();
		gbc_MI.fill = GridBagConstraints.BOTH;
		gbc_MI.ipady = 10;
		gbc_MI.ipadx = 30;
		gbc_MI.insets = new Insets(0, 0, 5, 5);
		gbc_MI.gridx = 1;
		gbc_MI.gridy = 3;
		ArrayList<Jugador> todosLosMi = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MI);

		JComboBox DD = new JComboBox();
		GridBagConstraints gbc_DD = new GridBagConstraints();
		gbc_DD.ipady = 10;
		gbc_DD.ipadx = 30;
		gbc_DD.fill = GridBagConstraints.BOTH;
		gbc_DD.insets = new Insets(0, 0, 5, 5);
		gbc_DD.gridx = 5;
		gbc_DD.gridy = 1;
		DD.setModel(new DefaultComboBoxModel(todosLosDd.toArray()));
		add(DD, gbc_DD);
		MI.setModel(new DefaultComboBoxModel(todosLosMi.toArray()));
		add(MI, gbc_MI);

		JComboBox MCI = new JComboBox();
		GridBagConstraints gbc_MCI = new GridBagConstraints();
		gbc_MCI.ipady = 10;
		gbc_MCI.ipadx = 30;
		gbc_MCI.fill = GridBagConstraints.BOTH;
		gbc_MCI.insets = new Insets(0, 0, 5, 5);
		gbc_MCI.gridx = 3;
		gbc_MCI.gridy = 3;
		ArrayList<Jugador> todosLosMci = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MCI);
		MCI.setModel(new DefaultComboBoxModel(todosLosMci.toArray()));
		add(MCI, gbc_MCI);
		ArrayList<Jugador> todosLosMcd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MCD);
		ArrayList<Jugador> todosLosMd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MD);

		JComboBox LI = new JComboBox();
		GridBagConstraints gbc_LI = new GridBagConstraints();
		gbc_LI.fill = GridBagConstraints.BOTH;
		gbc_LI.insets = new Insets(0, 0, 5, 5);
		gbc_LI.gridx = 1;
		gbc_LI.gridy = 5;
		ArrayList<Jugador> todosLosLi = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.LI);

		JComboBox MCD = new JComboBox();
		GridBagConstraints gbc_MCD = new GridBagConstraints();
		gbc_MCD.ipady = 10;
		gbc_MCD.ipadx = 30;
		gbc_MCD.fill = GridBagConstraints.BOTH;
		gbc_MCD.insets = new Insets(0, 0, 5, 5);
		gbc_MCD.gridx = 5;
		gbc_MCD.gridy = 3;
		MCD.setModel(new DefaultComboBoxModel(todosLosMcd.toArray()));
		add(MCD, gbc_MCD);

		JComboBox MD = new JComboBox();
		GridBagConstraints gbc_MD = new GridBagConstraints();
		gbc_MD.ipady = 10;
		gbc_MD.ipadx = 30;
		gbc_MD.fill = GridBagConstraints.BOTH;
		gbc_MD.insets = new Insets(0, 0, 5, 5);
		gbc_MD.gridx = 7;
		gbc_MD.gridy = 3;
		MD.setModel(new DefaultComboBoxModel(todosLosMd.toArray()));
		add(MD, gbc_MD);
		LI.setModel(new DefaultComboBoxModel(todosLosLi.toArray()));
		add(LI, gbc_LI);

		JComboBox DFCI = new JComboBox();
		GridBagConstraints gbc_DFCI = new GridBagConstraints();
		gbc_DFCI.fill = GridBagConstraints.BOTH;
		gbc_DFCI.insets = new Insets(0, 0, 5, 5);
		gbc_DFCI.gridx = 3;
		gbc_DFCI.gridy = 5;
		ArrayList<Jugador> todosLosDfci = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DFCI);
		DFCI.setModel(new DefaultComboBoxModel(todosLosDfci.toArray()));
		add(DFCI, gbc_DFCI);
		ArrayList<Jugador> todosLosDfcd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DFCD);
		ArrayList<Jugador> todosLosLd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.LD);

		JComboBox POR = new JComboBox();
		GridBagConstraints gbc_POR = new GridBagConstraints();
		gbc_POR.fill = GridBagConstraints.BOTH;
		gbc_POR.insets = new Insets(0, 0, 5, 5);
		gbc_POR.gridx = 4;
		gbc_POR.gridy = 7;
		ArrayList<Jugador> todosLosPor = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.POR);
		POR.setModel(new DefaultComboBoxModel(todosLosPor.toArray()));
		add(POR, gbc_POR);

		JComboBox DFCD = new JComboBox();
		GridBagConstraints gbc_DFCD = new GridBagConstraints();
		gbc_DFCD.fill = GridBagConstraints.BOTH;
		gbc_DFCD.insets = new Insets(0, 0, 5, 5);
		gbc_DFCD.gridx = 5;
		gbc_DFCD.gridy = 5;
		DFCD.setModel(new DefaultComboBoxModel(todosLosDfcd.toArray()));
		add(DFCD, gbc_DFCD);

		JComboBox LD = new JComboBox();
		GridBagConstraints gbc_LD = new GridBagConstraints();
		gbc_LD.fill = GridBagConstraints.BOTH;
		gbc_LD.insets = new Insets(0, 0, 5, 5);
		gbc_LD.gridx = 7;
		gbc_LD.gridy = 5;
		LD.setModel(new DefaultComboBoxModel(todosLosLd.toArray()));
		add(LD, gbc_LD);

		BotonMenu botonMenu = new BotonMenu("Men\u00FA Principal");
		botonMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		
				BotonMenu atras = new BotonMenu("Atr\u00E1s");
				atras.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						ventana.irAProximosPartidos();
					}
				});
				
						GridBagConstraints gbc_atras = new GridBagConstraints();
						gbc_atras.fill = GridBagConstraints.BOTH;
						gbc_atras.insets = new Insets(0, 0, 0, 5);
						gbc_atras.gridx = 1;
						gbc_atras.gridy = 9;
						add(atras, gbc_atras);
		GridBagConstraints gbc_botonMenu = new GridBagConstraints();
		gbc_botonMenu.fill = GridBagConstraints.BOTH;
		gbc_botonMenu.insets = new Insets(0, 0, 0, 5);
		gbc_botonMenu.gridx = 4;
		gbc_botonMenu.gridy = 9;
		add(botonMenu, gbc_botonMenu);

		// System.out.println("ALINEACION ANTES" + ventana.getMiEquipo().getAlineacion()
		// + "\n");
		BotonMenu siguiente = new BotonMenu("Siguiente");

		siguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ArrayList<Jugador> jugadoresElegidos = new ArrayList<Jugador>();
				jugadoresElegidos.add((Jugador) POR.getSelectedItem());
				jugadoresElegidos.add((Jugador) LI.getSelectedItem());
				jugadoresElegidos.add((Jugador) LD.getSelectedItem());
				jugadoresElegidos.add((Jugador) DFCD.getSelectedItem());
				jugadoresElegidos.add((Jugador) DFCI.getSelectedItem());
				jugadoresElegidos.add((Jugador) LD.getSelectedItem());
				jugadoresElegidos.add((Jugador) MD.getSelectedItem());
				jugadoresElegidos.add((Jugador) MI.getSelectedItem());
				jugadoresElegidos.add((Jugador) MCD.getSelectedItem());
				jugadoresElegidos.add((Jugador) DD.getSelectedItem());
				jugadoresElegidos.add((Jugador) DI.getSelectedItem());
				// System.out.println("JUGADORES ELEGIDOS"+jugadoresElegidos);
				for (Jugador j : jugadoresElegidos) {
					try {
						ventana.getMiEquipo().setTitular(j);
					} catch (JugadorNoPerteneceAlEquipoException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
				// System.out.println("ALINEACION DESPUES" +
				// ventana.getMiEquipo().getAlineacion() + "\n");
				ventana.getPrimera().simularSiguienteJornada();
				ventana.getSegunda().simularSiguienteJornada();
				ventana.getTercera().simularSiguienteJornada();
				try {
					Connection con;
					con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pcfutbolmini", "localhost",
							"localhost");
					/*PreparedStatement smt9 = con.prepareStatement(
							"update partidos set jornada=?,equipoLocal='?',equipoVisitante='?',gl=?,gv=?,jugado=?;");
					*/
					PreparedStatement smt9 = con.prepareStatement("insert into partidos values(?,?,?,?,?,?)");
					PreparedStatement psmt = con.prepareStatement("Delete from partidos where jornada=?;");
					String borrarPartidos = "Delete from partidos where jornada="+(ventana.getPrimera().getJornadaActual() - 1)+";";
					psmt.executeUpdate(borrarPartidos);
					for (Division d : ventana.getDivisiones()) {
						Jornada j = d.getJornadas().get(ventana.getPrimera().getJornadaActual() - 1);
						for (Partido p : j.getPartidos()) {
							
							/*
							String partidos = "update partidos set jornada=" + (j.getNumJornada()) + ",equipoLocal='"
									+ p.getLocal().getNombre() + "',equipoVisitante='" + p.getVisitante().getNombre() + "',gl="
									+ p.getGolesLocal() + ",gv=" + p.getGolesVisitante() + ",jugado=" + 1 + ";";*/
							String partidos = "INSERT INTO partidos values(" + j.getNumJornada() + ",'" + p.getLocal().getNombre() + "','" + p.getVisitante().getNombre()
									+ "'," + p.getGolesLocal()+"," + p.getGolesVisitante()+","+1+ ");";
							smt9.executeUpdate(partidos);
						}
					}

					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				ventana.crearInterfazResultados();
				if (ventana.getResultados() != null) {
					ventana.repintarResultados();
				}
				ventana.irAResultados();
			}
		});

		siguiente.setText("Siguiente");
		GridBagConstraints gbc_siguiente = new GridBagConstraints();
		gbc_siguiente.insets = new Insets(0, 0, 0, 5);
		gbc_siguiente.fill = GridBagConstraints.BOTH;
		gbc_siguiente.gridx = 7;
		gbc_siguiente.gridy = 9;

		add(siguiente, gbc_siguiente);
		this.setVisible(true);
	}

	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
}
