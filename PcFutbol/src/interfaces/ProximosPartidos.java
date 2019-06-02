package interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clases.Division;
import componentes.BotonMenu;

public class ProximosPartidos extends JPanel {
	private Ventana ventana;
	private JLabel numJornada;
	private JTable partidos1;

	/**
	 * @return the partidos1
	 */
	public JTable getPartidos1() {
		return partidos1;
	}

	/**
	 * @return the partidos2
	 */
	public JTable getPartidos2() {
		return partidos2;
	}

	/**
	 * @return the partidos3
	 */
	public JTable getPartidos3() {
		return partidos3;
	}

	private JTable partidos2;
	private JTable partidos3;
	private ImageIcon imagen;

	public ProximosPartidos(Ventana v) {
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
	public ProximosPartidos(Ventana v, String rutaImagen) {
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
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
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
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10) };
		setLayout(gridBagLayout);
		Division d = ventana.getPrimera();
		Division d2 = ventana.getSegunda();
		Division d3 = ventana.getTercera();

		JLabel lblJornada = new JLabel("JORNADA");
		lblJornada.setForeground(new Color(255, 255, 255));
		lblJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
		GridBagConstraints gbc_lblJornada = new GridBagConstraints();
		gbc_lblJornada.gridwidth = 2;
		gbc_lblJornada.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblJornada.anchor = GridBagConstraints.NORTH;
		gbc_lblJornada.insets = new Insets(0, 0, 5, 5);
		gbc_lblJornada.gridx = 0;
		gbc_lblJornada.gridy = 0;
		add(lblJornada, gbc_lblJornada);
				
						JLabel numJornada_1 = new JLabel();
						numJornada_1.setForeground(Color.WHITE);
						numJornada_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
						numJornada_1.setText(ventana.getPrimera().getJornadaActual()+1 + "");
						GridBagConstraints gbc_numJornada_1 = new GridBagConstraints();
						gbc_numJornada_1.fill = GridBagConstraints.HORIZONTAL;
						gbc_numJornada_1.anchor = GridBagConstraints.NORTH;
						gbc_numJornada_1.insets = new Insets(0, 0, 5, 5);
						gbc_numJornada_1.gridx = 2;
						gbc_numJornada_1.gridy = 0;
						add(numJornada_1, gbc_numJornada_1);
		
