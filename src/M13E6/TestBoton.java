package M13E6;

import javax.swing.*;
import java.awt.*;

public class TestBoton {

	private JFrame f;
	private JButton b;

	public TestBoton(){
		f = new JFrame("Test");
		b = new JButton("Pulsar");
		b.setActionCommand("ButtonPressed");
	}
	
	public void launchFrame(){
		b.addActionListener(new ButtonHandler());
		f.add(b, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		TestBoton guiApp = new TestBoton();
		guiApp.launchFrame();

	}

}
