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

public class Resultados extends JPanel {
	private Ventana ventana;
	private JTable resultados1;
	private JTable resultados2;
	private JTable resultados3;
	private ImageIcon imagen;

	public Resultados(Ventana v) {
		super();
		this.ventana = v;
		this.initComponents();
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
	}

	/**
	 * @wbp.parser.constructor
	 */
	public Resultados(Ventana v, String rutaImagen) {
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
				34,
				86,
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10) };
		setLayout(gridBagLayout);
		Division d = ventana.getPrimera();
		Division d2 = ventana.getSegunda();
		Division d3 = ventana.getTercera();
		
				JLabel numJornada = new JLabel();
				numJornada.setForeground(Color.WHITE);
				numJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
				GridBagConstraints gbc_numJornada = new GridBagConstraints();
				gbc_numJornada.gridwidth = 2;
				gbc_numJornada.anchor = GridBagConstraints.NORTHWEST;
				gbc_numJornada.insets = new Insets(0, 0, 5, 5);
				gbc_numJornada.gridx = 2;
				gbc_numJornada.gridy = 0;
				add(numJornada, gbc_numJornada);
				// System.out.println("Proxima: "+ ventana.getPrimera().getJornadaActual()-1);
				numJornada.setText(ventana.getPrimera().getJornadaActual() + "");
		
				JLabel resultados = new JLabel("RESULTADOS");
				resultados.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
				resultados.setForeground(Color.WHITE);
				GridBagConstraints gbc_resultados = new GridBagConstraints();
				gbc_resultados.gridwidth = 2;
				gbc_resultados.anchor = GridBagConstraints.NORTHEAST;
				gbc_resultados.insets = new Insets(0, 0, 5, 5);
				gbc_resultados.gridx = 8;
				gbc_resultados.gridy = 0;
				add(resultados, gbc_resultados);

		resultados1 = new JTable();
		resultados1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		resultados1.setShowVerticalLines(false);
		resultados1.setRowHeight(50);
		resultados1.setBounds(100, 50, 208, 115);
		resultados1
				.setModel(new DefaultTableModel(
						new Object[][] {
								{ d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[0].getLocal().getNombre(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[0].getGolesLocal(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[0].getGolesVisitante(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[0].getVisitante()
												.getNombre() },
								{ d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[1].getLocal().getNombre(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[1].getGolesLocal(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[1].getGolesVisitante(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[1].getVisitante()
												.getNombre() },
								{ d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[2].getLocal().getNombre(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[2].getGolesLocal(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[2].getGolesVisitante(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[2].getVisitante()
												.getNombre() },
								{ d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[3].getLocal().getNombre(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[3].getGolesLocal(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[3].getGolesVisitante(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[3].getVisitante()
												.getNombre() },
								{ d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[4].getLocal().getNombre(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[4].getGolesLocal(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[4].getGolesVisitante(),
										d.getJornadas().get(d.getJornadaActual()-1).getPartidos()[4].getVisitante()
												.getNombre() }, },
						new String[] { "Local", "Goles Local", "Goles Visitante", "Visitante" }) {
					Class[] columnTypes = new Class[] { String.class, int.class, int.class, String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});

		GridBagConstraints gbc_resultados1 = new GridBagConstraints();
		gbc_resultados1.gridheight = 2;
		gbc_resultados1.fill = GridBagConstraints.BOTH;
		gbc_resultados1.gridwidth = 4;
		gbc_resultados1.insets = new Insets(0, 0, 5, 5);
		gbc_resultados1.gridx = 0;
		gbc_resultados1.gridy = 2;
		add(resultados1, gbc_resultados1);

		resultados2 = new JTable();
		resultados2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		resultados2.setShowVerticalLines(false);
		resultados2.setRowHeight(50);
		resultados2.setModel(new DefaultTableModel(
				new Object[][] {
						{ d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[0].getLocal().getNombre(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[0].getGolesLocal(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[0].getGolesVisitante(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[0].getVisitante()
										.getNombre() },
						{ d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[1].getLocal().getNombre(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[1].getGolesLocal(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[1].getGolesVisitante(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[1].getVisitante()
										.getNombre() },
						{ d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[2].getLocal().getNombre(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[2].getGolesLocal(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[2].getGolesVisitante(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[2].getVisitante()
										.getNombre() },
						{ d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[3].getLocal().getNombre(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[3].getGolesLocal(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[3].getGolesVisitante(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[3].getVisitante()
										.getNombre() },
						{ d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[4].getLocal().getNombre(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[4].getGolesLocal(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[4].getGolesVisitante(),
								d2.getJornadas().get(d2.getJornadaActual()-1).getPartidos()[4].getVisitante()
										.getNombre() }, },
				new String[] { "Local", "Goles Local", "Goles Visitante", "Visitante" }) {
			Class[] columnTypes = new Class[] { String.class, int.class, int.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		GridBagConstraints gbc_resultados2 = new GridBagConstraints();
		gbc_resultados2.gridheight = 2;
		gbc_resultados2.fill = GridBagConstraints.BOTH;
		gbc_resultados2.gridwidth = 4;
		gbc_resultados2.insets = new Insets(0, 0, 5, 0);
		gbc_resultados2.gridx = 6;
		gbc_resultados2.gridy = 2;
		add(resultados2, gbc_resultados2);

		resultados3 = new JTable();
		resultados3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		resultados3.setRowHeight(50);
		resultados3.setShowVerticalLines(false);
		resultados3.setBounds(150, 200, 208, 115);
		resultados3.setModel(new DefaultTableModel(
				new Object[][] {
						{ d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[0].getLocal().getNombre(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[0].getGolesLocal(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[0].getGolesVisitante(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[0].getVisitante()
										.getNombre() },
						{ d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[1].getLocal().getNombre(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[1].getGolesLocal(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[1].getGolesVisitante(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[1].getVisitante()
										.getNombre() },
						{ d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[2].getLocal().getNombre(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[2].getGolesLocal(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[2].getGolesVisitante(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[2].getVisitante()
										.getNombre() },
						{ d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[3].getLocal().getNombre(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[3].getGolesLocal(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[3].getGolesVisitante(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[3].getVisitante()
										.getNombre() },
						{ d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[4].getLocal().getNombre(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[4].getGolesLocal(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[4].getGolesVisitante(),
								d3.getJornadas().get(d3.getJornadaActual()-1).getPartidos()[4].getVisitante()
										.getNombre() }, },
				new String[] { "Local", "Goles Local", "Goles Visitante", "Visitante" }) {
			Class[] columnTypes = new Class[] { String.class, int.class, int.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		GridBagConstraints gbc_resultados3 = new GridBagConstraints();
		gbc_resultados3.gridheight = 2;
		gbc_resultados3.fill = GridBagConstraints.BOTH;
		gbc_resultados3.gridwidth = 4;
		gbc_resultados3.insets = new Insets(0, 0, 5, 5);
		gbc_resultados3.gridx = 3;
		gbc_resultados3.gridy = 5;
		add(resultados3, gbc_resultados3);

		JLabel lblJornada = new JLabel("JORNADA");
		lblJornada.setForeground(new Color(255, 255, 255));
		lblJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
		GridBagConstraints gbc_lblJornada = new GridBagConstraints();
		gbc_lblJornada.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblJornada.gridwidth = 2;
		gbc_lblJornada.anchor = GridBagConstraints.NORTH;
		gbc_lblJornada.insets = new Insets(0, 0, 5, 5);
		gbc_lblJornada.gridx = 0;
		gbc_lblJornada.gridy = 0;
		add(lblJornada, gbc_lblJornada);
								
										BotonMenu atras = new BotonMenu("Atr\u00E1s");
										atras.addMouseListener(new MouseAdapter() {
											@Override
											public void mouseClicked(MouseEvent arg0) {
												ventana.irAEligeCargarNueva();
											}
										});
										GridBagConstraints gbc_atras = new GridBagConstraints();
										gbc_atras.fill = GridBagConstraints.BOTH;
										gbc_atras.insets = new Insets(0, 0, 0, 5);
										gbc_atras.gridx = 0;
										gbc_atras.gridy = 9;
										add(atras, gbc_atras);
										
												BotonMenu siguiente = new BotonMenu("Siguiente");
												siguiente.addMouseListener(new MouseAdapter() {
													@Override
													public void mouseClicked(MouseEvent arg0) {
														if (ventana.getClasificacion() != null) {
															ventana.repintarClasificaciones();
															ventana.irAClasificacionJornada();

														}
													}
												});
												siguiente.setText("Siguiente");
												GridBagConstraints gbc_siguiente = new GridBagConstraints();
												gbc_siguiente.fill = GridBagConstraints.BOTH;
												gbc_siguiente.gridx = 9;
												gbc_siguiente.gridy = 9;
												add(siguiente, gbc_siguiente);

		this.setVisible(true);
	}

	/**
	 * @return the resultados1
	 */
	public JTable getResultados1() {
		return resultados1;
	}

	/**
	 * @return the resultados2
	 */
	public JTable getResultados2() {
		return resultados2;
	}

	/**
	 * @return the resultados3
	 */
	public JTable getResultados3() {
		return resultados3;
	}

	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
}
