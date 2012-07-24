package M12E17;

import java.awt.*;

import javax.swing.*;

public class EjemploZonas {
	private JFrame f;
	private JButton bn, bs, bw, be, bc;
	
	public EjemploZonas(){
		//f = new JFrame("Border Layout");
		//f = new JFrame("Ejemplo GUI");
		f = new JFrame("Ejemplo Cuadrícula");
		bn = new JButton("Boton 1");
		bs = new JButton("Boton 2");
		bw = new JButton("Boton 3");
		be = new JButton("Boton 4");
		bc = new JButton("Boton 5");
	}
	
	public void launchFrame(){
		//f.add(bn,BorderLayout.NORTH);
		//f.add(bs,BorderLayout.SOUTH);
		//f.add(bw,BorderLayout.WEST);
		//f.add(be,BorderLayout.EAST);
		//f.add(bc,BorderLayout.CENTER);
		//f.setLayout(new FlowLayout());
		f.setLayout(new GridLayout(3,2));
		f.add(bn);
		f.add(bs);
		f.add(bw);
		f.add(be);
		f.add(bc);
		f.pack();
		//f.setSize(400,200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		EjemploZonas guiWindow2 = new EjemploZonas();
		guiWindow2.launchFrame();

	}

}
