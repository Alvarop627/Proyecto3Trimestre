package pcfutbol;

import java.util.ArrayList;

import clases.Division;
import clases.Equipo;
import excepciones.MuyPocosJugadoresException;

public class Main {

	public static void main(String[] args) throws MuyPocosJugadoresException {

		
		Equipo astonBirras= new Equipo("Aston Birras", 11);
		Equipo nottingham= new Equipo("Nottingham Prisa", 11);
		Equipo  realSuciedad = new Equipo("Real Suciedad", 11);
		Equipo steagua= new Equipo("Steagua de Grifo", 11);
		Equipo maccabi= new Equipo("Maccabi de Levantar", 11);
		Equipo  vodkaJuniors = new Equipo("Vodka Juniors", 11);
		Equipo munich= new Equipo("Vater de Munich", 11);
		Equipo recreativo= new Equipo("Recreativo de Juerga", 11);
		Equipo  lecce = new Equipo("Lecce Desnatada", 11);
		Equipo milan= new Equipo("Esfinter de Milan", 11);
		/*Pol Vazzo (ninguno) “polvazo“
Harto de Berlin (Herta de Berlin)
Eintracht el balón (Eintracht) “entra el balón“
Hannover Ná (Hannover) “Ja no ver nada“
Werder Efilón (Werder bremen) “ver de refilón“
Olimpique de Mareo (Olimpique de Marsella)
Olimpique de Alcorcón (Olimpique de Lyon)
Rapid de vodka (Rapid de Viena) “rapido con el vodka“
Saint Etiel (Sant ettien) “sant etil“
Vodka Wonderers “Bolton Wanderers”
Blackvodk Rovers (Blackburn Rovers) “Vodka negro rovers“
West Jamon (West Ham)
Aston Tilla (Aston Villa) “as tontilla” o “ai tortilla“
Reading a book (Reading)
Globber Torpes (Globber Trotters)
Vodka Juniors (Boca Juniors)
Real Suciedad (Real Sociedad)
Real Barril (Real Madrid)
Aston Birra (Aston Villa)
Liverfull (Liverpool)
Los testiculos de Jeovahh
Racing de Alcohol (Racing de Santander)
Esfinter de milan (Inter de milán)
sparta da risa (Sparta de Praga) “se parte de risa“
Aston Terias (Aston Villa) “haz tonterias“
Maccabi el helado (Maccabi de Telaviv) “me acabo el helado“
Universidad de Mierda (Universidad Las Palmas)
boca a boca juniors (Boca Juniors)
Ballantines Wonderers (Bolton Wonderers)
Minabo de Kiev (Dinamo de Kiev) “Mi nabo de kiev“
Yayo Vallecano (Rayo Vallecano)
Recreativo de juerga (Recreativo de Huelva)
JB positivo
Esteaua es del grifo (Steaua de Bucarest) “este agua es del grifo“
Levante una mano (Levante)
Real Furcia (Real Murcia)
Sara Goza (Real Zaragoza)
Real Bañil (Real Madrid) “albañil“
RedBull Rovers (Blackburn Rovers)
Los Angeles de Siesta (Los Angeles Galaxy)
Tributé
Drinkin Team (Dream Team)
Estrella rosa (Estrella Roja)
Pasto de Grama (Vasco da Gama)
Singermornings “cantamañanas“
Semen Up “Seven Up“
PES United “Pro Evolution Soccer“
cska la ropa (CSKA de moscow) “se seca la ropa“
Atletico y musculado (Atletico de Madrid)
Gimnastica de Ritmica (Gimnastica de Torrelavega)*/
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		equipos.add(astonBirras);
		equipos.add(nottingham);
		equipos.add(realSuciedad);
		equipos.add(steagua);
		equipos.add(maccabi);
		equipos.add(vodkaJuniors);
		equipos.add(munich);
		equipos.add(recreativo);
		equipos.add(lecce);
		equipos.add(milan);
		
		Division primera = new Division(equipos);
		System.out.println(primera);
	}

}
