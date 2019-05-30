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

public class Resultados extends JPanel {
	private Ventana ventana;
	private JTable resultados1;
	private JTable resultados2;
	private JTable resultados3;

	public Resultados(Ventana v) {
		super();
		this.ventana = v;
		this.initComponents();
	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));
		resultados1 = new JTable();
		resultados1 = ventana.getUltimaJornada(ventana.getPrimera());
		resultados1.setBounds(10, 27, 430, 71);
		add(resultados1);

		resultados2 = new JTable();
		resultados2 = ventana.getUltimaJornada(ventana.getSegunda());
		resultados2.setBounds(10, 109, 430, 71);
		add(resultados2);

		resultados3 = new JTable();
		resultados3 = ventana.getUltimaJornada(ventana.getSegunda());
		resultados3.setBounds(10, 186, 430, 71);
		add(resultados3);
				GridBagLayout gridBagLayout = new GridBagLayout();
				gridBagLayout.columnWidths = new int[]{111, 14, 207, 130, 0};
				gridBagLayout.rowHeights = new int[]{23, 245, 32, 0};
				gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
				gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
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
				
						BotonMenu atras = new BotonMenu("Atr\u00E1s");
						atras.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								ventana.irAEligeCargarNueva();
							}
						});
						
								JLabel numJornada = new JLabel();
								numJornada.setForeground(Color.WHITE);
								numJornada.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
								GridBagConstraints gbc_numJornada = new GridBagConstraints();
								gbc_numJornada.anchor = GridBagConstraints.NORTHWEST;
								gbc_numJornada.insets = new Insets(0, 0, 5, 5);
								gbc_numJornada.gridx = 1;
								gbc_numJornada.gridy = 0;
								add(numJornada, gbc_numJornada);
								// System.out.println("Proxima: "+ ventana.getPrimera().getJornadaActual());
								numJornada.setText(ventana.getPrimera().getJornadaActual() + "");
						
								JLabel resultados = new JLabel("RESULTADOS");
								resultados.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
								resultados.setForeground(Color.WHITE);
								GridBagConstraints gbc_resultados = new GridBagConstraints();
								gbc_resultados.anchor = GridBagConstraints.NORTHEAST;
								gbc_resultados.insets = new Insets(0, 0, 5, 0);
								gbc_resultados.gridx = 3;
								gbc_resultados.gridy = 0;
								add(resultados, gbc_resultados);
						GridBagConstraints gbc_atras = new GridBagConstraints();
						gbc_atras.anchor = GridBagConstraints.WEST;
						gbc_atras.fill = GridBagConstraints.VERTICAL;
						gbc_atras.insets = new Insets(0, 0, 0, 5);
						gbc_atras.gridx = 0;
						gbc_atras.gridy = 2;
						add(atras, gbc_atras);
				
						BotonMenu siguiente = new BotonMenu("Siguiente");
						siguiente.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								if(ventana.getClasificacion()!=null) {
									ventana.repintarClasificaciones();
								}
								
								ventana.irAClasificacionJornada();
							}
						});
						siguiente.setText("Siguiente");
						GridBagConstraints gbc_siguiente = new GridBagConstraints();
						gbc_siguiente.anchor = GridBagConstraints.EAST;
						gbc_siguiente.fill = GridBagConstraints.VERTICAL;
						gbc_siguiente.gridx = 3;
						gbc_siguiente.gridy = 2;
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
	
	
	}

