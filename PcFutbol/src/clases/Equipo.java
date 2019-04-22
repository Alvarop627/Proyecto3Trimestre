package clases;

import java.util.ArrayList;

public class Equipo {
	String nombre;
	private int puntos;
	private ArrayList<Jugador> plantilla;
	
	public Equipo(String nombre, ArrayList<Jugador> plantilla) {
		super();
		this.nombre = nombre;
		this.setPuntos(0);
		this.plantilla = plantilla;
	}
	
	public Equipo(String nombre,int njugadores) {
		this.nombre = nombre;
		this.setPuntos(0);
		this.plantilla = new ArrayList<Jugador>();
		for (int i = 0; i < njugadores; i++) {
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
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the plantilla
	 */
	public ArrayList<Jugador> getPlantilla() {
		return plantilla;
	}

	/**
	 * @param plantilla the plantilla to set
	 */
	public void setPlantilla(ArrayList<Jugador> plantilla) {
		this.plantilla = plantilla;
	}

	public ArrayList<Jugador> getAlineacion(Equipo e){
		ArrayList<Jugador> alineacion =new ArrayList<Jugador>();
		
		for(Jugador j : e.getPlantilla()) {
			if(j.esTitular()==true) {
				alineacion.add(j);
			}
		}
		return alineacion;
	}
	
	public void setAlineacion(Equipo e) {
		ArrayList<Jugador> alineacion =new ArrayList<Jugador>();
		for(Jugador j : e.getPlantilla()) {
			if(j.esTitular()==true&&!alineacion.contains(j)) {
				alineacion.add(j);
			}else if(j.esTitular()==false){alineacion.remove(j);
			
			}
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + ", plantilla=" + plantilla + "]";
	}
	
	
}
	
	/*public void ficharJugador(Jugador j1){
        this.getPlantilla().add((Mercado.getJugadores()));
}*/
