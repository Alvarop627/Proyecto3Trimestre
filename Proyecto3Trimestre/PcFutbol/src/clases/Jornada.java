package clases;

import java.util.ArrayList;
import java.util.Arrays;

import excepciones.PartidoNoJugadoException;

public class Jornada {
	private Partido[] partidos;
	private int numJornada;

	public Jornada(int numJornada, Partido[] partidosJor) {
		this.partidos = partidosJor;
		this.numJornada = numJornada;

	}

	/**
	 * @return the partidos
	 */
	public Partido[] getPartidos() {
		return partidos;
	}

	/**
	 * @return the partidos
	 */
	public String getNombresPartidos() {
		String s = "";

		for (int i = 0; i < this.partidos.length; i++) {
			s += "<html><body>" + partidos[i].toString() + "<br></body></html>";
		}
		return s;
	}

	/**
	 * @return the i
	 */
	public int getNumJornada() {
		return numJornada;
	}

	public String toString() {
		return "Jornada " + numJornada + ": \n" + this.getNombresPartidos();
	}

	public void simularJornada() {
		for (Partido p : this.getPartidos()) {
			p.jugar();
			try {
				p.sumarPuntos();
				p.setJugado(true);
			} catch (PartidoNoJugadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
