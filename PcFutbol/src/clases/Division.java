package clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import excepciones.PartidoNoJugadoException;

public class Division {
	private String nombre;
	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	private String clasificacion;

	public Division(String nombre, ArrayList<Equipo> equipos) {
		super();
		this.nombre = nombre;
		this.jornadas = new ArrayList<Jornada>();
		this.equipos = equipos;

		this.clasificacion = clasificacion;
		Random r = new Random();
		for (int iter = 0; iter <= 17; iter++) {

			Boolean noRepe = true;
			Partido[] partidos = new Partido[5];

			LinkedList<Equipo> equiposSinUsar = new LinkedList<Equipo>();
			for (int k = 0; k < equipos.size(); k++) {
				equiposSinUsar.add(equipos.get(k));
			}

			// Partidos
			for (int j = 0; j < 5; j++) {

				Equipo local;
				Equipo visitante;
				do {
					local = equiposSinUsar.get(r.nextInt(equiposSinUsar.size()));
					visitante = equiposSinUsar.get(r.nextInt(equiposSinUsar.size()));

					while (local == visitante) {
						visitante = equiposSinUsar.get(r.nextInt(equiposSinUsar.size()));
					}
					for (Partido p : partidos) {
						if (p != null && (p.getLocal() == local || p.getVisitante() == visitante
								|| p.getLocal() == visitante || p.getVisitante() == local)) {
							noRepe = false;
							break;
						}
					}

					for (Jornada jor : jornadas) {
						if (jor != null) {
							for (Partido pJor : jor.getPartidos()) {
								if (pJor != null && (pJor.getLocal() == local && pJor.getVisitante() == visitante)) {
									// visitante= equiposSinUsar.get(r.nextInt(equiposSinUsar.size()));
									// noRepe = false;
									break;
								}

							}
						}
					}
				} while (noRepe == false);
				partidos[j] = new Partido(local, visitante);
				equiposSinUsar.remove(local);
				equiposSinUsar.remove(visitante);
			}
			jornadas.add(new Jornada(iter, partidos));

		}
	}

	/**
	 * @return the equipos
	 */
	public ArrayList<Equipo> getEquipos() {

		return equipos;
	}

	public String getNombresEquipos() {
		String s = "";
		for (Equipo e : equipos) {
			s += e.getNombre() + "\n";
		}
		return s;
	}

	/**
	 * @param equipos
	 *            the equipos to set
	 */
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	/**
	 * @return the clasificacion
	 */
	public String getClasificacion() {
		String clasificacion = "CLASIFICACIÓN:\n" + "Pos  " + "Nombre                   Puntos\n";
		Comparator<Equipo> comparator = new Comparator<Equipo>() {
			public int compare(Equipo a, Equipo b) {

				int resultado = Integer.compare(a.getPuntos(), b.getPuntos());
				if (resultado != 0) {
					return resultado;
				}

				resultado = Integer.compare(a.getGolesAFavor() - a.getGolesEnContra(),
						b.getGolesAFavor() - b.getGolesEnContra());
				if (resultado != 0) {
					return resultado;
				}

				return resultado;

			}
		};
		List<Equipo> listaOrdenada = this.getEquipos().stream().sorted(comparator.reversed())
				.collect(Collectors.toList());

		for (Equipo e : listaOrdenada) {
			String espacio = "";
			String espacioPosNombre="    ";
			for (int i = 0; i < (25 - e.getNombre().length()); i++) {
				espacio += " ";
				if(listaOrdenada.indexOf(e)==9) {
					espacioPosNombre="   ";
				}
			}
			clasificacion+=(listaOrdenada.indexOf(e)+1)+ espacioPosNombre+ e.getNombre() + espacio + e.getPuntos() + "\n";
		}
		return clasificacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the jornadas
	 */
	public ArrayList<Jornada> getJornadas() {
		return jornadas;
	}

	@Override
	public String toString() {
		return this.getNombre() + "\n" + jornadas.toString() + ", clasificacion : " + clasificacion;
	}

	public void simular() {
		System.out.println("--------------------------------------------------------------------------\n"+this.getNombre()+"\n--------------------------------------------------------------------------\n");
		for (Jornada j : this.getJornadas()) {
			System.out.println("--------------------------------------------------------------------------\nJORNADA "
					+ (j.getNumJornada()+1)
					+ "\n--------------------------------------------------------------------------\n");
			for (Partido p : j.getPartidos()) {
				p.jugar();
				try {
					p.sumarPuntos();
				} catch (PartidoNoJugadoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("RESULTADOS:\n" + j.getNombresPartidos());
			System.out.println(this.getClasificacion());

		}
	}
}