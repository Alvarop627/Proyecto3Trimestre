package clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Jornada {
	private Partido[] partidos;
	private int numJornada;
	public Jornada(int numJornada, Partido[] partidosJor) {
		this.partidos= partidosJor;
		this.numJornada=numJornada;
		
	
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
		String s="";
		for(int i = 0;i<this.partidos.length;i++) {
			s+=partidos[i].toString()+"\n";
		}
		return s;
	}
	
	

	/**
	 * @return the i
	 */
	public int getNumJornada() {
		return numJornada;
	}
	
	

	/**
	 * @param numJornada the numJornada to set
	 */
	public void setNumJornada(int numJornada) {
		this.numJornada = numJornada;
	}


	public String toString() {
		return "Jornada "+numJornada+": \n"+this.getNombresPartidos();
	}
	
	
	
	
	

}

