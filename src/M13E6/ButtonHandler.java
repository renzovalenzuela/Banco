package M13E6;

import java.awt.event.*;

public class ButtonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha realizado una acci�n");
		System.out.println("El comando del bot�n es: " + e.getActionCommand());
	}

}
