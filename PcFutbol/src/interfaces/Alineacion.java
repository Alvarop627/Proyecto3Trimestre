package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

import clases.Jugador;
import clases.PosicionJugador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import componentes.BotonMenu;
import excepciones.JugadorNoPerteneceAlEquipoException;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Alineacion extends JPanel {
	private Ventana ventana;
	public static JLabel numJornada;
	private JTable table;

	public Alineacion(Ventana v) {
		super();
		this.ventana = v;
		initComponents();
	}

	public void initComponents() {
		setBackground(new Color(34, 139, 34));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 160, 50, 50, 50, 50, 50, 50, 50, 50, 50, 0, 103, 0 };
		gridBagLayout.rowHeights = new int[] { 23, 20, 32, 17, 30, 23, 30, 0, 0, 23, 23, 0, 39, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
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

		JComboBox DI = new JComboBox();
		GridBagConstraints gbc_DI = new GridBagConstraints();
		gbc_DI.ipady = 10;
		gbc_DI.ipadx = 30;
		gbc_DI.fill = GridBagConstraints.BOTH;
		gbc_DI.insets = new Insets(0, 0, 5, 5);
		gbc_DI.gridx = 3;
		gbc_DI.gridy = 2;
		//System.out.println("POSIBLE ERROR"+ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DI));
		ArrayList<Jugador> todosLosDi = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DI);
		DI.setModel(new DefaultComboBoxModel(todosLosDi.toArray()));
		add(DI, gbc_DI);

		JComboBox DD = new JComboBox();
		GridBagConstraints gbc_DD = new GridBagConstraints();
		gbc_DD.ipady = 10;
		gbc_DD.ipadx = 30;
		gbc_DD.fill = GridBagConstraints.BOTH;
		gbc_DD.insets = new Insets(0, 0, 5, 5);
		gbc_DD.gridx = 4;
		gbc_DD.gridy = 2;
		ArrayList<Jugador> todosLosDd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DD);
		DD.setModel(new DefaultComboBoxModel(todosLosDd.toArray()));
		add(DD, gbc_DD);

		JComboBox MI = new JComboBox();
		GridBagConstraints gbc_MI = new GridBagConstraints();
		gbc_MI.ipady = 10;
		gbc_MI.ipadx = 30;
		gbc_MI.insets = new Insets(0, 0, 5, 5);
		gbc_MI.gridx = 1;
		gbc_MI.gridy = 4;
		ArrayList<Jugador> todosLosMi = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MI);
		MI.setModel(new DefaultComboBoxModel(todosLosMi.toArray()));
		add(MI, gbc_MI);

		JComboBox MCI = new JComboBox();
		GridBagConstraints gbc_MCI = new GridBagConstraints();
		gbc_MCI.ipady = 10;
		gbc_MCI.ipadx = 30;
		gbc_MCI.fill = GridBagConstraints.BOTH;
		gbc_MCI.insets = new Insets(0, 0, 5, 5);
		gbc_MCI.gridx = 3;
		gbc_MCI.gridy = 4;
		ArrayList<Jugador> todosLosMci = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MCI);
		MCI.setModel(new DefaultComboBoxModel(todosLosMci.toArray()));
		add(MCI, gbc_MCI);

		JComboBox MCD = new JComboBox();
		GridBagConstraints gbc_MCD = new GridBagConstraints();
		gbc_MCD.ipady = 10;
		gbc_MCD.ipadx = 30;
		gbc_MCD.fill = GridBagConstraints.BOTH;
		gbc_MCD.insets = new Insets(0, 0, 5, 5);
		gbc_MCD.gridx = 4;
		gbc_MCD.gridy = 4;
		ArrayList<Jugador> todosLosMcd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MCD);
		MCD.setModel(new DefaultComboBoxModel(todosLosMcd.toArray()));
		add(MCD, gbc_MCD);

		JComboBox MD = new JComboBox();
		GridBagConstraints gbc_MD = new GridBagConstraints();
		gbc_MD.ipady = 10;
		gbc_MD.ipadx = 30;
		gbc_MD.fill = GridBagConstraints.BOTH;
		gbc_MD.insets = new Insets(0, 0, 5, 5);
		gbc_MD.gridx = 5;
		gbc_MD.gridy = 4;
		ArrayList<Jugador> todosLosMd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.MD);
		MD.setModel(new DefaultComboBoxModel(todosLosMd.toArray()));
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
		ArrayList<Jugador> todosLosLi = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.LI);
		LI.setModel(new DefaultComboBoxModel(todosLosLi.toArray()));
		add(LI, gbc_LI);

		JComboBox DFCI = new JComboBox();
		GridBagConstraints gbc_DFCI = new GridBagConstraints();
		gbc_DFCI.fill = GridBagConstraints.BOTH;
		gbc_DFCI.insets = new Insets(0, 0, 5, 5);
		gbc_DFCI.gridx = 3;
		gbc_DFCI.gridy = 6;
		ArrayList<Jugador> todosLosDfci = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DFCI);
		DFCI.setModel(new DefaultComboBoxModel(todosLosDfci.toArray()));
		add(DFCI, gbc_DFCI);

		JComboBox DFCD = new JComboBox();
		GridBagConstraints gbc_DFCD = new GridBagConstraints();
		gbc_DFCD.fill = GridBagConstraints.BOTH;
		gbc_DFCD.insets = new Insets(0, 0, 5, 5);
		gbc_DFCD.gridx = 4;
		gbc_DFCD.gridy = 6;
		ArrayList<Jugador> todosLosDfcd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.DFCD);
		DFCD.setModel(new DefaultComboBoxModel(todosLosDfcd.toArray()));
		add(DFCD, gbc_DFCD);

		JComboBox LD = new JComboBox();
		GridBagConstraints gbc_LD = new GridBagConstraints();
		gbc_LD.fill = GridBagConstraints.BOTH;
		gbc_LD.insets = new Insets(0, 0, 5, 5);
		gbc_LD.gridx = 5;
		gbc_LD.gridy = 6;
		ArrayList<Jugador> todosLosLd = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.LD);
		LD.setModel(new DefaultComboBoxModel(todosLosLd.toArray()));
		add(LD, gbc_LD);

		JComboBox POR = new JComboBox();
		GridBagConstraints gbc_POR = new GridBagConstraints();
		gbc_POR.gridwidth = 2;
		gbc_POR.fill = GridBagConstraints.BOTH;
		gbc_POR.insets = new Insets(0, 0, 5, 5);
		gbc_POR.gridx = 3;
		gbc_POR.gridy = 8;
		ArrayList<Jugador> todosLosPor = ventana.getMiEquipo().jugadoresEnPosicion(PosicionJugador.POR);
		POR.setModel(new DefaultComboBoxModel(todosLosPor.toArray()));
		add(POR, gbc_POR);

		GridBagConstraints gbc_atras = new GridBagConstraints();
		gbc_atras.anchor = GridBagConstraints.WEST;
		gbc_atras.fill = GridBagConstraints.VERTICAL;
		gbc_atras.insets = new Insets(0, 0, 0, 5);
		gbc_atras.gridx = 0;
		gbc_atras.gridy = 12;
		add(atras, gbc_atras);
		//System.out.println("ALINEACION ANTES" + ventana.getMiEquipo().getAlineacion() + "\n");
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
				//System.out.println("JUGADORES ELEGIDOS"+jugadoresElegidos);
				for(Jugador j : jugadoresElegidos) {
					try {
						ventana.getMiEquipo().setTitular(j);
					} catch (JugadorNoPerteneceAlEquipoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//System.out.println("ALINEACION DESPUES" + ventana.getMiEquipo().getAlineacion() + "\n");
				ventana.getPrimera().simularSiguienteJornada();
				ventana.getSegunda().simularSiguienteJornada();
				ventana.getTercera().simularSiguienteJornada();
				if (ventana.getResultados() != null) {
					ventana.repintarResultados();
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
