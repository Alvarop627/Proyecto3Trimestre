package clases;

import java.util.Random;

import excepciones.PartidoNoJugadoException;

public class Partido {
	private Equipo local;
	private Equipo visitante;
	private byte golesLocal;
	private byte golesVisitante;
	private boolean jugado;

	public Partido(Equipo local, Equipo visitante) {
		this.local=local;
		this.visitante=visitante;
		this.golesLocal=0;
		this.golesVisitante=0;
		this.jugado=false;
	}
	/**
	 * Requisito : Llamar a jugar antes de llamar a golesLocal y golesVisitante
	 */
	public void jugar() {
		if(!jugado) {
			int sumCarLocal = 0;
			
			int sumCarVisitante = 0;
			Random r = new Random();
	
			// Decidir golesLocal y golesVisitante con respecto a las reglas que hemos
			// puesto
			for (Jugador j : local.getAlineacion()) {
				sumCarLocal += j.getFuerza() + j.getVelocidad() + j.getResistencia() + j.getTecnica();
			}
			for (Jugador j : visitante.getAlineacion()) {
				sumCarVisitante += j.getFuerza() + j.getVelocidad() + j.getResistencia() + j.getTecnica();
			}
	
			for (int i = 0; i <= 7; i++) {
				int puntuacionLocal = r.nextInt(sumCarLocal)/2 + sumCarLocal / 2;
				int puntuacionVisitante = r.nextInt(sumCarVisitante)/2 + sumCarVisitante / 2;
				if (puntuacionLocal > puntuacionVisitante) {
					int opcionGol = r.nextInt(3);
					if (opcionGol >1) {
						golesLocal++;
					}
				} else {
					int opcionGol = r.nextInt(3);
					if (opcionGol >1) {
						golesVisitante++;
					}
				}
			}
			// Tres veces mas opcion de gol para el local aqui
			for (int i = 0; i < 3; i++) {
				int opcionGol = r.nextInt(3);
				if (opcionGol == 3) {
					golesLocal++;
				}
			}
	
			// poner jugado a true;
			this.jugado=true;
		}
	}

	/**
	 * @return the golesLocal
	 */
	public byte getGolesLocal() {
		return golesLocal;
	}

	/**
	 * @return the golesVisitante
	 */
	public byte getGolesVisitante() {
		return golesVisitante;
	}

	/**
	 * @return the local
	 */
	public Equipo getLocal() {
		return local;
	}
	/**
	 * @return the visitante
	 */
	public Equipo getVisitante() {
		return visitante;
	}
	public Equipo getGanador() throws PartidoNoJugadoException{
		Equipo ganador = null;
		if (jugado == false) {
			throw new PartidoNoJugadoException("El partido aún no se ha jugado.");
		}
		if (this.getGolesLocal() > this.getGolesVisitante()) {
			ganador = local;
		}
		if (this.getGolesLocal() < this.getGolesVisitante()) {
			ganador = visitante;
		}
		ganador.sumarVictoria();
		return ganador;
		// Si jugado es false, lanzar excepción. Si no, devolver el que más goles haya
		// marcado o null si hay empate.

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return local.getNombre()+": "+this.getGolesLocal()+" - "+visitante.getNombre()+": "+this.getGolesVisitante();
	}

}
