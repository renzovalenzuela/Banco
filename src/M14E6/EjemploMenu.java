package M14E6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EjemploMenu{
	private static JFrame Pantalla;
	private static JTextArea taSalida;
	
	public static void main(String[] args) {
		Pantalla = new JFrame("Prueba Menu");
		taSalida = new JTextArea();
		taSalida.setEditable(false);
		JMenuBar mnuPrincipal = new JMenuBar();
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenu mnuEditar = new JMenu("Editar");
		JMenu mnuAyuda = new JMenu("Ayuda");
		JMenuItem mnuArchivo_Nuevo = new JMenuItem("Nuevo");
		JMenuItem mnuArchivo_Guardar = new JMenuItem("Guardar");
		JMenuItem mnuArchivo_Cargar = new JMenuItem("Cargar");
		JMenuItem mnuArchivo_Salir = new JMenuItem("Salir");
		mnuArchivo_Nuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				taSalida.setText("Se hizo click en el menú [Nuevo]");
			}
		});
		mnuArchivo_Guardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				taSalida.setText("Se hizo click en el menú [Guardar]");
			}
		});
		mnuArchivo_Cargar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				taSalida.setText("Se hizo click en el menú [Cargar]");
			}
		});
		mnuArchivo_Salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuArchivo.add(mnuArchivo_Nuevo);
		mnuArchivo.add(mnuArchivo_Guardar);
		mnuArchivo.add(mnuArchivo_Cargar);
		mnuArchivo.addSeparator();
		mnuArchivo.add(mnuArchivo_Salir);
		mnuPrincipal.add(mnuArchivo);
		mnuPrincipal.add(mnuEditar);
		mnuPrincipal.add(mnuAyuda);
		Pantalla.setSize(300,200);
		Pantalla.setJMenuBar(mnuPrincipal);
		Pantalla.add(taSalida);
		Pantalla.setVisible(true);
	}
}
