package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import clases.Division;
import clases.Equipo;
import clases.Jornada;
import excepciones.MuyPocosJugadoresException;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Ventana extends JFrame {
	private EligeCargarNueva ecn;
	private  ClasificacionJornada clasificacion;
	private  SeleccionaEquipo selEq;
	private  ProximosPartidos proxPart;
	private  Resultados resultados;
	private  Alineacion alineacion;
	private Equipo miEquipo;
	private Division primera;
	private Division segunda;
	private Division tercera;

	public Ventana() throws MuyPocosJugadoresException {
		super();
		setUndecorated(true);
		ecn = new EligeCargarNueva(this,"../imagenes/pcfutbolmini.jpg");
		this.setTitle("PC Futbol Mini");
		// this.setSize(400, 400);
		this.setContentPane(ecn);
		this.setExtendedState(MAXIMIZED_BOTH);

		Equipo astonBirras = new Equipo("Aston Birras", 11);
		Equipo nottingham = new Equipo("Nottingham Prisa", 11);
		Equipo realSuciedad = new Equipo("Real Suciedad", 11);
		Equipo steagua = new Equipo("Steagua de Grifo", 11);
		Equipo maccabi = new Equipo("Maccabi de Levantar", 11);
		Equipo vodkaJuniors = new Equipo("Vodka Juniors", 11);
		Equipo munich = new Equipo("Vater de Munich", 11);
		Equipo recreativo = new Equipo("Recreativo de Juerga", 11);
		Equipo hannover = new Equipo("Hannover Ná", 11);
		Equipo milan = new Equipo("Esfinter de Milan", 11);

		Equipo blackvodk = new Equipo("Blackvodk Rovers", 11);
		Equipo real = new Equipo("Real Barril", 11);
		Equipo spartak = new Equipo("Spartak de reir", 11);
		Equipo drink = new Equipo("Drink Team", 11);
		Equipo pes = new Equipo("PES United", 11);
		Equipo cska = new Equipo("CSKA La Ropa", 11);
		Equipo werder = new Equipo("Werder Efilón", 11);
		Equipo berlin = new Equipo("Harto de Berlin", 11);
		Equipo schalke = new Equipo("Schalke Temeto", 11);
		Equipo deportivo = new Equipo("Deportivo Trago Corto", 11);

		Equipo newpi = new Equipo("Newpi", 11);
		Equipo muppet = new Equipo("Muppet", 11);
		Equipo bayern = new Equipo("Bayern de los caidos", 11);
		Equipo kff = new Equipo("Kentucky Fried Football", 11);
		Equipo lisiados = new Equipo("Lisiados FC", 11);
		Equipo rayo = new Equipo("Rayo Vayacaño", 11);
		Equipo river = new Equipo("River Fake", 11);
		Equipo estrella = new Equipo("Estrella Coja", 11);
		Equipo sanFrancis = new Equipo("San Francis", 11);
		Equipo mambo = new Equipo("Mambo FC", 11);

		ArrayList<Equipo> equiposPrimera = new ArrayList<Equipo>();
		equiposPrimera.add(astonBirras);
		equiposPrimera.add(nottingham);
		equiposPrimera.add(realSuciedad);
		equiposPrimera.add(steagua);
		equiposPrimera.add(maccabi);
		equiposPrimera.add(vodkaJuniors);
		equiposPrimera.add(munich);
		equiposPrimera.add(recreativo);
		equiposPrimera.add(hannover);
		equiposPrimera.add(milan);

		ArrayList<Equipo> equiposSegunda = new ArrayList<Equipo>();
		equiposSegunda.add(blackvodk);
		equiposSegunda.add(real);
		equiposSegunda.add(spartak);
		equiposSegunda.add(drink);
		equiposSegunda.add(pes);
		equiposSegunda.add(cska);
		equiposSegunda.add(werder);
		equiposSegunda.add(berlin);
		equiposSegunda.add(schalke);
		equiposSegunda.add(deportivo);

		ArrayList<Equipo> equiposTercera = new ArrayList<Equipo>();
		equiposTercera.add(newpi);
		equiposTercera.add(muppet);
		equiposTercera.add(bayern);
		equiposTercera.add(kff);
		equiposTercera.add(lisiados);
		equiposTercera.add(rayo);
		equiposTercera.add(river);
		equiposTercera.add(estrella);
		equiposTercera.add(sanFrancis);
		equiposTercera.add(mambo);

		primera = new Division("Primera Division", equiposPrimera);
		segunda = new Division("Segunda Division", equiposSegunda);
		tercera = new Division("Tercera Division", equiposTercera);

		this.setVisible(true);

	}

	/**
	 * @return the miEquipo
	 */
	public Equipo getMiEquipo() {
		return miEquipo;
	}

	/**
	 * @param miEquipo the miEquipo to set
	 */
	public void setMiEquipo(Equipo miEquipo) {
		this.miEquipo = miEquipo;
	}

	public JTable getProximaJornada(Division d) {
		JTable proxJor = new JTable();
		proxJor.setModel(
				new DefaultTableModel(
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
		// proxJor.setBounds(75, 99, 280, 80);
		return proxJor;
	}

	public JTable getUltimaJornada(Division d) {
		JTable ultJor = new JTable();
		ultJor.setModel(new DefaultTableModel(
				new Object[][] {
						{ d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[0].getLocal().getNombre(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[0].getGolesLocal(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[0].getGolesVisitante(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[0].getVisitante()
										.getNombre() },
						{ d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[1].getLocal().getNombre(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[1].getGolesLocal(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[1].getGolesVisitante(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[1].getVisitante()
										.getNombre() },
						{ d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[2].getLocal().getNombre(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[2].getGolesLocal(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[2].getGolesVisitante(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[2].getVisitante()
										.getNombre() },
						{ d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[3].getLocal().getNombre(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[3].getGolesLocal(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[3].getGolesVisitante(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[3].getVisitante()
										.getNombre() },
						{ d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[4].getLocal().getNombre(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[4].getGolesLocal(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[4].getGolesVisitante(),
								d.getJornadas().get(d.getJornadaActual() - 1).getPartidos()[4].getVisitante()
										.getNombre() }, },
				new String[] { "Local", "Goles Local", "Goles Visitante", "Visitante" }) {
			Class[] columnTypes = new Class[] { String.class, int.class, int.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		// ultJor.setBounds(75, 99, 280, 80);
		return ultJor;
	}

	public JTable getClasificacionJornada(Division d) {
		JTable table = new JTable();
		table.setBounds(10, 48, 430, 176);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(new Object[][] {
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
		table.getColumnModel().getColumn(0).setPreferredWidth(233);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(44);
		table.getColumnModel().getColumn(3).setPreferredWidth(30);
		table.getColumnModel().getColumn(4).setPreferredWidth(30);
		table.getColumnModel().getColumn(5).setPreferredWidth(30);
		table.getColumnModel().getColumn(6).setPreferredWidth(30);
		table.getColumnModel().getColumn(7).setPreferredWidth(30);
		table.getColumnModel().getColumn(8).setPreferredWidth(30);

		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.gridwidth = 4;
		gbc_table.gridx = 0;
		gbc_table.gridy = 1;
		add(table);
		return table;
	}

	public void irAClasificacionJornada() {
		// 1 - Inicializar login si no lo está ya
		if (clasificacion == null) {
			this.clasificacion = new ClasificacionJornada(this);
		}
		if (selEq != null) {
			selEq.setVisible(false);
		}
		if (ecn != null) {
			ecn.setVisible(false);
		}
		// 2 Establecer el contentPanea a esta nueva pantalla
		this.setContentPane(clasificacion);
		this.clasificacion.setVisible(true);
	}

	public void irASeleccionaEquipo() {

		if (selEq == null) {
			this.selEq = new SeleccionaEquipo(this);
		}
		if (ecn != null) {
			ecn.setVisible(false);
		}
		this.setContentPane(selEq);
		this.selEq.setVisible(true);
	}

	public void irAProximosPartidos() {
		if (proxPart == null) {
			this.proxPart = new ProximosPartidos(this);
		}
		if (ecn != null) {
			ecn.setVisible(false);
		}
		if (clasificacion != null) {
			clasificacion.setVisible(false);
		}
		this.setContentPane(proxPart);
		this.proxPart.setVisible(true);
	}

	public void irAEligeCargarNueva() {

		if (ecn == null) {
			this.ecn = new EligeCargarNueva(this);
		}
		if (clasificacion != null) {
			clasificacion.setVisible(false);
		}
		if (selEq != null) {
			selEq.setVisible(false);
		}
		this.setContentPane(ecn);
		this.ecn.setVisible(true);
	}

	public void irAResultados() {

		if (resultados == null) {
			this.resultados = new Resultados(this);
		}
		if (alineacion != null) {
			alineacion.setVisible(false);
		}
		this.setContentPane(resultados);
		this.resultados.setVisible(true);
	}

	public void irAAlineacion() {

		if (alineacion == null) {
			this.alineacion = new Alineacion(this);
		}
		if (proxPart != null) {
			proxPart.setVisible(false);
		}
		this.setContentPane(alineacion);
		this.alineacion.setVisible(true);
	}

	/**
	 * @return the primera
	 */
	public Division getPrimera() {
		return primera;
	}

	/**
	 * @return the segunda
	 */
	public Division getSegunda() {
		return segunda;
	}

	/**
	 * @return the tercera
	 */
	public Division getTercera() {
		return tercera;
	}

	public  void repintarClasificaciones() {
		clasificacion.removeAll();
		clasificacion.initComponents();

	}

	public  void repintarProximosPartidos() {
		proxPart.removeAll();
		proxPart.initComponents();

	}

	public  void repintarResultados() {
		resultados.removeAll();
		resultados.initComponents();

	}

	/**
	 * @return the clasificacion
	 */
	public  ClasificacionJornada getClasificacion() {
		return clasificacion;
	}

	/**
	 * @return the proxPart
	 */
	public  ProximosPartidos getProxPart() {
		return proxPart;
	}

	/**
	 * @return the resultados
	 */
	public Resultados getResultados() {
		return resultados;
	}

	/**
	 * @return the alineacion
	 */
	public  Alineacion getAlineacion() {
		return alineacion;
	}

}
