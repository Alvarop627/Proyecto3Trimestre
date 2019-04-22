/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author 1DAM
 */
public class Jugador {
    private String nombre,apellidos;
    private int precio,sueldo,fuerza,velocidad,resistencia,tecnica;
    private boolean titular;
    private static final String [] grupoNom = {"Juan","Paco","Pepe","Mateo","Miguel","Fabián","Antonio","Lolo","Andrés","Ramón","Cristiano","Leo","Karim","Pedro",
            "Salvio","Eden","Lucas","Bartolo","Eustaquio","Agustin","Aleix","Michel","Joaquín","Isco","Luka","Paul","Raúl",
            "Fernando","Ter","Luis","Malcolm","Javier","Arturo","Daniel","Eusebio","Alfredo","Jesús","Keylor","Sergio",
            "Rafael","Álvaro","Jaime","Xavier","Timo","Thibaut","Vinicius","David","Manolo","Teo","Mario"};

    private static final String [] grupoAp = {"De Luiz","Ramos","Suárez","Messi","Ronaldo","Kroos","Courtois","Navas","González","Moura","Varane","De Gea",
              "Torres","Hernández","Coutinho","Dembélé","Hazard","Sánchez","Ontiveros","Pogba","Di Stefano","Iniesta","Salgado",
              "Gaitán","Téllez","Vidal","Junior","Morata","Modric","Aureola","Benzema","Alarcón","Pacheco","Caballero",
              "Pérez","Martín","Fernández","Bravo","Vargas","Stegen","Jiménez","Valderrama","Cortés","Martínez","Rabiot",
              "López","Verrati","Casillas","Reina","Puskas"};

    public Jugador(String nombre, String apellidos, int precio, int sueldo, int fuerza, int velocidad, int resistencia, int tecnica) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.precio = precio;
        this.sueldo = sueldo;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.tecnica = tecnica;
    }

	public Jugador() {
		Random r = new Random();
		this.setNombre(grupoNom[r.nextInt(50)]);
		this.setApellidos(grupoAp[r.nextInt(50)]+" "+grupoAp[r.nextInt(50)]);
		this.setFuerza(r.nextInt(100));
		this.setVelocidad(r.nextInt(100));
		this.setResistencia(r.nextInt(100));
		this.setTecnica(r.nextInt(100));
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre modifica el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return los apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos modifica los apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return el precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio modifica el precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return el sueldo
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo modifica el sueldo
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return la fuerza
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * @param fuerza modifica la fuerza
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * @return la velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad modifica la velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return la resistencia
	 */
	public int getResistencia() {
		return resistencia;
	}

	/**
	 * @param resistencia modifica la resistencia
	 */
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	/**
	 * @return la tecnica
	 */
	public int getTecnica() {
		return tecnica;
	}

	/**
	 * @param tecnica modifica la tecnica
	 */
	public void setTecnica(int tecnica) {
		this.tecnica = tecnica;
	}

	public boolean esTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n------------------------------------------------------------------------------------------------------\n"+"nombre=" + nombre + ", apellidos=" + apellidos + ", precio=" + precio + ", sueldo=" + sueldo
				+ ", fuerza=" + fuerza + ", velocidad=" + velocidad + ", resistencia=" + resistencia + ", tecnica="
				+ tecnica + ", titular=" + titular+"\n";
	}
    
    
    
}

