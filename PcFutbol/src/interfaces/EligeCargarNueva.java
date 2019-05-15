package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import componentes.BotonMenu;
import componentes.MiLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class EligeCargarNueva extends JPanel{
	private Ventana ventana;
	public EligeCargarNueva(Ventana v) {
		super();
		this.ventana=v;
		setSize(new Dimension(300, 300));
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		BotonMenu btnCargar = new BotonMenu("Cargar Partida");
		btnCargar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irACargar();
			}
});
		btnCargar.setBounds(70, 116, 137, 23);
		add(btnCargar);
		
		BotonMenu btnNuevaPartida = new BotonMenu("Nueva Partida",100,5,5);
		btnNuevaPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irANuevaPartida();
			}
		});
		btnNuevaPartida.setBounds(70, 163, 137, 23);
		add(btnNuevaPartida);
		
		MiLabel lblBienvenido = new MiLabel("Bienvenido/a");
		lblBienvenido.setBounds(10, 11, 280, 44);
		add(lblBienvenido);
		
		MiLabel lblSubtitulo = new MiLabel("<html><center>Elige cargar partida si quieres seguir con tu partida actual o inicia una nueva partida</center></html>",12);
		
		lblSubtitulo.setBounds(10, 66, 280, 37);
		add(lblSubtitulo);
		
		this.setVisible(true);
	}
}
