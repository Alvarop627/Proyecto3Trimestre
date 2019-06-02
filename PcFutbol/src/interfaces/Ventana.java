package interfaces;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import clases.Division;
import clases.Equipo;
import clases.Jornada;
import clases.Jugador;
import excepciones.MuyPocosJugadoresException;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Ventana extends JFrame {
	private EligeCargarNueva ecn;
	private ClasificacionJornada clasificacion;
	private SeleccionaEquipo selEq;
	private ProximosPartidos proxPart;
	private Resultados resultados;
	Alineacion alineacion;
	private Equipo miEquipo;
	private Division primera;
	private Division segunda;
	private Division tercera;
	protected Clip sonido;
	public ArrayList<Division> divisiones;

	public Ventana() throws MuyPocosJugadoresException {
		super();

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
		divisiones = new ArrayList<Division>();
		divisiones.add(primera);
		divisiones.add(segunda);
		divisiones.add(tercera);

		setUndecorated(true);
		ecn = new EligeCargarNueva(this, "../imagenes/pcfutbol.jpg");

		this.setTitle("PC Futbol Mini");
		// this.setSize(400, 400);
		this.setContentPane(ecn);
		this.setExtendedState(MAXIMIZED_BOTH);

		try {

			// Se obtiene un Clip de sonido
			sonido = AudioSystem.getClip();

			// Se carga con un fichero wav
			sonido.open(AudioSystem.getAudioInputStream(new File("src/audio/himnoChampions.wav")));

			// Comienza la reproducción
			sonido.start();

			// Espera mientras se esté reproduciendo.
			while (sonido.isRunning())
				Thread.sleep(1000);
			sonido.loop(100);
			// Se cierra el clip.
			// sonido.close();
		} catch (Exception e) {
			System.out.println("" + e);
		}

		selEq = new SeleccionaEquipo(this, "../imagenes/futbol2.jpg");
		clasificacion = new ClasificacionJornada(this, "../imagenes/futbol2.jpg");
		proxPart = new ProximosPartidos(this, "../imagenes/futbol2.jpg");

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @return the miEquipo
	 */
	public Equipo getMiEquipo() {
		return miEquipo;
	}

	/**
	 * @param miEquipo
	 *            the miEquipo to set
	 */
	public void setMiEquipo(Equipo miEquipo) {
		this.miEquipo = miEquipo;
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

	public void repintarClasificaciones() {
		clasificacion.removeAll();
		clasificacion.initComponents();

	}

	public void repintarProximosPartidos() {
		proxPart.removeAll();
		proxPart.initComponents();

	}

	public void repintarResultados() {
		resultados.removeAll();
		resultados.initComponents();

	}

	/**
	 * @return the clasificacion
	 */
	public ClasificacionJornada getClasificacion() {
		return clasificacion;
	}

	/**
	 * @return the proxPart
	 */
	public ProximosPartidos getProxPart() {
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
	public Alineacion getAlineacion() {
		return alineacion;
	}

	/**
	 * @return the sonido
	 */
	public Clip getSonido() {
		return sonido;
	}

	public void crearInterfazAlineacion() {
		this.alineacion = new Alineacion(this, "../imagenes/futbol2.jpg");
	}

	public void crearInterfazResultados() {
		this.resultados = new Resultados(this, "../imagenes/futbol2.jpg");
	}

	public void descenderEquipos(Division d, Division d2) {
		Equipo ultimo = d.getClasificacion().get(9);
		Equipo penultimo = d.getClasificacion().get(8);
		d2.getEquipos().add(ultimo);
		d2.getEquipos().add(penultimo);
		d.getEquipos().remove(ultimo);
		d.getEquipos().remove(penultimo);
	}

	public void ascenderEquipos(Division d, Division d2) {
		Equipo primero = d.getClasificacion().get(0);
		Equipo segundo = d.getClasificacion().get(1);
		d2.getEquipos().add(primero);
		d2.getEquipos().add(segundo);
		d.getEquipos().remove(primero);
		d.getEquipos().remove(segundo);
	}

	/**
	 * @return the divisiones
	 */
	public ArrayList<Division> getDivisiones() {
		return divisiones;
	}
	
	public void escribirClasificacion() {
		String titulo = "CLASIFICACIÓN:\n" + "Pos " + "Nombre Puntos\n";
		String clasificaciontxt="";
		String clasificacionFinal="";
		for (Division d:divisiones) {
			
		for (Equipo e : d.getClasificacion()) {
			String espacio = "";
			String espacioPosNombre = "    ";
			for (int i = 0; i < (25 - e.getNombre().length()); i++) {
				espacio += " ";
				if (d.getClasificacion().indexOf(e) == 9) {
					espacioPosNombre = "   ";
				}
			}
			clasificaciontxt += (d.getClasificacion().indexOf(e) + 1) + espacioPosNombre + e.getNombre() + espacio
					+ e.getPuntos() + "\n";
		}
		clasificacionFinal+="\n"+titulo+clasificaciontxt+"\n";}

		try {
			String ruta = "./src/interfaces/clasificacion.txt";

			File f = new File(ruta);

			FileOutputStream fs;

			fs = new FileOutputStream(f);

			ObjectOutputStream os;

			os = new ObjectOutputStream(fs);
			
			os.writeObject(clasificacionFinal);

			System.out.println("El archivo se ha creado");

			os.flush();

			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void LeerTablaBaseDatos() {
		Statement sql = null;
		ResultSet rs = null;
		String jugadores = "";
		String columnas = "\nID NOMBRE APELLIDOS FZA VEL RES TEC POS EQUIPO\n";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pcfutbolmini", "localhost",
					"localhost");
			System.out.println("Conexión establecida");

			sql = con.createStatement();

			rs = sql.executeQuery(
					"SELECT id,nombre,apellidos,fuerza,velocidad,resistencia,tecnica,posicion,nombreEquipo FROM jugadores");

			System.out.println("CONSULTA EJECUTADA");

			boolean r = rs.next();
			while (r) {
				jugadores += rs.getInt("id") + "  " + rs.getString("nombre") + " " + rs.getString("apellidos") + " "
						+ rs.getInt("fuerza") + " " + rs.getInt("velocidad") + " " + rs.getInt("resistencia") + " "
						+ rs.getInt("tecnica") + " " + rs.getString("posicion") + " " + rs.getString("nombreEquipo")
						+ "\n";
				r = rs.next();
			}

			String ruta = "./src/interfaces/jugadores.txt";
			
			File f = new File(ruta);

			FileOutputStream fs;

			fs = new FileOutputStream(f);

			ObjectOutputStream os;

			os = new ObjectOutputStream(fs);
			String archivo = columnas+jugadores;
			os.writeObject(archivo);

			System.out.println("El archivo se ha creado");

			os.flush();

			os.close();

			con.close();
			System.out.println("CERRADA LA CONEXION");
		} catch (SQLException e) {
			System.out.println("ERROR AL EJECUTAR LA SENTENCIA SQL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
