package pcfutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import clases.Division;
import clases.Equipo;
import clases.Jornada;
import clases.Partido;
import excepciones.MuyPocosJugadoresException;
import excepciones.PartidoNoJugadoException;

public class Main {

	public static void main(String[] args) throws MuyPocosJugadoresException, PartidoNoJugadoException {

		Equipo astonBirras = new Equipo("Aston Birras", 11);
		Equipo nottingham = new Equipo("Nottingham Prisa", 11);
		Equipo realSuciedad = new Equipo("Real Suciedad", 11);
		Equipo steagua = new Equipo("Steagua de Grifo", 11);
		Equipo maccabi = new Equipo("Maccabi de Levantar", 11);
		Equipo vodkaJuniors = new Equipo("Vodka Juniors", 11);
		Equipo munich = new Equipo("Vater de Munich", 11);
		Equipo recreativo = new Equipo("Recreativo de Juerga", 11);
		Equipo hannover = new Equipo("Hannover Ná", 11);
		Equipo milan = new Equipo("Esfinter de Milan", 11);
		
		Equipo blackvodk = new Equipo("Blackvodk Rovers", 11);
		Equipo real = new Equipo("Real Barril", 11);
		Equipo spartak = new Equipo("Spartak de reir", 11);
		Equipo drink = new Equipo("Drink Team", 11);
		Equipo pes = new Equipo("PES United", 11);
		Equipo cska = new Equipo("CSKA La Ropa", 11);
		Equipo werder = new Equipo("Werder Efilón", 11);
		Equipo berlin = new Equipo("Harto de Berlin", 11);
		Equipo schalke = new Equipo("Schalke Temeto", 11);
		Equipo deportivo = new Equipo("Deportivo Trago Corto", 11);
		
		Equipo newpi = new Equipo("Newpi", 11);
		Equipo muppet = new Equipo("Muppet", 11);
		Equipo bayern = new Equipo("Bayern de los caidos", 11);
		Equipo kff = new Equipo("Kentucky Fried Football", 11);
		Equipo lisiados = new Equipo("Lisiados FC", 11);
		Equipo rayo = new Equipo("Rayo Vayacaño", 11);
		Equipo river = new Equipo("River Fake", 11);
		Equipo estrella = new Equipo("Estrella Coja", 11);
		Equipo sanFrancis = new Equipo("San Francis", 11);
		Equipo mambo = new Equipo("Mambo FC", 11);
		
		
		ArrayList<Equipo> equiposPrimera = new ArrayList<Equipo>();
		equiposPrimera.add(astonBirras);
		equiposPrimera.add(nottingham);
		equiposPrimera.add(realSuciedad);
		equiposPrimera.add(steagua);
		equiposPrimera.add(maccabi);
		equiposPrimera.add(vodkaJuniors);
		equiposPrimera.add(munich);
		equiposPrimera.add(recreativo);
		equiposPrimera.add(hannover);
		equiposPrimera.add(milan);
		
		ArrayList<Equipo> equiposSegunda = new ArrayList<Equipo>();
		equiposSegunda.add(blackvodk);
		equiposSegunda.add(real);
		equiposSegunda.add(spartak);
		equiposSegunda.add(drink);
		equiposSegunda.add(pes);
		equiposSegunda.add(cska);
		equiposSegunda.add(werder);
		equiposSegunda.add(berlin);
		equiposSegunda.add(schalke);
		equiposSegunda.add(deportivo);
		
		ArrayList<Equipo> equiposTercera = new ArrayList<Equipo>();
		equiposTercera.add(newpi);
		equiposTercera.add(muppet);
		equiposTercera.add(bayern);
		equiposTercera.add(kff);
		equiposTercera.add(lisiados);
		equiposTercera.add(rayo);
		equiposTercera.add(river);
		equiposTercera.add(estrella);
		equiposTercera.add(sanFrancis);
		equiposTercera.add(mambo);

		Division primera = new Division("Primera Division", equiposPrimera);
		Division segunda = new Division("Segunda Division", equiposSegunda);
		Division tercera = new Division("Tercera Division", equiposTercera);
		
		primera.simular();
		segunda.simular();
		tercera.simular();

	}
}
