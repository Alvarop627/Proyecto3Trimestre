package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import clases.Division;
import clases.Jornada;
import componentes.BotonMenu;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

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

	public ProximosPartidos(Ventana v) {
		super();
		this.ventana = v;
		initComponents();
		// this.actualizarClasificacion(v.getPrimera());
		// this.actualizarClasificacion(v.getSegunda());
		// this.actualizarClasificacion(v.getTercera());
	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));

		partidos1 = new JTable();
		partidos1.setBounds(100, 50, 208, 115);
		partidos1 = ventana.getProximaJornada(ventana.getPrimera());
		
		add(partidos1);
		
		partidos2 = new JTable();
		partidos2.setBounds(228, 50, 212, 115);
		partidos2 = ventana.getProximaJornada(ventana.getSegunda());
		add(partidos2);
		
		partidos3 = new JTable();
		partidos3.setBounds(150, 200, 208, 115);
		partidos3 = ventana.getProximaJornada(ventana.getTercera());
		add(partidos3);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 74, 43, 37, 35, 261, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 25, 1, 145, 0, 39, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblJornada = new JLabel("JORNADA");
		lblJornada.setForeground(new Color(255, 255, 255));
		lblJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		GridBagConstraints gbc_lblJornada = new GridBagConstraints();
		gbc_lblJornada.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblJornada.insets = new Insets(0, 0, 5, 5);
		gbc_lblJornada.gridx = 0;
		gbc_lblJornada.gridy = 0;
		add(lblJornada, gbc_lblJornada);

		JLabel numJornada = new JLabel();
		numJornada.setForeground(Color.WHITE);
		numJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		numJornada.setText(ventana.getPrimera().getJornadaActual() + "");
		GridBagConstraints gbc_numJornada = new GridBagConstraints();
		gbc_numJornada.anchor = GridBagConstraints.NORTHWEST;
		gbc_numJornada.insets = new Insets(0, 0, 5, 5);
		gbc_numJornada.gridx = 1;
		gbc_numJornada.gridy = 0;
		add(numJornada, gbc_numJornada);

		BotonMenu siguiente = new BotonMenu("Siguiente");
		siguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
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

		JLabel partidos = new JLabel("PR\u00D3XIMOS PARTIDOS");
		partidos.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		partidos.setForeground(Color.WHITE);
		GridBagConstraints gbc_partidos = new GridBagConstraints();
		gbc_partidos.anchor = GridBagConstraints.NORTH;
		gbc_partidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_partidos.insets = new Insets(0, 0, 5, 0);
		gbc_partidos.gridx = 4;
		gbc_partidos.gridy = 0;
		add(partidos, gbc_partidos);
		GridBagConstraints gbc_atras = new GridBagConstraints();
		gbc_atras.fill = GridBagConstraints.BOTH;
		gbc_atras.insets = new Insets(0, 0, 0, 5);
		gbc_atras.gridx = 0;
		gbc_atras.gridy = 5;
		add(atras, gbc_atras);
		siguiente.setText("Siguiente");
		GridBagConstraints gbc_siguiente = new GridBagConstraints();
		gbc_siguiente.anchor = GridBagConstraints.EAST;
		gbc_siguiente.fill = GridBagConstraints.VERTICAL;
		gbc_siguiente.gridx = 4;
		gbc_siguiente.gridy = 5;
		add(siguiente, gbc_siguiente);

		this.setVisible(true);

	}

	public void repintar() {
		this.removeAll();
		this.initComponents();
	}
}
