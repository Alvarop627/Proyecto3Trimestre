package clases;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Division {
	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	private TreeMap<Integer, ArrayList<Equipo>> clasificacion;

public Division(ArrayList<Equipo> equipos) {
	super();
	this.jornadas = new ArrayList<Jornada>();
	this.equipos= new ArrayList<Equipo>();
	this.clasificacion = clasificacion;
	Random r = new Random();
	for (int i = 1; i <= 18; i++) {
		ArrayList<Partido> partidos = new ArrayList<Partido>();
		Boolean noRepe = true;
		Equipo local = equipos.get(r.nextInt(10));
		Equipo visitante = equipos.get(r.nextInt(10));
		
		for (int j = 1; j <=5; j++) {
			do {
				
				
				if(local==visitante) { noRepe = false;}
				for (Partido p : partidos) {
					if(p.getLocal()==local||p.getVisitante()==visitante||p.getLocal()==visitante||p.getVisitante()==local) {
						noRepe= false;
					}
				}
				
				for(Jornada jor : jornadas) {
					for(Partido pJor: jor.partidos) {
						if(pJor.getLocal()==local&&pJor.getVisitante()==visitante) {
							noRepe=false;
						}
						
					}
				}
			}while(noRepe==false);
				partidos.add(new Partido(local,visitante));
			
		
		
		}
		jornadas.add(new Jornada(i,partidos));
	}
	}

/**
 * @return the equipos
 */
public ArrayList<Equipo> getEquipos() {
	return equipos;
}

/**
 * @param equipos the equipos to set
 */
public void setEquipos(ArrayList<Equipo> equipos) {
	this.equipos = equipos;
}

/**
 * @return the clasificacion
 */
public TreeMap<Integer, ArrayList<Equipo>> getClasificacion() {
	return clasificacion;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Division [jornadas=" + jornadas + ", equipos=" + equipos + ", clasificacion=" + clasificacion
			+ ", getEquipos()=" + getEquipos() + "]";
}

/**
 * @param jornadas
 * @param equipos
 * @param clasificacion
 */


}
