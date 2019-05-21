package clases;

import java.util.ArrayList;

import excepciones.JugadorNoPerteneceAlEquipoException;
import excepciones.MuyPocosJugadoresException;

public class Equipo {
	String nombre;
	private int puntos;
	private int golesAFavor;
	private int golesEnContra;
	private ArrayList<Jugador> plantilla;
	private static PosicionJugador[] posiciones442 = { PosicionJugador.POR, PosicionJugador.LD, PosicionJugador.LI,
			PosicionJugador.DCI, PosicionJugador.DCD, PosicionJugador.MD, PosicionJugador.MI, PosicionJugador.MCD,
			PosicionJugador.MCI, PosicionJugador.DCI, PosicionJugador.DCD };

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
			plantilla.add(new Jugador(posiciones442[i % 11], (i < 11)));
		}
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.setPuntos(0);
		this.plantilla = new ArrayList<Jugador>();
		for (int i = 0; i < 12; i++) {
			plantilla.add(new Jugador());
		}
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
	}

	protected void sumarEmpate() {
		puntos++;
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

	@Override
	public String toString() {
		return "LOCAL: " + nombre + ", puntos: " + puntos + ", alineacion: " + this.getAlineacion();
	}

	public void ficharJugador(Jugador j1) {
		this.getPlantilla().add(j1);
	}
}
