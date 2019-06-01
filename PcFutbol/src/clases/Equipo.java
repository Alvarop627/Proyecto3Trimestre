package clases;

import java.util.ArrayList;

import excepciones.JugadorNoPerteneceAlEquipoException;
import excepciones.MuyPocosJugadoresException;

public class Equipo {
	String nombre;
	private int puntos;
	private int golesAFavor;
	private int golesEnContra;
	private int partidosJugados;
	private int victorias;
	private int empates;
	private int derrotas;
	private int difGoles;
	private ArrayList<Jugador> plantilla;
	private static PosicionJugador[] posiciones442 = { PosicionJugador.POR, PosicionJugador.LD, PosicionJugador.LI,
			PosicionJugador.DFCI, PosicionJugador.DFCD, PosicionJugador.MD, PosicionJugador.MI, PosicionJugador.MCD,
			PosicionJugador.MCI,PosicionJugador.DI, PosicionJugador.DD };

	public Equipo(String nombre, ArrayList<Jugador> plantilla) {
		super();
		this.nombre = nombre;
		this.setPuntos(0);	
		this.plantilla = plantilla;
	}

	public Equipo(String nombre, int njugadores) throws MuyPocosJugadoresException {
		if (njugadores < 11) {
			throw new MuyPocosJugadoresException("No puedes tener menos de 11 jugadores");
		}
		this.nombre = nombre;
		this.setPuntos(0);
		this.plantilla = new ArrayList<Jugador>();
		for (int i = 0; i < njugadores; i++) {
			//System.out.println(nombre+" : "+posiciones442[i % 11]);
			plantilla.add(new Jugador(posiciones442[i % 11], (i < 12)));
			
		}
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.setPuntos(0);
		this.plantilla = new ArrayList<Jugador>();
		for (int i = 0; i < 12; i++) {
			//System.out.println(nombre+" : "+posiciones442[i % 11]);
			plantilla.add(new Jugador(posiciones442[i % 11], (i < 12)));
		}
	}
	
	public ArrayList<Jugador> jugadoresEnPosicion(PosicionJugador pj){
		ArrayList<Jugador> todos=new ArrayList<Jugador>();
		for (int i = 0; i < this.plantilla.size(); i++) {
			if(this.plantilla.get(i).getPosicion().equals(pj)) {
				todos.add(this.plantilla.get(i));
			}
		}
		return todos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	protected void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the plantilla
	 */
	public ArrayList<Jugador> getPlantilla() {
		return plantilla;
	}

	/**
	 * @param plantilla
	 *            the plantilla to set
	 */
	public void setPlantilla(ArrayList<Jugador> plantilla) {
		this.plantilla = plantilla;
	}

	public ArrayList<Jugador> getAlineacion() {
		ArrayList<Jugador> alineacion = new ArrayList<Jugador>();

		for (Jugador j : this.getPlantilla()) {
			if (j.esTitular() == true) {
				alineacion.add(j);
			}
		}
		return alineacion;
	}

	public void setTitular(Jugador j) throws JugadorNoPerteneceAlEquipoException {
		// Comprobar que j pertenece a mi equipo
		if (!(this.getPlantilla().contains(j))) {
			throw new JugadorNoPerteneceAlEquipoException("El jugador no pertenece al equipo");
		} else {
			for (Jugador jug : this.getAlineacion()) {
				if (j.getPosicion().equals(jug.getPosicion())) {
					jug.setTitular(false);
					j.setTitular(true);
				}
			}
		}
		// Si pertenece, buscar al jugador titular actual en la posición de j y ponerle
		// titular=false
		// A este jugador ponerlo titular
	}

	protected void sumarVictoria() {
		puntos += 3;
		victorias++;
	}

	protected void sumarEmpate() {
		puntos++;
		empates++;
	}
	
	/**
	 * @param derrotas the derrotas to set
	 */
	protected void sumarDerrota() {
		this.derrotas++;
	}

	public int getGolesAFavor() {
		return golesAFavor;
	}

	protected void sumarGolAFavor() {
		this.golesAFavor++;
	}

	public int getGolesEnContra() {
		return golesEnContra;
	}

	protected void sumarGolEnContra() {
		this.golesEnContra++;
	}
	protected void sumarPartidosJugados() {
		this.partidosJugados++;
		
	}
	public int getPartidosJugados() {
		return partidosJugados;
	}
	
	
	/**
	 * @return the victorias
	 */
	public int getVictorias() {
		return victorias;
	}

	/**
	 * @return the empates
	 */
	public int getEmpates() {
		return empates;
	}

	/**
	 * @return the derrotas
	 */
	public int getDerrotas() {
		return derrotas;
	}

	

	/**
	 * @return the difGoles
	 */
	public int getDifGoles() {
		return this.getGolesAFavor()-this.golesEnContra;
	}

	public String toString() {
		return "LOCAL: " + nombre + ", puntos: " + puntos /*+ ", alineacion: " + this.getAlineacion()*/;
	}

	public void ficharJugador(Jugador j1) {
		this.getPlantilla().add(j1);
	}
}
