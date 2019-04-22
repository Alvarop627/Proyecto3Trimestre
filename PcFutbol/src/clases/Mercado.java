package clases;

import java.util.ArrayList;

public class Mercado {
	private static ArrayList<Jugador> jugadores;

	public Mercado(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public static ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
}
