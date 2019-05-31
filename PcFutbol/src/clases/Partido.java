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
						local.sumarGolAFavor();
						visitante.sumarGolEnContra();
					}
				} else {
					int opcionGol = r.nextInt(3);
					if (opcionGol >1) {
						golesVisitante++;
						visitante.sumarGolAFavor();
						local.sumarGolEnContra();
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
			local.sumarPartidosJugados();
			visitante.sumarPartidosJugados();
			//System.out.println(local.getNombre()+": "+this.getGolesLocal()+" - "+visitante.getNombre()+": "+this.getGolesVisitante());
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
	public void sumarPuntos() throws PartidoNoJugadoException{
		if (jugado == false) {
			throw new PartidoNoJugadoException("El partido aún no se ha jugado.");
		}else if (this.getGolesLocal() > this.getGolesVisitante()) {
			local.sumarVictoria();
			visitante.sumarDerrota();
			
		}
		else if (this.getGolesLocal() < this.getGolesVisitante()) {
			visitante.sumarVictoria();
			local.sumarDerrota();
		}
		else if(this.getGolesLocal() == this.getGolesVisitante()) {
			local.sumarEmpate();
			visitante.sumarEmpate();
		}
		
		
		// Si jugado es false, lanzar excepción. Si no, devolver el que más goles haya
		// marcado o null si hay empate.

	}

	/**
	 * @return the jugado
	 */
	public boolean isJugado() {
		return jugado;
	}
	/**
	 * @param jugado the jugado to set
	 */
	public void setJugado(boolean jugado) {
		this.jugado = jugado;
	}
	
	
	@Override
	public String toString() {
		return local.getNombre()+": "+this.getGolesLocal()+" - "+visitante.getNombre()+": "+this.getGolesVisitante();
	}

}
