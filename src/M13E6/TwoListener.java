package M13E6;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TwoListener implements MouseMotionListener, MouseListener {

	private JFrame f;
	private JTextField tf;
	
	public TwoListener(){
		f = new JFrame("Ejemplo de dos receptores");
		tf = new JTextField();
	}
	
	public void launchFrame(){
		JLabel label = new JLabel("Hacer click y arrastrar el ratón");
		f.add(label, BorderLayout.NORTH);
		f.add(tf,BorderLayout.SOUTH);
		
		f.addMouseMotionListener(this);
		f.addMouseListener(this);
		
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		TwoListener two = new TwoListener();
		two.launchFrame();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		String s = "El ratón ha entrado";
		tf.setText(s);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		String s = "El ratón ha salido";
		tf.setText(s);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		String s = "Arrastre del ratón: X = " + e.getX() + " Y = " + e.getY();
		tf.setText(s);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
