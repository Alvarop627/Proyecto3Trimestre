package componentes;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MiLabel extends JLabel{
	public MiLabel(String txt) {
		super(txt);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
	}
	
	public MiLabel(String txt,int fontsize) {
		super(txt);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Britannic Bold", Font.PLAIN, fontsize));
	}
	
	public MiLabel(String txt,int fontsize,int style) {
		super(txt);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Britannic Bold", Font.PLAIN, fontsize));
	}

}
