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
import javax.swing.JComboBox;

public class Alineacion extends JPanel {
	private Ventana ventana;
	public static JLabel numJornada;
	private JTable table;

	public Alineacion(Ventana v) {
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
		gridBagLayout.columnWidths = new int[]{160, 50, 50, 50, 50, 50, 50, 50, 50, 50, 0, 103, 0};
		gridBagLayout.rowHeights = new int[]{23, 20, 32, 17, 30, 23, 30, 0, 0, 23, 23, 0, 39, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
												
														JLabel lblAlineacion = new JLabel("ALINEACI\u00D3N");
														lblAlineacion.setForeground(Color.WHITE);
														lblAlineacion.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
														GridBagConstraints gbc_lblAlineacion = new GridBagConstraints();
														gbc_lblAlineacion.anchor = GridBagConstraints.NORTHWEST;
														gbc_lblAlineacion.insets = new Insets(0, 0, 5, 5);
														gbc_lblAlineacion.gridx = 0;
														gbc_lblAlineacion.gridy = 0;
														add(lblAlineacion, gbc_lblAlineacion);
												
														numJornada = new JLabel();
														numJornada.setForeground(Color.WHITE);
														numJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
														numJornada.setText(ventana.getPrimera().getJornadaActual()+1+"");
														GridBagConstraints gbc_numJornada = new GridBagConstraints();
														gbc_numJornada.fill = GridBagConstraints.BOTH;
														gbc_numJornada.insets = new Insets(0, 0, 5, 5);
														gbc_numJornada.gridx = 1;
														gbc_numJornada.gridy =0;
														add(numJornada, gbc_numJornada);
												

												JComboBox DI = new JComboBox();
												GridBagConstraints gbc_DI = new GridBagConstraints();
												gbc_DI.ipady = 10;
												gbc_DI.ipadx = 30;
												gbc_DI.fill = GridBagConstraints.BOTH;
												gbc_DI.insets = new Insets(0, 0, 5, 5);
												gbc_DI.gridx = 3;
												gbc_DI.gridy = 2;
												add(DI, gbc_DI);
										
												JComboBox DD = new JComboBox();
												GridBagConstraints gbc_DD = new GridBagConstraints();
												gbc_DD.ipady = 10;
												gbc_DD.ipadx = 30;
												gbc_DD.fill = GridBagConstraints.BOTH;
												gbc_DD.insets = new Insets(0, 0, 5, 5);
												gbc_DD.gridx = 4;
												gbc_DD.gridy = 2;
												add(DD, gbc_DD);
								
										JComboBox MI = new JComboBox();
										GridBagConstraints gbc_MI = new GridBagConstraints();
										gbc_MI.ipady = 10;
										gbc_MI.ipadx = 30;
										gbc_MI.insets = new Insets(0, 0, 5, 5);
										gbc_MI.gridx = 1;
										gbc_MI.gridy = 4;
										add(MI, gbc_MI);
												
														JComboBox MCI = new JComboBox();
														GridBagConstraints gbc_MCI = new GridBagConstraints();
														gbc_MCI.ipady = 10;
														gbc_MCI.ipadx = 30;
														gbc_MCI.fill = GridBagConstraints.BOTH;
														gbc_MCI.insets = new Insets(0, 0, 5, 5);
														gbc_MCI.gridx = 3;
														gbc_MCI.gridy = 4;
														add(MCI, gbc_MCI);
										
												JComboBox MCD = new JComboBox();
												GridBagConstraints gbc_MCD = new GridBagConstraints();
												gbc_MCD.ipady = 10;
												gbc_MCD.ipadx = 30;
												gbc_MCD.fill = GridBagConstraints.BOTH;
												gbc_MCD.insets = new Insets(0, 0, 5, 5);
												gbc_MCD.gridx = 4;
												gbc_MCD.gridy = 4;
												add(MCD, gbc_MCD);
								
										JComboBox MD = new JComboBox();
										GridBagConstraints gbc_MD = new GridBagConstraints();
										gbc_MD.ipady = 10;
										gbc_MD.ipadx = 30;
										gbc_MD.fill = GridBagConstraints.BOTH;
										gbc_MD.insets = new Insets(0, 0, 5, 5);
										gbc_MD.gridx = 5;
										gbc_MD.gridy = 4;
										add(MD, gbc_MD);
		BotonMenu atras = new BotonMenu("Atr\u00E1s");
		atras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irAProximosPartidos();
			}
		});
										
												JComboBox LI = new JComboBox();
												GridBagConstraints gbc_LI = new GridBagConstraints();
												gbc_LI.fill = GridBagConstraints.BOTH;
												gbc_LI.insets = new Insets(0, 0, 5, 5);
												gbc_LI.gridx = 1;
												gbc_LI.gridy = 6;
												add(LI, gbc_LI);
								
										JComboBox DFCI = new JComboBox();
										GridBagConstraints gbc_DFCI = new GridBagConstraints();
										gbc_DFCI.fill = GridBagConstraints.BOTH;
										gbc_DFCI.insets = new Insets(0, 0, 5, 5);
										gbc_DFCI.gridx = 3;
										gbc_DFCI.gridy = 6;
										add(DFCI, gbc_DFCI);
						
								JComboBox DFCD = new JComboBox();
								GridBagConstraints gbc_DFCD = new GridBagConstraints();
								gbc_DFCD.fill = GridBagConstraints.BOTH;
								gbc_DFCD.insets = new Insets(0, 0, 5, 5);
								gbc_DFCD.gridx = 4;
								gbc_DFCD.gridy = 6;
								add(DFCD, gbc_DFCD);
				
						JComboBox LD = new JComboBox();
						GridBagConstraints gbc_LD = new GridBagConstraints();
						gbc_LD.fill = GridBagConstraints.BOTH;
						gbc_LD.insets = new Insets(0, 0, 5, 5);
						gbc_LD.gridx = 5;
						gbc_LD.gridy = 6;
						add(LD, gbc_LD);
		
				JComboBox POR = new JComboBox();
				GridBagConstraints gbc_POR = new GridBagConstraints();
				gbc_POR.gridwidth = 2;
				gbc_POR.fill = GridBagConstraints.BOTH;
				gbc_POR.insets = new Insets(0, 0, 5, 5);
				gbc_POR.gridx = 3;
				gbc_POR.gridy = 8;
				add(POR, gbc_POR);
		GridBagConstraints gbc_atras = new GridBagConstraints();
		gbc_atras.anchor = GridBagConstraints.WEST;
		gbc_atras.fill = GridBagConstraints.VERTICAL;
		gbc_atras.insets = new Insets(0, 0, 0, 5);
		gbc_atras.gridx = 0;
		gbc_atras.gridy = 12;
		add(atras, gbc_atras);
		
		BotonMenu siguiente = new BotonMenu("Siguiente");
		siguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.getPrimera().simularSiguienteJornada();
				ventana.getSegunda().simularSiguienteJornada();
				ventana.getTercera().simularSiguienteJornada();
				if(ventana.getResultados()!=null) {
					Ventana.repintarResultados();
					//ventana.getResultados().revalidate();
					//ventana.getResultados().repaint();
				}
				ventana.irAResultados();
			}
		});
		siguiente.setText("Siguiente");
		GridBagConstraints gbc_siguiente = new GridBagConstraints();
		gbc_siguiente.anchor = GridBagConstraints.EAST;
		gbc_siguiente.insets = new Insets(0, 0, 0, 5);
		gbc_siguiente.fill = GridBagConstraints.VERTICAL;
		gbc_siguiente.gridx = 10;
		gbc_siguiente.gridy = 12;
		add(siguiente, gbc_siguiente);
		this.setVisible(true);
	}

	
}
