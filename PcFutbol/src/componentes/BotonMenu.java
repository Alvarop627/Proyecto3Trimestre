package componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class BotonMenu extends JButton{
	
	public BotonMenu(String txt) {
		super(txt);
		this.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(new Color(65, 105, 225));
		this.setBorder(new LineBorder(new Color(0, 0, 0)));;
		
		this.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			setBackground(Color.yellow);
			setForeground(Color.black);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			setForeground(new Color(255, 255, 255));
			setBackground(new Color(65, 105, 225));
		}

		});
	}
	
	public BotonMenu(String txt, int r, int g, int b) {
		super(txt);
		this.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
		this.setBackground(new Color(r,g,b));
		this.setForeground(new Color(255, 255, 255));
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.yellow);
				setForeground(Color.black);
			}
			public void mouseExited(MouseEvent e) {
				setForeground(new Color(255, 255, 255));
				setBackground(new Color(r, g, b));
			}
		});
		
	}
	
	public BotonMenu(String txt,Color c) {
		super(txt);
		this.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(c);
		this.setBorder(new LineBorder(new Color(0, 0, 0)));;
		
		this.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			setBackground(Color.yellow);
			setForeground(Color.black);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			setForeground(new Color(255, 255, 255));
			setBackground(c);
		}

		});
	}

}
