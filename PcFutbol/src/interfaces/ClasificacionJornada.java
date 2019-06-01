package interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import clases.Division;
import clases.Jornada;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import componentes.BotonMenu;
import componentes.MiPanel;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JSpinner;

public class ClasificacionJornada extends JPanel {
	private Ventana ventana;
	ImageIcon imagen;
	public static JLabel numJornada;
	private JTable clasificacion1;
	private JTable clasificacion2;
	private JTable clasificacion3;

	public ClasificacionJornada(Ventana v) {
		super();
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		this.ventana = v;
		initComponents();
	}

	/**
	 * @wbp.parser.constructor
	 */
	public ClasificacionJornada(Ventana v, String rutaImagen) {
		super();
		// setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension(1920, 1080));
		this.ventana = v;
		imagen = new ImageIcon(getClass().getResource(rutaImagen));
		setSize(imagen.getIconWidth(), imagen.getIconHeight());
		initComponents();
	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		Division d = ventana.getPrimera();
		Division d2 = ventana.getSegunda();
		Division d3 = ventana.getTercera();
		gridBagLayout.columnWidths = new int[] { (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 10), };
		gridBagLayout.rowHeights = new int[] { (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 10) };
		setLayout(gridBagLayout);

		clasificacion1 = new JTable();
		clasificacion1.setBounds(20, 39, 241, 119);
		clasificacion1.setModel(new DefaultTableModel(new Object[][] {
				{ "<html><b>NOMBRE</html>", "<html><b>PJ</html>", "<html><b>PTS</html>", "<html><b>V</html>",
						"<html><b>E</html>", "<html><b>D</html>", "<html><b>GF</html>", "<html><b>GC</html>",
						"<html><b>DG</html>" },
				{ d.getClasificacion().get(0).getNombre(), d.getClasificacion().get(0).getPartidosJugados(),
						d.getClasificacion().get(0).getPuntos(), d.getClasificacion().get(0).getVictorias(),
						d.getClasificacion().get(0).getEmpates(), d.getClasificacion().get(0).getDerrotas(),
						d.getClasificacion().get(0).getGolesAFavor(), d.getClasificacion().get(0).getGolesEnContra(),
						d.getClasificacion().get(0).getDifGoles() },
				{ d.getClasificacion().get(1).getNombre(), d.getClasificacion().get(1).getPartidosJugados(),
						d.getClasificacion().get(1).getPuntos(), d.getClasificacion().get(1).getVictorias(),
						d.getClasificacion().get(1).getEmpates(), d.getClasificacion().get(1).getDerrotas(),
						d.getClasificacion().get(1).getGolesAFavor(), d.getClasificacion().get(1).getGolesEnContra(),
						d.getClasificacion().get(1).getDifGoles() },
				{ d.getClasificacion().get(2).getNombre(), d.getClasificacion().get(2).getPartidosJugados(),
						d.getClasificacion().get(2).getPuntos(), d.getClasificacion().get(2).getVictorias(),
						d.getClasificacion().get(2).getEmpates(), d.getClasificacion().get(2).getDerrotas(),
						d.getClasificacion().get(2).getGolesAFavor(), d.getClasificacion().get(2).getGolesEnContra(),
						d.getClasificacion().get(2).getDifGoles() },
				{ d.getClasificacion().get(3).getNombre(), d.getClasificacion().get(3).getPartidosJugados(),
						d.getClasificacion().get(3).getPuntos(), d.getClasificacion().get(3).getVictorias(),
						d.getClasificacion().get(3).getEmpates(), d.getClasificacion().get(3).getDerrotas(),
						d.getClasificacion().get(3).getGolesAFavor(), d.getClasificacion().get(3).getGolesEnContra(),
						d.getClasificacion().get(3).getDifGoles() },
				{ d.getClasificacion().get(4).getNombre(), d.getClasificacion().get(4).getPartidosJugados(),
						d.getClasificacion().get(4).getPuntos(), d.getClasificacion().get(4).getVictorias(),
						d.getClasificacion().get(4).getEmpates(), d.getClasificacion().get(4).getDerrotas(),
						d.getClasificacion().get(4).getGolesAFavor(), d.getClasificacion().get(4).getGolesEnContra(),
						d.getClasificacion().get(4).getDifGoles() },
				{ d.getClasificacion().get(5).getNombre(), d.getClasificacion().get(5).getPartidosJugados(),
						d.getClasificacion().get(5).getPuntos(), d.getClasificacion().get(5).getVictorias(),
						d.getClasificacion().get(5).getEmpates(), d.getClasificacion().get(5).getDerrotas(),
						d.getClasificacion().get(5).getGolesAFavor(), d.getClasificacion().get(5).getGolesEnContra(),
						d.getClasificacion().get(5).getDifGoles() },
				{ d.getClasificacion().get(6).getNombre(), d.getClasificacion().get(6).getPartidosJugados(),
						d.getClasificacion().get(6).getPuntos(), d.getClasificacion().get(6).getVictorias(),
						d.getClasificacion().get(6).getEmpates(), d.getClasificacion().get(6).getDerrotas(),
						d.getClasificacion().get(6).getGolesAFavor(), d.getClasificacion().get(6).getGolesEnContra(),
						d.getClasificacion().get(6).getDifGoles() },
				{ d.getClasificacion().get(7).getNombre(), d.getClasificacion().get(7).getPartidosJugados(),
						d.getClasificacion().get(7).getPuntos(), d.getClasificacion().get(7).getVictorias(),
						d.getClasificacion().get(7).getEmpates(), d.getClasificacion().get(7).getDerrotas(),
						d.getClasificacion().get(7).getGolesAFavor(), d.getClasificacion().get(7).getGolesEnContra(),
						d.getClasificacion().get(7).getDifGoles() },
				{ d.getClasificacion().get(8).getNombre(), d.getClasificacion().get(8).getPartidosJugados(),
						d.getClasificacion().get(8).getPuntos(), d.getClasificacion().get(8).getVictorias(),
						d.getClasificacion().get(8).getEmpates(), d.getClasificacion().get(8).getDerrotas(),
						d.getClasificacion().get(8).getGolesAFavor(), d.getClasificacion().get(8).getGolesEnContra(),
						d.getClasificacion().get(8).getDifGoles() },
				{ d.getClasificacion().get(9).getNombre(), d.getClasificacion().get(9).getPartidosJugados(),
						d.getClasificacion().get(9).getPuntos(), d.getClasificacion().get(9).getVictorias(),
						d.getClasificacion().get(9).getEmpates(), d.getClasificacion().get(9).getDerrotas(),
						d.getClasificacion().get(9).getGolesAFavor(), d.getClasificacion().get(9).getGolesEnContra(),
						d.getClasificacion().get(9).getDifGoles() }, },
				new String[] { "Nombre", "PJ", "PTS", "V", "E", "D", "GF", "GC", "DG" }) {
			Class[] columnTypes = new Class[] { String.class, Integer.class, Integer.class, Integer.class,
					Integer.class, Integer.class, Integer.class, Integer.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		clasificacion1.getColumnModel().getColumn(0).setPreferredWidth(23);
		clasificacion1.getColumnModel().getColumn(1).setPreferredWidth(30);
		clasificacion1.getColumnModel().getColumn(2).setPreferredWidth(44);
		clasificacion1.getColumnModel().getColumn(3).setPreferredWidth(30);
		clasificacion1.getColumnModel().getColumn(4).setPreferredWidth(30);
		clasificacion1.getColumnModel().getColumn(5).setPreferredWidth(30);
		clasificacion1.getColumnModel().getColumn(6).setPreferredWidth(30);
		clasificacion1.getColumnModel().getColumn(7).setPreferredWidth(30);
		clasificacion1.getColumnModel().getColumn(8).setPreferredWidth(30);
		
				JLabel lblJornada = new JLabel("JORNADA");
				lblJornada.setForeground(new Color(255, 255, 255));
				lblJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
				GridBagConstraints gbc_lblJornada = new GridBagConstraints();
				gbc_lblJornada.gridwidth = 2;
				gbc_lblJornada.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblJornada.anchor = GridBagConstraints.NORTH;
				gbc_lblJornada.insets = new Insets(0, 0, 5, 5);
				gbc_lblJornada.gridx = 0;
				gbc_lblJornada.gridy = 1;
				add(lblJornada, gbc_lblJornada);
		// --------------------------------------------------------------

		numJornada = new JLabel();
		
				numJornada.setForeground(Color.WHITE);
				numJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
				GridBagConstraints gbc_numJornada = new GridBagConstraints();
				gbc_numJornada.anchor = GridBagConstraints.NORTHWEST;
				gbc_numJornada.insets = new Insets(0, 0, 5, 5);
				gbc_numJornada.gridx = 2;
				gbc_numJornada.gridy = 1;
				numJornada.setText(ventana.getPrimera().getJornadaActual() + "");
				add(numJornada, gbc_numJornada);
		
				JLabel lblClasificacion = new JLabel("CLASIFICACI\u00D3N");
				lblClasificacion.setForeground(Color.WHITE);
				lblClasificacion.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
				GridBagConstraints gbc_lblClasificacion = new GridBagConstraints();
				gbc_lblClasificacion.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblClasificacion.insets = new Insets(0, 0, 5, 0);
				gbc_lblClasificacion.gridwidth = 4;
				gbc_lblClasificacion.gridx = 7;
				gbc_lblClasificacion.gridy = 1;
				add(lblClasificacion, gbc_lblClasificacion);
		add(clasificacion1);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.gridwidth = 5;
		gbc_table.gridx = 0;
		gbc_table.gridy = 3;
		add(clasificacion1, gbc_table);

		// ---------------------------------------------------------------------
		clasificacion2 = new JTable();
		clasificacion2.setBounds(20, 39, 241, 119);
		clasificacion2.setModel(new DefaultTableModel(new Object[][] {
				{ "<html><b>NOMBRE</html>", "<html><b>PJ</html>", "<html><b>PTS</html>", "<html><b>V</html>",
						"<html><b>E</html>", "<html><b>D</html>", "<html><b>GF</html>", "<html><b>GC</html>",
						"<html><b>DG</html>" },
				{ d2.getClasificacion().get(0).getNombre(), d2.getClasificacion().get(0).getPartidosJugados(),
						d2.getClasificacion().get(0).getPuntos(), d2.getClasificacion().get(0).getVictorias(),
						d2.getClasificacion().get(0).getEmpates(), d2.getClasificacion().get(0).getDerrotas(),
						d2.getClasificacion().get(0).getGolesAFavor(), d2.getClasificacion().get(0).getGolesEnContra(),
						d2.getClasificacion().get(0).getDifGoles() },
				{ d2.getClasificacion().get(1).getNombre(), d2.getClasificacion().get(1).getPartidosJugados(),
						d2.getClasificacion().get(1).getPuntos(), d2.getClasificacion().get(1).getVictorias(),
						d2.getClasificacion().get(1).getEmpates(), d2.getClasificacion().get(1).getDerrotas(),
						d2.getClasificacion().get(1).getGolesAFavor(), d2.getClasificacion().get(1).getGolesEnContra(),
						d2.getClasificacion().get(1).getDifGoles() },
				{ d2.getClasificacion().get(2).getNombre(), d2.getClasificacion().get(2).getPartidosJugados(),
						d2.getClasificacion().get(2).getPuntos(), d2.getClasificacion().get(2).getVictorias(),
						d2.getClasificacion().get(2).getEmpates(), d2.getClasificacion().get(2).getDerrotas(),
						d2.getClasificacion().get(2).getGolesAFavor(), d2.getClasificacion().get(2).getGolesEnContra(),
						d2.getClasificacion().get(2).getDifGoles() },
				{ d2.getClasificacion().get(3).getNombre(), d2.getClasificacion().get(3).getPartidosJugados(),
						d2.getClasificacion().get(3).getPuntos(), d2.getClasificacion().get(3).getVictorias(),
						d2.getClasificacion().get(3).getEmpates(), d2.getClasificacion().get(3).getDerrotas(),
						d2.getClasificacion().get(3).getGolesAFavor(), d2.getClasificacion().get(3).getGolesEnContra(),
						d2.getClasificacion().get(3).getDifGoles() },
				{ d2.getClasificacion().get(4).getNombre(), d2.getClasificacion().get(4).getPartidosJugados(),
						d2.getClasificacion().get(4).getPuntos(), d2.getClasificacion().get(4).getVictorias(),
						d2.getClasificacion().get(4).getEmpates(), d2.getClasificacion().get(4).getDerrotas(),
						d2.getClasificacion().get(4).getGolesAFavor(), d2.getClasificacion().get(4).getGolesEnContra(),
						d2.getClasificacion().get(4).getDifGoles() },
				{ d2.getClasificacion().get(5).getNombre(), d2.getClasificacion().get(5).getPartidosJugados(),
						d2.getClasificacion().get(5).getPuntos(), d2.getClasificacion().get(5).getVictorias(),
						d2.getClasificacion().get(5).getEmpates(), d2.getClasificacion().get(5).getDerrotas(),
						d2.getClasificacion().get(5).getGolesAFavor(), d2.getClasificacion().get(5).getGolesEnContra(),
						d2.getClasificacion().get(5).getDifGoles() },
				{ d2.getClasificacion().get(6).getNombre(), d2.getClasificacion().get(6).getPartidosJugados(),
						d2.getClasificacion().get(6).getPuntos(), d2.getClasificacion().get(6).getVictorias(),
						d2.getClasificacion().get(6).getEmpates(), d2.getClasificacion().get(6).getDerrotas(),
						d2.getClasificacion().get(6).getGolesAFavor(), d2.getClasificacion().get(6).getGolesEnContra(),
						d2.getClasificacion().get(6).getDifGoles() },
				{ d2.getClasificacion().get(7).getNombre(), d2.getClasificacion().get(7).getPartidosJugados(),
						d2.getClasificacion().get(7).getPuntos(), d2.getClasificacion().get(7).getVictorias(),
						d2.getClasificacion().get(7).getEmpates(), d2.getClasificacion().get(7).getDerrotas(),
						d2.getClasificacion().get(7).getGolesAFavor(), d2.getClasificacion().get(7).getGolesEnContra(),
						d2.getClasificacion().get(7).getDifGoles() },
				{ d2.getClasificacion().get(8).getNombre(), d2.getClasificacion().get(8).getPartidosJugados(),
						d2.getClasificacion().get(8).getPuntos(), d2.getClasificacion().get(8).getVictorias(),
						d2.getClasificacion().get(8).getEmpates(), d2.getClasificacion().get(8).getDerrotas(),
						d2.getClasificacion().get(8).getGolesAFavor(), d2.getClasificacion().get(8).getGolesEnContra(),
						d2.getClasificacion().get(8).getDifGoles() },
				{ d2.getClasificacion().get(9).getNombre(), d2.getClasificacion().get(9).getPartidosJugados(),
						d2.getClasificacion().get(9).getPuntos(), d2.getClasificacion().get(9).getVictorias(),
						d2.getClasificacion().get(9).getEmpates(), d2.getClasificacion().get(9).getDerrotas(),
						d2.getClasificacion().get(9).getGolesAFavor(), d2.getClasificacion().get(9).getGolesEnContra(),
						d2.getClasificacion().get(9).getDifGoles() }, },
				new String[] { "Nombre", "PJ", "PTS", "V", "E", "D", "GF", "GC", "DG" }) {
			Class[] columnTypes = new Class[] { String.class, Integer.class, Integer.class, Integer.class,
					Integer.class, Integer.class, Integer.class, Integer.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		clasificacion2.getColumnModel().getColumn(0).setPreferredWidth(23);
		clasificacion2.getColumnModel().getColumn(1).setPreferredWidth(30);
		clasificacion2.getColumnModel().getColumn(2).setPreferredWidth(44);
		clasificacion2.getColumnModel().getColumn(3).setPreferredWidth(30);
		clasificacion2.getColumnModel().getColumn(4).setPreferredWidth(30);
		clasificacion2.getColumnModel().getColumn(5).setPreferredWidth(30);
		clasificacion2.getColumnModel().getColumn(6).setPreferredWidth(30);
		clasificacion2.getColumnModel().getColumn(7).setPreferredWidth(30);
		clasificacion2.getColumnModel().getColumn(8).setPreferredWidth(30);
		add(clasificacion2);
		GridBagConstraints gbc_clasificacion2 = new GridBagConstraints();
		gbc_clasificacion2.fill = GridBagConstraints.HORIZONTAL;
		gbc_clasificacion2.insets = new Insets(0, 0, 5, 5);
		gbc_clasificacion2.gridwidth = 4;
		gbc_clasificacion2.gridx = 6;
		gbc_clasificacion2.gridy = 3;
		add(clasificacion2, gbc_clasificacion2);
		
		
		
				BotonMenu atras = new BotonMenu("Atr\u00E1s");
				atras.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						ventana.irASeleccionaEquipo();
					}
				});
				
				MiPanel panel = new MiPanel(ventana,"../imagenes/clasificacion.png");
				GridBagConstraints gbc_panel = new GridBagConstraints();
				gbc_panel.gridwidth = 2;
				gbc_panel.gridheight = 4;
				gbc_panel.insets = new Insets(0, 0, 0, 5);
				gbc_panel.fill = GridBagConstraints.BOTH;
				gbc_panel.gridx = 1;
				gbc_panel.gridy = 5;
				add(panel, gbc_panel);
				
				//-----------------------------------------------------------------------
				clasificacion3 = new JTable();
				clasificacion3.setBounds(20, 39, 241, 119);	
				clasificacion3.setModel(new DefaultTableModel(new Object[][] {
					{ "<html><b>NOMBRE</html>", "<html><b>PJ</html>", "<html><b>PTS</html>", "<html><b>V</html>",
							"<html><b>E</html>", "<html><b>d3</html>", "<html><b>GF</html>", "<html><b>GC</html>",
							"<html><b>d3G</html>" },
					{ d3.getClasificacion().get(0).getNombre(), d3.getClasificacion().get(0).getPartidosJugados(),
							d3.getClasificacion().get(0).getPuntos(), d3.getClasificacion().get(0).getVictorias(),
							d3.getClasificacion().get(0).getEmpates(), d3.getClasificacion().get(0).getDerrotas(),
							d3.getClasificacion().get(0).getGolesAFavor(), d3.getClasificacion().get(0).getGolesEnContra(),
							d3.getClasificacion().get(0).getDifGoles() },
					{ d3.getClasificacion().get(1).getNombre(), d3.getClasificacion().get(1).getPartidosJugados(),
							d3.getClasificacion().get(1).getPuntos(), d3.getClasificacion().get(1).getVictorias(),
							d3.getClasificacion().get(1).getEmpates(), d3.getClasificacion().get(1).getDerrotas(),
							d3.getClasificacion().get(1).getGolesAFavor(), d3.getClasificacion().get(1).getGolesEnContra(),
							d3.getClasificacion().get(1).getDifGoles() },
					{ d3.getClasificacion().get(2).getNombre(), d3.getClasificacion().get(2).getPartidosJugados(),
							d3.getClasificacion().get(2).getPuntos(), d3.getClasificacion().get(2).getVictorias(),
							d3.getClasificacion().get(2).getEmpates(), d3.getClasificacion().get(2).getDerrotas(),
							d3.getClasificacion().get(2).getGolesAFavor(), d3.getClasificacion().get(2).getGolesEnContra(),
							d3.getClasificacion().get(2).getDifGoles() },
					{ d3.getClasificacion().get(3).getNombre(), d3.getClasificacion().get(3).getPartidosJugados(),
							d3.getClasificacion().get(3).getPuntos(), d3.getClasificacion().get(3).getVictorias(),
							d3.getClasificacion().get(3).getEmpates(), d3.getClasificacion().get(3).getDerrotas(),
							d3.getClasificacion().get(3).getGolesAFavor(), d3.getClasificacion().get(3).getGolesEnContra(),
							d3.getClasificacion().get(3).getDifGoles() },
					{ d3.getClasificacion().get(4).getNombre(), d3.getClasificacion().get(4).getPartidosJugados(),
							d3.getClasificacion().get(4).getPuntos(), d3.getClasificacion().get(4).getVictorias(),
							d3.getClasificacion().get(4).getEmpates(), d3.getClasificacion().get(4).getDerrotas(),
							d3.getClasificacion().get(4).getGolesAFavor(), d3.getClasificacion().get(4).getGolesEnContra(),
							d3.getClasificacion().get(4).getDifGoles() },
					{ d3.getClasificacion().get(5).getNombre(), d3.getClasificacion().get(5).getPartidosJugados(),
							d3.getClasificacion().get(5).getPuntos(), d3.getClasificacion().get(5).getVictorias(),
							d3.getClasificacion().get(5).getEmpates(), d3.getClasificacion().get(5).getDerrotas(),
							d3.getClasificacion().get(5).getGolesAFavor(), d3.getClasificacion().get(5).getGolesEnContra(),
							d3.getClasificacion().get(5).getDifGoles() },
					{ d3.getClasificacion().get(6).getNombre(), d3.getClasificacion().get(6).getPartidosJugados(),
							d3.getClasificacion().get(6).getPuntos(), d3.getClasificacion().get(6).getVictorias(),
							d3.getClasificacion().get(6).getEmpates(), d3.getClasificacion().get(6).getDerrotas(),
							d3.getClasificacion().get(6).getGolesAFavor(), d3.getClasificacion().get(6).getGolesEnContra(),
							d3.getClasificacion().get(6).getDifGoles() },
					{ d3.getClasificacion().get(7).getNombre(), d3.getClasificacion().get(7).getPartidosJugados(),
							d3.getClasificacion().get(7).getPuntos(), d3.getClasificacion().get(7).getVictorias(),
							d3.getClasificacion().get(7).getEmpates(), d3.getClasificacion().get(7).getDerrotas(),
							d3.getClasificacion().get(7).getGolesAFavor(), d3.getClasificacion().get(7).getGolesEnContra(),
							d3.getClasificacion().get(7).getDifGoles() },
					{ d3.getClasificacion().get(8).getNombre(), d3.getClasificacion().get(8).getPartidosJugados(),
							d3.getClasificacion().get(8).getPuntos(), d3.getClasificacion().get(8).getVictorias(),
							d3.getClasificacion().get(8).getEmpates(), d3.getClasificacion().get(8).getDerrotas(),
							d3.getClasificacion().get(8).getGolesAFavor(), d3.getClasificacion().get(8).getGolesEnContra(),
							d3.getClasificacion().get(8).getDifGoles() },
					{ d3.getClasificacion().get(9).getNombre(), d3.getClasificacion().get(9).getPartidosJugados(),
							d3.getClasificacion().get(9).getPuntos(), d3.getClasificacion().get(9).getVictorias(),
							d3.getClasificacion().get(9).getEmpates(), d3.getClasificacion().get(9).getDerrotas(),
							d3.getClasificacion().get(9).getGolesAFavor(), d3.getClasificacion().get(9).getGolesEnContra(),
							d3.getClasificacion().get(9).getDifGoles() }, },
					new String[] { "Nombre", "PJ", "PTS", "V", "E", "d3", "GF", "GC", "d3G" }) {
				Class[] columnTypes = new Class[] { String.class, Integer.class, Integer.class, Integer.class,
						Integer.class, Integer.class, Integer.class, Integer.class, Integer.class };

				public Class getColumnClass(int columnInd3ex) {
					return columnTypes[columnInd3ex];
				}
});
				clasificacion3.getColumnModel().getColumn(0).setPreferredWidth(23);
				clasificacion3.getColumnModel().getColumn(1).setPreferredWidth(30);
				clasificacion3.getColumnModel().getColumn(2).setPreferredWidth(44);
				clasificacion3.getColumnModel().getColumn(3).setPreferredWidth(30);
				clasificacion3.getColumnModel().getColumn(4).setPreferredWidth(30);
				clasificacion3.getColumnModel().getColumn(5).setPreferredWidth(30);
				clasificacion3.getColumnModel().getColumn(6).setPreferredWidth(30);
				clasificacion3.getColumnModel().getColumn(7).setPreferredWidth(30);
				clasificacion3.getColumnModel().getColumn(8).setPreferredWidth(30);
				add(clasificacion3);
				GridBagConstraints gbc_clasificacion3 = new GridBagConstraints();
				gbc_clasificacion3.fill = GridBagConstraints.BOTH;
				gbc_clasificacion3.insets = new Insets(0, 0, 5, 5);
				gbc_clasificacion3.gridwidth = 5;
				gbc_clasificacion3.gridx = 4;
				gbc_clasificacion3.gridy = 5;
				add(clasificacion3, gbc_clasificacion3);
				
				//-----------------------------------------------------------------------------
				
				
				GridBagConstraints gbc_atras = new GridBagConstraints();
				gbc_atras.fill = GridBagConstraints.BOTH;
				gbc_atras.insets = new Insets(0, 0, 0, 5);
				gbc_atras.gridx = 0;
				gbc_atras.gridy = 8;
				add(atras, gbc_atras);
		
				BotonMenu siguiente = new BotonMenu("Siguiente");
				siguiente.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						try {
							if (ventana.getProxPart() != null) {
								ventana.repintarProximosPartidos();
							}
							ventana.irAProximosPartidos();

						}

						catch (Exception e) {
							ventana.descenderEquipos(ventana.getPrimera(), ventana.getSegunda());
							ventana.ascenderEquipos(ventana.getSegunda(), ventana.getPrimera());
							ventana.descenderEquipos(ventana.getSegunda(), ventana.getTercera());
							ventana.ascenderEquipos(ventana.getTercera(), ventana.getSegunda());

							ventana.repintarClasificaciones();

						}

					}
				});
				
						BotonMenu botonMenu = new BotonMenu("Men\u00FA Principal");
						GridBagConstraints gbc_botonMenu = new GridBagConstraints();
						gbc_botonMenu.gridwidth = 3;
						gbc_botonMenu.fill = GridBagConstraints.BOTH;
						gbc_botonMenu.insets = new Insets(0, 0, 0, 5);
						gbc_botonMenu.gridx = 4;
						gbc_botonMenu.gridy = 8;
						add(botonMenu, gbc_botonMenu);
				siguiente.setText("Siguiente");
				GridBagConstraints gbc_siguiente = new GridBagConstraints();
				gbc_siguiente.insets = new Insets(0, 0, 0, 5);
				gbc_siguiente.fill = GridBagConstraints.BOTH;
				gbc_siguiente.gridx = 9;
				gbc_siguiente.gridy = 8;
				add(siguiente, gbc_siguiente);
		this.setVisible(true);

	}

	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}

	/*
	 * public JTable getClasificacionJornada(Division d) { JTable table = new
	 * JTable(); table.setBounds(10, 48, 430, 176);
	 * table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	 * table.setModel(new DefaultTableModel(new Object[][] { {
	 * "<html><b>NOMBRE</html>", "<html><b>PJ</html>", "<html><b>PTS</html>",
	 * "<html><b>V</html>", "<html><b>E</html>", "<html><b>D</html>",
	 * "<html><b>GF</html>", "<html><b>GC</html>", "<html><b>DG</html>" }, {
	 * d.getClasificacion().get(0).getNombre(),
	 * d.getClasificacion().get(0).getPartidosJugados(),
	 * d.getClasificacion().get(0).getPuntos(),
	 * d.getClasificacion().get(0).getVictorias(),
	 * d.getClasificacion().get(0).getEmpates(),
	 * d.getClasificacion().get(0).getDerrotas(),
	 * d.getClasificacion().get(0).getGolesAFavor(),
	 * d.getClasificacion().get(0).getGolesEnContra(),
	 * d.getClasificacion().get(0).getDifGoles() }, {
	 * d.getClasificacion().get(1).getNombre(),
	 * d.getClasificacion().get(1).getPartidosJugados(),
	 * d.getClasificacion().get(1).getPuntos(),
	 * d.getClasificacion().get(1).getVictorias(),
	 * d.getClasificacion().get(1).getEmpates(),
	 * d.getClasificacion().get(1).getDerrotas(),
	 * d.getClasificacion().get(1).getGolesAFavor(),
	 * d.getClasificacion().get(1).getGolesEnContra(),
	 * d.getClasificacion().get(1).getDifGoles() }, {
	 * d.getClasificacion().get(2).getNombre(),
	 * d.getClasificacion().get(2).getPartidosJugados(),
	 * d.getClasificacion().get(2).getPuntos(),
	 * d.getClasificacion().get(2).getVictorias(),
	 * d.getClasificacion().get(2).getEmpates(),
	 * d.getClasificacion().get(2).getDerrotas(),
	 * d.getClasificacion().get(2).getGolesAFavor(),
	 * d.getClasificacion().get(2).getGolesEnContra(),
	 * d.getClasificacion().get(2).getDifGoles() }, {
	 * d.getClasificacion().get(3).getNombre(),
	 * d.getClasificacion().get(3).getPartidosJugados(),
	 * d.getClasificacion().get(3).getPuntos(),
	 * d.getClasificacion().get(3).getVictorias(),
	 * d.getClasificacion().get(3).getEmpates(),
	 * d.getClasificacion().get(3).getDerrotas(),
	 * d.getClasificacion().get(3).getGolesAFavor(),
	 * d.getClasificacion().get(3).getGolesEnContra(),
	 * d.getClasificacion().get(3).getDifGoles() }, {
	 * d.getClasificacion().get(4).getNombre(),
	 * d.getClasificacion().get(4).getPartidosJugados(),
	 * d.getClasificacion().get(4).getPuntos(),
	 * d.getClasificacion().get(4).getVictorias(),
	 * d.getClasificacion().get(4).getEmpates(),
	 * d.getClasificacion().get(4).getDerrotas(),
	 * d.getClasificacion().get(4).getGolesAFavor(),
	 * d.getClasificacion().get(4).getGolesEnContra(),
	 * d.getClasificacion().get(4).getDifGoles() }, {
	 * d.getClasificacion().get(5).getNombre(),
	 * d.getClasificacion().get(5).getPartidosJugados(),
	 * d.getClasificacion().get(5).getPuntos(),
	 * d.getClasificacion().get(5).getVictorias(),
	 * d.getClasificacion().get(5).getEmpates(),
	 * d.getClasificacion().get(5).getDerrotas(),
	 * d.getClasificacion().get(5).getGolesAFavor(),
	 * d.getClasificacion().get(5).getGolesEnContra(),
	 * d.getClasificacion().get(5).getDifGoles() }, {
	 * d.getClasificacion().get(6).getNombre(),
	 * d.getClasificacion().get(6).getPartidosJugados(),
	 * d.getClasificacion().get(6).getPuntos(),
	 * d.getClasificacion().get(6).getVictorias(),
	 * d.getClasificacion().get(6).getEmpates(),
	 * d.getClasificacion().get(6).getDerrotas(),
	 * d.getClasificacion().get(6).getGolesAFavor(),
	 * d.getClasificacion().get(6).getGolesEnContra(),
	 * d.getClasificacion().get(6).getDifGoles() }, {
	 * d.getClasificacion().get(7).getNombre(),
	 * d.getClasificacion().get(7).getPartidosJugados(),
	 * d.getClasificacion().get(7).getPuntos(),
	 * d.getClasificacion().get(7).getVictorias(),
	 * d.getClasificacion().get(7).getEmpates(),
	 * d.getClasificacion().get(7).getDerrotas(),
	 * d.getClasificacion().get(7).getGolesAFavor(),
	 * d.getClasificacion().get(7).getGolesEnContra(),
	 * d.getClasificacion().get(7).getDifGoles() }, {
	 * d.getClasificacion().get(8).getNombre(),
	 * d.getClasificacion().get(8).getPartidosJugados(),
	 * d.getClasificacion().get(8).getPuntos(),
	 * d.getClasificacion().get(8).getVictorias(),
	 * d.getClasificacion().get(8).getEmpates(),
	 * d.getClasificacion().get(8).getDerrotas(),
	 * d.getClasificacion().get(8).getGolesAFavor(),
	 * d.getClasificacion().get(8).getGolesEnContra(),
	 * d.getClasificacion().get(8).getDifGoles() }, {
	 * d.getClasificacion().get(9).getNombre(),
	 * d.getClasificacion().get(9).getPartidosJugados(),
	 * d.getClasificacion().get(9).getPuntos(),
	 * d.getClasificacion().get(9).getVictorias(),
	 * d.getClasificacion().get(9).getEmpates(),
	 * d.getClasificacion().get(9).getDerrotas(),
	 * d.getClasificacion().get(9).getGolesAFavor(),
	 * d.getClasificacion().get(9).getGolesEnContra(),
	 * d.getClasificacion().get(9).getDifGoles() }, }, new String[] { "Nombre",
	 * "PJ", "PTS", "V", "E", "D", "GF", "GC", "DG" }) { Class[] columnTypes = new
	 * Class[] { String.class, Integer.class, Integer.class, Integer.class,
	 * Integer.class, Integer.class, Integer.class, Integer.class, Integer.class };
	 * 
	 * public Class getColumnClass(int columnIndex) { return
	 * columnTypes[columnIndex]; } });
	 * table.getColumnModel().getColumn(0).setPreferredWidth(23);
	 * table.getColumnModel().getColumn(1).setPreferredWidth(30);
	 * table.getColumnModel().getColumn(2).setPreferredWidth(44);
	 * table.getColumnModel().getColumn(3).setPreferredWidth(30);
	 * table.getColumnModel().getColumn(4).setPreferredWidth(30);
	 * table.getColumnModel().getColumn(5).setPreferredWidth(30);
	 * table.getColumnModel().getColumn(6).setPreferredWidth(30);
	 * table.getColumnModel().getColumn(7).setPreferredWidth(30);
	 * table.getColumnModel().getColumn(8).setPreferredWidth(30); add(table); return
	 * table; }
	 */

}