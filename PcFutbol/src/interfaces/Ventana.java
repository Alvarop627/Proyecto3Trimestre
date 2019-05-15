package interfaces;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	private EligeCargarNueva ecn;
	private Cargar cargar;
	private NuevaPartida nuevaPartida;

	public Ventana() {
		super();
		ecn = new EligeCargarNueva(this);
		this.setTitle("Mi programa");
		this.setSize(300, 300);
		this.setContentPane(ecn);
		this.setResizable(false);
		this.setVisible(true);
	}


	public void irACargar() {
		// 1 - Inicializar login si no lo está ya
		if (cargar == null) {
			this.cargar = new Cargar(this);
		}
		if(ecn != null) {
			ecn.setVisible(false);
		}
		// 2 Establecer el contentPanea a esta nueva pantalla
		this.setContentPane(cargar);
		this.cargar.setVisible(true);
	}

	public void irANuevaPartida() {

		if (nuevaPartida == null) {
			this.nuevaPartida = new NuevaPartida(this);
		}
		if(ecn != null) {
			ecn.setVisible(false);
		}
		this.setContentPane(nuevaPartida);
		this.nuevaPartida.setVisible(true);
	}

	public void irAEligeCargarNueva() {

		if (ecn == null) {
			this.ecn = new EligeCargarNueva(this);
		}
		if(cargar != null) {
			cargar.setVisible(false);
		}
		if(nuevaPartida != null) {
			nuevaPartida.setVisible(false);
		}
		this.setContentPane(ecn);
		this.ecn.setVisible(true);
	}
	

}
