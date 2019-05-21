package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import componentes.BotonMenu;
import excepciones.MuyPocosJugadoresException;

import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import clases.Equipo;
import clases.Jugador;
import net.miginfocom.swing.MigLayout;
import pcfutbol.Main;

public class SeleccionaEquipo extends JPanel implements TreeSelectionListener {
	private Ventana ventana;
	private JButton btnSeleccionar;
	private JButton btnAtras;
	private JTree tree;
	private DefaultMutableTreeNode primera;
	private DefaultMutableTreeNode segunda;
	private DefaultMutableTreeNode tercera;

	public SeleccionaEquipo() {

		initComponents();
	}

	public SeleccionaEquipo(Ventana v) {
		super();
		this.ventana = v;
		this.tree = new JTree();
		initComponents();
	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 73, 311, 94, 0 };
		gridBagLayout.rowHeights = new int[] { 44, 203, 39, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblEligeTuEquipo = new JLabel("Elige tu equipo");
		lblEligeTuEquipo.setForeground(new Color(255, 255, 255));
		lblEligeTuEquipo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 25));
		lblEligeTuEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblEligeTuEquipo = new GridBagConstraints();
		gbc_lblEligeTuEquipo.fill = GridBagConstraints.BOTH;
		gbc_lblEligeTuEquipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEligeTuEquipo.gridx = 1;
		gbc_lblEligeTuEquipo.gridy = 0;
		add(lblEligeTuEquipo, gbc_lblEligeTuEquipo);

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

		scroll.add(tree);

		tree.getSelectionModel().addTreeSelectionListener(this);

		btnSeleccionar = new BotonMenu("Seleccionar");
		btnSeleccionar.setText("Siguiente");
		btnSeleccionar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// valueChanged(this);

				DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				if (primera.isNodeDescendant(nodoSeleccionado)) {
					for (Equipo equipo : ventana.getPrimera().getEquipos()) {
						
						if (equipo.getNombre().equals(nodoSeleccionado.getUserObject())) {
							for (int i = 0; i < 7; i++) {
								equipo.ficharJugador(new Jugador());

							}
							System.out.println(equipo.getPlantilla());
						}

					}
				} else if (segunda.isNodeDescendant(nodoSeleccionado)) {
					for (Equipo equipo : ventana.getSegunda().getEquipos()) {
						if (equipo.getNombre().equals(nodoSeleccionado.getUserObject())) {
							for (int i = 0; i < 7; i++) {
								equipo.ficharJugador(new Jugador());

							}
							System.out.println(equipo.getPlantilla());
						}

					}
				} else {
					for (Equipo equipo : ventana.getTercera().getEquipos()) {
						
						if (equipo.getNombre().equals(nodoSeleccionado.getUserObject())) {
							
							for (int i = 0; i < 7; i++) {
								equipo.ficharJugador(new Jugador());

							}
							System.out.println(equipo.getPlantilla());
						}
						// eventosNodoSeleccionado(nodoSeleccionado);

					}
				}
			}
		});
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

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
		GridBagConstraints gbc_btnAtras_1 = new GridBagConstraints();
		gbc_btnAtras_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtras_1.fill = GridBagConstraints.BOTH;
		gbc_btnAtras_1.gridx = 0;
		gbc_btnAtras_1.gridy = 2;
		add(btnAtras_1, gbc_btnAtras_1);
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.anchor = GridBagConstraints.EAST;
		gbc_btnSeleccionar.fill = GridBagConstraints.VERTICAL;
		gbc_btnSeleccionar.gridx = 2;
		gbc_btnSeleccionar.gridy = 2;
		add(btnSeleccionar, gbc_btnSeleccionar);

	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub

	}

}