				JLabel partidos = new JLabel("PR\u00D3XIMOS PARTIDOS");
				partidos.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
				partidos.setForeground(Color.WHITE);
				GridBagConstraints gbc_partidos = new GridBagConstraints();
				gbc_partidos.gridwidth = 4;
				gbc_partidos.anchor = GridBagConstraints.NORTH;
				gbc_partidos.fill = GridBagConstraints.HORIZONTAL;
				gbc_partidos.insets = new Insets(0, 0, 5, 0);
				gbc_partidos.gridx = 6;
				gbc_partidos.gridy = 0;
				add(partidos, gbc_partidos);
								partidos1 = new JTable();
								partidos1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
								partidos1.setShowVerticalLines(false);
								partidos1.setRowHeight(50);
								partidos1.setBounds(100, 50, 208, 115);
								partidos1
										.setModel(new DefaultTableModel(
												new Object[][] {
														{ d.getJornadas().get(d.getJornadaActual()).getPartidos()[0].getLocal().getNombre(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[0].getGolesLocal(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[0].getGolesVisitante(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[0].getVisitante()
																		.getNombre() },
														{ d.getJornadas().get(d.getJornadaActual()).getPartidos()[1].getLocal().getNombre(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[1].getGolesLocal(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[1].getGolesVisitante(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[1].getVisitante()
																		.getNombre() },
														{ d.getJornadas().get(d.getJornadaActual()).getPartidos()[2].getLocal().getNombre(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[2].getGolesLocal(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[2].getGolesVisitante(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[2].getVisitante()
																		.getNombre() },
														{ d.getJornadas().get(d.getJornadaActual()).getPartidos()[3].getLocal().getNombre(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[3].getGolesLocal(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[3].getGolesVisitante(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[3].getVisitante()
																		.getNombre() },
														{ d.getJornadas().get(d.getJornadaActual()).getPartidos()[4].getLocal().getNombre(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[4].getGolesLocal(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[4].getGolesVisitante(),
																d.getJornadas().get(d.getJornadaActual()).getPartidos()[4].getVisitante()
																		.getNombre() }, },
												new String[] { "Local", "Goles Local", "Goles Visitante", "Visitante" }) {
											Class[] columnTypes = new Class[] { String.class, int.class, int.class, String.class };

											public Class getColumnClass(int columnIndex) {
												return columnTypes[columnIndex];
											}
										});
								
										GridBagConstraints gbc_partidos1 = new GridBagConstraints();
										gbc_partidos1.gridheight = 2;
										gbc_partidos1.fill = GridBagConstraints.BOTH;
										gbc_partidos1.gridwidth = 4;
										gbc_partidos1.insets = new Insets(0, 0, 5, 5);
										gbc_partidos1.gridx = 0;
										gbc_partidos1.gridy = 2;
										add(partidos1, gbc_partidos1);
						
								partidos2 = new JTable();
								partidos2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
								partidos2.setShowVerticalLines(false);
								partidos2.setRowHeight(50);
								partidos2.setModel(new DefaultTableModel(
										new Object[][] {
												{ d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[0].getLocal().getNombre(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[0].getGolesLocal(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[0].getGolesVisitante(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[0].getVisitante()
																.getNombre() },
												{ d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[1].getLocal().getNombre(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[1].getGolesLocal(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[1].getGolesVisitante(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[1].getVisitante()
																.getNombre() },
												{ d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[2].getLocal().getNombre(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[2].getGolesLocal(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[2].getGolesVisitante(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[2].getVisitante()
																.getNombre() },
												{ d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[3].getLocal().getNombre(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[3].getGolesLocal(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[3].getGolesVisitante(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[3].getVisitante()
																.getNombre() },
												{ d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[4].getLocal().getNombre(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[4].getGolesLocal(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[4].getGolesVisitante(),
														d2.getJornadas().get(d2.getJornadaActual()).getPartidos()[4].getVisitante()
																.getNombre() }, },
										new String[] { "Local", "Goles Local", "Goles Visitante", "Visitante" }) {
									Class[] columnTypes = new Class[] { String.class, int.class, int.class, String.class };

									public Class getColumnClass(int columnIndex) {
										return columnTypes[columnIndex];
									}
								});
								
										GridBagConstraints gbc_partidos2 = new GridBagConstraints();
										gbc_partidos2.gridheight = 2;
										gbc_partidos2.fill = GridBagConstraints.BOTH;
										gbc_partidos2.gridwidth = 4;
										gbc_partidos2.insets = new Insets(0, 0, 5, 0);
										gbc_partidos2.gridx = 6;
										gbc_partidos2.gridy = 2;
										add(partidos2, gbc_partidos2);
														
																BotonMenu siguiente = new BotonMenu("Siguiente");
																siguiente.addMouseListener(new MouseAdapter() {
																	@Override
																	public void mouseClicked(MouseEvent arg0) {
																		
																		ventana.crearInterfazAlineacion();
																		ventana.irAAlineacion();
																	}
																});
																
																		BotonMenu atras = new BotonMenu("Atr\u00E1s");
																		atras.addMouseListener(new MouseAdapter() {
																			@Override
																			public void mouseClicked(MouseEvent arg0) {
																				ventana.irAClasificacionJornada();
																			}
																		});
																		
																				partidos3 = new JTable();
																				partidos3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
																				partidos3.setRowHeight(50);
																				partidos3.setShowVerticalLines(false);
																				partidos3.setBounds(150, 200, 208, 115);
																				partidos3.setModel(new DefaultTableModel(
																						new Object[][] {
																								{ d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[0].getLocal().getNombre(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[0].getGolesLocal(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[0].getGolesVisitante(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[0].getVisitante()
																												.getNombre() },
																								{ d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[1].getLocal().getNombre(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[1].getGolesLocal(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[1].getGolesVisitante(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[1].getVisitante()
																												.getNombre() },
																								{ d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[2].getLocal().getNombre(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[2].getGolesLocal(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[2].getGolesVisitante(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[2].getVisitante()
																												.getNombre() },
																								{ d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[3].getLocal().getNombre(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[3].getGolesLocal(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[3].getGolesVisitante(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[3].getVisitante()
																												.getNombre() },
																								{ d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[4].getLocal().getNombre(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[4].getGolesLocal(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[4].getGolesVisitante(),
																										d3.getJornadas().get(d3.getJornadaActual()).getPartidos()[4].getVisitante()
																												.getNombre() }, },
																						new String[] { "Local", "Goles Local", "Goles Visitante", "Visitante" }) {
																					Class[] columnTypes = new Class[] { String.class, int.class, int.class, String.class };

																					public Class getColumnClass(int columnIndex) {
																						return columnTypes[columnIndex];
																					}
																				});
																				
																						GridBagConstraints gbc_partidos3 = new GridBagConstraints();
																						gbc_partidos3.gridheight = 2;
																						gbc_partidos3.fill = GridBagConstraints.BOTH;
																						gbc_partidos3.gridwidth = 4;
																						gbc_partidos3.insets = new Insets(0, 0, 5, 5);
																						gbc_partidos3.gridx = 3;
																						gbc_partidos3.gridy = 5;
																						add(partidos3, gbc_partidos3);
																		GridBagConstraints gbc_atras = new GridBagConstraints();
																		gbc_atras.fill = GridBagConstraints.BOTH;
																		gbc_atras.insets = new Insets(0, 0, 0, 5);
																		gbc_atras.gridx = 0;
																		gbc_atras.gridy = 9;
																		add(atras, gbc_atras);
																
																BotonMenu botonMenu = new BotonMenu("Men\u00FA Principal");
																botonMenu.addMouseListener(new MouseAdapter() {
																	@Override
																	public void mouseClicked(MouseEvent e) {
																		ventana.irAEligeCargarNueva();
																	}
																});
																GridBagConstraints gbc_botonMenu = new GridBagConstraints();
																gbc_botonMenu.gridwidth = 2;
																gbc_botonMenu.fill = GridBagConstraints.BOTH;
																gbc_botonMenu.insets = new Insets(0, 0, 0, 5);
																gbc_botonMenu.gridx = 4;
																gbc_botonMenu.gridy = 9;
																add(botonMenu, gbc_botonMenu);
																
																
																siguiente.setText("Siguiente");
																GridBagConstraints gbc_siguiente = new GridBagConstraints();
																gbc_siguiente.fill = GridBagConstraints.BOTH;
																gbc_siguiente.gridx = 9;
																gbc_siguiente.gridy = 9;
																add(siguiente, gbc_siguiente);

		this.setVisible(true);

	}

	public void repintar() {
		this.removeAll();
		this.initComponents();
	}

	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
}
