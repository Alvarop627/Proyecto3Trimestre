package interfaces;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import clases.Division;
import clases.Jornada;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import componentes.BotonMenu;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSpinner;

public class ClasificacionJornada extends JPanel {
	private Ventana ventana;
	public static JLabel numJornada;
	private JTable clasificacion11;
	private JTable clasificacion22;
	private JTable clasificacion33;
	private JTable clasificacion1;
	private JTable clasificacion2;
	private JTable clasificacion3;
	
	
	public ClasificacionJornada(Ventana v) {
		super();
		this.ventana = v;
		initComponents();
		// this.actualizarClasificacion(v.getPrimera());
		// this.actualizarClasificacion(v.getSegunda());
		// this.actualizarClasificacion(v.getTercera());
	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 115, 76, 56, 107, 103, 0 };
		gridBagLayout.rowHeights = new int[] { 23, 1, 96, 96, 37, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
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

		JLabel lblClasificacion = new JLabel("CLASIFICACI\u00D3N");
		lblClasificacion.setForeground(Color.WHITE);
		lblClasificacion.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		GridBagConstraints gbc_lblClasificacion = new GridBagConstraints();
		gbc_lblClasificacion.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblClasificacion.insets = new Insets(0, 0, 5, 0);
		gbc_lblClasificacion.gridwidth = 2;
		gbc_lblClasificacion.gridx = 3;
		gbc_lblClasificacion.gridy = 0;
		add(lblClasificacion, gbc_lblClasificacion);

		numJornada = new JLabel();

		numJornada.setForeground(Color.WHITE);
		numJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		GridBagConstraints gbc_numJornada = new GridBagConstraints();
		gbc_numJornada.anchor = GridBagConstraints.NORTHWEST;
		gbc_numJornada.insets = new Insets(0, 0, 5, 5);
		gbc_numJornada.gridx = 1;
		gbc_numJornada.gridy = 0;
		numJornada.setText(ventana.getPrimera().getJornadaActual() + "");
		add(numJornada, gbc_numJornada);

		clasificacion1 = new JTable();
		clasificacion1.setBounds(20, 39, 241, 119);
		clasificacion1 = ventana.getClasificacionJornada(ventana.getPrimera());
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.RELATIVE;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.gridwidth = 3;
		gbc_table.gridx = 0;
		gbc_table.gridy = 2;
		add(clasificacion1, gbc_table);

		clasificacion2 = new JTable();
		clasificacion2.setBounds(20, 39, 241, 119);
		clasificacion2 = ventana.getClasificacionJornada(ventana.getSegunda());
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.fill = GridBagConstraints.RELATIVE;
		gbc_table_1.insets = new Insets(0, 0, 5, 0);
		gbc_table_1.gridwidth = 2;
		gbc_table_1.gridx = 3;
		gbc_table_1.gridy = 2;
		add(clasificacion2, gbc_table_1);

		clasificacion3 = new JTable();
		clasificacion3.setBounds(20, 39, 241, 119);
		clasificacion3 = ventana.getClasificacionJornada(ventana.getTercera());
		GridBagConstraints gbc_table_2 = new GridBagConstraints();
		gbc_table_2.fill = GridBagConstraints.RELATIVE;
		gbc_table_2.insets = new Insets(0, 0, 5, 5);
		gbc_table_2.gridwidth = 4;
		gbc_table_2.gridx = 2;
		gbc_table_2.gridy = 3;
		add(clasificacion3, gbc_table_2);

		BotonMenu atras = new BotonMenu("Atr\u00E1s");
		atras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irASeleccionaEquipo();
			}
		});
		GridBagConstraints gbc_atras = new GridBagConstraints();
		gbc_atras.fill = GridBagConstraints.BOTH;
		gbc_atras.insets = new Insets(0, 0, 0, 5);
		gbc_atras.gridx = 0;
		gbc_atras.gridy = 4;
		add(atras, gbc_atras);

		BotonMenu siguiente = new BotonMenu("Siguiente");
		siguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(Ventana.getProxPart()!=null) {
					Ventana.repintarProximosPartidos();
				}
				ventana.irAProximosPartidos();
			}
		});
		siguiente.setText("Siguiente");
		GridBagConstraints gbc_siguiente = new GridBagConstraints();
		gbc_siguiente.fill = GridBagConstraints.BOTH;
		gbc_siguiente.gridx = 4;
		gbc_siguiente.gridy = 4;
		add(siguiente, gbc_siguiente);
		this.setVisible(true);

	}

}