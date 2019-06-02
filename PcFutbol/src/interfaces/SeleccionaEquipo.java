package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;

import componentes.BotonMenu;
import componentes.MiPanel;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import clases.Division;
import clases.Equipo;
import clases.Jugador;
import net.miginfocom.swing.MigLayout;
import pcfutbol.Main;

public class SeleccionaEquipo extends JPanel implements TreeSelectionListener {
	private Ventana ventana;
	private JTree tree;
	private DefaultMutableTreeNode primera;
	private DefaultMutableTreeNode segunda;
	private DefaultMutableTreeNode tercera;
	ImageIcon imagen;

	public SeleccionaEquipo() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		initComponents();
	}

	public SeleccionaEquipo(Ventana v) {
		super();
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		this.ventana = v;
		this.tree = new JTree();
		initComponents();
	}

	/**
	 * @wbp.parser.constructor
	 */
	public SeleccionaEquipo(Ventana v, String rutaImagen) {
		super();
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setPreferredSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		this.ventana = v;
		this.tree = new JTree();
		imagen = new ImageIcon(getClass().getResource(rutaImagen));
		setSize(imagen.getIconWidth(), imagen.getIconHeight());
		initComponents();
	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0 };
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

		tree.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Ligas") {
			{
				// DefaultMutableTreeNode primera;
				primera = new DefaultMutableTreeNode("Primera Divisi\u00F3n");
				primera.add(new DefaultMutableTreeNode("Aston Birras"));
				primera.add(new DefaultMutableTreeNode("Notthingham Prisa"));
				primera.add(new DefaultMutableTreeNode("Real Suciedad"));
				primera.add(new DefaultMutableTreeNode("Steagua de Grifo"));
				primera.add(new DefaultMutableTreeNode("Maccabi de Levantar"));
				primera.add(new DefaultMutableTreeNode("Vodka Juniors"));
				primera.add(new DefaultMutableTreeNode("Vater de Munich"));
				primera.add(new DefaultMutableTreeNode("Recreativo de Juerga"));
				primera.add(new DefaultMutableTreeNode("Hannover N\u00E1"));
				primera.add(new DefaultMutableTreeNode("Esfinter de Milan"));
				add(primera);

				// DefaultMutableTreeNode segunda;
				segunda = new DefaultMutableTreeNode("Segunda Divisi\u00F3n");
				segunda.add(new DefaultMutableTreeNode("Blackvodk Rovers"));
				segunda.add(new DefaultMutableTreeNode("Spartak de Reir"));
				segunda.add(new DefaultMutableTreeNode("Drink Team"));
				segunda.add(new DefaultMutableTreeNode("PES United"));
				segunda.add(new DefaultMutableTreeNode("CSKA La Ropa"));
				segunda.add(new DefaultMutableTreeNode("Werder Efil\u00F3n"));
				segunda.add(new DefaultMutableTreeNode("Harto de Berlin"));
				segunda.add(new DefaultMutableTreeNode("Schalke Temeto"));
				segunda.add(new DefaultMutableTreeNode("Deportivo Trago Corto"));
				add(segunda);

				// DefaultMutableTreeNode tercera;
				tercera = new DefaultMutableTreeNode("Tercera Divisi\u00F3n");
				tercera.add(new DefaultMutableTreeNode("Newpi"));
				tercera.add(new DefaultMutableTreeNode("Muppet"));
				tercera.add(new DefaultMutableTreeNode("Bayern de los caidos"));
				tercera.add(new DefaultMutableTreeNode("Kentucky Fried Football"));
				tercera.add(new DefaultMutableTreeNode("Lisiados FC"));
				tercera.add(new DefaultMutableTreeNode("Rayo Vayaca\u00F1o"));
				tercera.add(new DefaultMutableTreeNode("River Fake"));
				tercera.add(new DefaultMutableTreeNode("Estrella Coja"));
				tercera.add(new DefaultMutableTreeNode("San Francis"));
				tercera.add(new DefaultMutableTreeNode("Mambo FC"));
				add(tercera);
			}
		}));
		tree.setBounds(10, 163, 231, 105);

		tree.getSelectionModel().addTreeSelectionListener(this);

		JButton btnAtras_1 = new BotonMenu("Atr\u00E1s");
		btnAtras_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAtras_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAEligeCargarNueva();
			}
		});

		JLabel lblEligeTuEquipo = new JLabel("Elige tu equipo");
		lblEligeTuEquipo.setForeground(new Color(255, 255, 255));
		lblEligeTuEquipo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
		lblEligeTuEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblEligeTuEquipo = new GridBagConstraints();
		gbc_lblEligeTuEquipo.gridwidth = 2;
		gbc_lblEligeTuEquipo.fill = GridBagConstraints.BOTH;
		gbc_lblEligeTuEquipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEligeTuEquipo.gridx = 4;
		gbc_lblEligeTuEquipo.gridy = 0;
		add(lblEligeTuEquipo, gbc_lblEligeTuEquipo);

		JPanel scroll = new JPanel();
		FlowLayout flowLayout = (FlowLayout) scroll.getLayout();
		scroll.setBounds(10, 22, 851, 200);
		scroll.setBackground(Color.WHITE);
		JScrollPane desp = new JScrollPane(scroll, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_desp = new GridBagConstraints();
		gbc_desp.gridwidth = 4;
		gbc_desp.gridheight = 4;
		gbc_desp.fill = GridBagConstraints.BOTH;
		gbc_desp.insets = new Insets(0, 0, 5, 5);
		gbc_desp.gridx = 3;
		gbc_desp.gridy = 2;
		add(desp, gbc_desp);

		scroll.add(tree);

		MiPanel panel = new MiPanel(ventana, "../imagenes/falcao.png");
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.gridheight = 5;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 6;
		add(panel, gbc_panel);
		GridBagConstraints gbc_btnAtras_1 = new GridBagConstraints();
		gbc_btnAtras_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras_1.fill = GridBagConstraints.BOTH;
		gbc_btnAtras_1.gridx = 0;
		gbc_btnAtras_1.gridy = 9;
		add(btnAtras_1, gbc_btnAtras_1);

		BotonMenu btnSeleccionar = new BotonMenu("Seleccionar");
		btnSeleccionar.setText("Siguiente");
		btnSeleccionar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con;
					con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pcfutbolmini", "localhost", "localhost");
					PreparedStatement psmt = con.prepareStatement("insert into jugadores values(?,?,?,?,?,?,?,?,?)");
					PreparedStatement psmt2 =con.prepareStatement("UPDATE equipos SET miEquipo=1 WHERE nombre=?;");
					
				DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				
				if (primera.isNodeDescendant(nodoSeleccionado)) {
					
					for (Equipo equipo : ventana.getPrimera().getEquipos()) {

						if (equipo.getNombre().equals(nodoSeleccionado.getUserObject())) {
							ventana.setMiEquipo(equipo);
							String miEquipo= "UPDATE equipos SET miEquipo=1 WHERE nombre='"+ventana.getMiEquipo().getNombre()+"';";
							psmt2.executeUpdate(miEquipo);
							for (int i = 0; i < 7; i++) {
								Jugador jug = new Jugador();
								equipo.ficharJugador(jug);
								String SQL2 = "INSERT INTO jugadores (nombre,apellidos,fuerza,velocidad,resistencia,tecnica,titular,posicion,nombreEquipo) values('"
										+ jug.getNombre() + "','" + jug.getApellidos() + "'," + jug.getFuerza() + ","
										+ jug.getVelocidad() + "," + jug.getResistencia() + "," + jug.getTecnica() + ","
										+ jug.esTitular() + ",'" + jug.getPosicion() + "','" + ventana.getMiEquipo().getNombre() + "');";
								psmt.executeUpdate(SQL2);
							}

						}

					}
				} else if (segunda.isNodeDescendant(nodoSeleccionado)) {
					for (Equipo equipo : ventana.getSegunda().getEquipos()) {
						if (equipo.getNombre().equals(nodoSeleccionado.getUserObject())) {
							for (int i = 0; i < 7; i++) {
								Jugador jug = new Jugador();
								equipo.ficharJugador(jug);
								String SQL2 = "INSERT INTO jugadores (nombre,apellidos,fuerza,velocidad,resistencia,tecnica,titular,posicion,nombreEquipo) values('"
										+ jug.getNombre() + "','" + jug.getApellidos() + "'," + jug.getFuerza() + ","
										+ jug.getVelocidad() + "," + jug.getResistencia() + "," + jug.getTecnica() + ","
										+ jug.esTitular() + ",'" + jug.getPosicion() + "','" + ventana.getMiEquipo().getNombre() + "');";
								psmt.executeUpdate(SQL2);
							}

						}

					}
				} else {
					for (Equipo equipo : ventana.getTercera().getEquipos()) {
						if (equipo.getNombre().equals(nodoSeleccionado.getUserObject())) {

							for (int i = 0; i < 7; i++) {
								Jugador jug = new Jugador();
								equipo.ficharJugador(jug);
								String SQL2 = "INSERT INTO jugadores (nombre,apellidos,fuerza,velocidad,resistencia,tecnica,titular,posicion,nombreEquipo) values('"
										+ jug.getNombre() + "','" + jug.getApellidos() + "'," + jug.getFuerza() + ","
										+ jug.getVelocidad() + "," + jug.getResistencia() + "," + jug.getTecnica() + ","
										+ jug.esTitular() + ",'" + jug.getPosicion() + "','" + ventana.getMiEquipo().getNombre() + "');";
								psmt.executeUpdate(SQL2);

							}

						}

					}
				}
				
				con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				ventana.irAClasificacionJornada();
			}
		});
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		BotonMenu botonMenu = new BotonMenu("Menú Principal");
		botonMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irAEligeCargarNueva();
			}
		});
		botonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_botonMenu = new GridBagConstraints();
		gbc_botonMenu.gridwidth = 2;
		gbc_botonMenu.fill = GridBagConstraints.BOTH;
		gbc_botonMenu.insets = new Insets(0, 0, 5, 5);
		gbc_botonMenu.gridx = 4;
		gbc_botonMenu.gridy = 9;
		add(botonMenu, gbc_botonMenu);
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionar.fill = GridBagConstraints.BOTH;
		gbc_btnSeleccionar.gridx = 9;
		gbc_btnSeleccionar.gridy = 9;
		add(btnSeleccionar, gbc_btnSeleccionar);
		this.setVisible(true);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
	}

	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}

}
