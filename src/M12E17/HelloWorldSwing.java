package M12E17;

import javax.swing.*;

public class HelloWorldSwing {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}
	
	public static void createAndShowGUI(){
		JFrame frame = new JFrame("Hello World Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hello World");
		frame.add(label);
		frame.setSize(300,200);
		frame.setVisible(true);
	}

}
