package componentes;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import interfaces.Ventana;

public class MiPanel extends JPanel {
	ImageIcon imagen;
	private Ventana ventana;
	public MiPanel() {

	}
	public MiPanel(Ventana v,String rutaImagen) {
		super();
		this.ventana=v;	
		imagen = new ImageIcon(getClass().getResource(rutaImagen));
		setSize(imagen.getIconWidth(),imagen.getIconHeight());
		initComponents();
	}
	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
	protected void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
}
