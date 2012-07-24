package P12E1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class ChatClient {
	private JTextArea Salida;
	private JTextField Entrada;
	private JButton Enviar;
	private JButton Salir;
	
	public ChatClient(){
		Salida = new JTextArea(10,50);
		Salida.setEditable(false);
		Entrada = new JTextField(50);
		Enviar = new JButton("Enviar");
		Salir = new JButton("Salir");
		Enviar.addActionListener(new EnviarHandler());
		Salir.addActionListener(new SalirHandler());
	}
	
	public void launchFrame(){
		JFrame frame = new JFrame("Mensajero");
		frame.setLayout(new BorderLayout());
		frame.add(Salida, BorderLayout.CENTER);
		frame.add(Entrada, BorderLayout.SOUTH);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1));
		p1.add(Enviar);
		p1.add(Salir);
		
		frame.addWindowListener(new CerrarHandler());
		frame.add(p1,BorderLayout.EAST);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		ChatClient auxChat = new ChatClient();
		auxChat.launchFrame();
	}

	// --> Controlador de Eventos de Boton
	private class EnviarHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(Entrada.getText().trim() != ""){
				Salida.setText(Salida.getText() + Entrada.getText().trim() + "\n");
				Entrada.setText("");
			}
		}
	}
	private class SalirHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	}
	private class CerrarHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
}
