import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI_CajeroAutomatico {
	private JButton btnMostrarSaldo;
	private JButton btnDepositar;
	private JButton btnExtraer;
	private JButton btnCero;
	private JButton btnUno;
	private JButton btnDos;
	private JButton btnTres;
	private JButton btnCuatro;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnSiete;
	private JButton btnOcho;
	private JButton btnNueve;
	private JButton btnPunto;
	private JButton btnEnter;
	private JTextField txtEntrada;
	private JTextArea taSalida;
	private JTextField txtMsj;
	
	private int idCliente = -1;
	
	public GUI_CajeroAutomatico(){
		txtEntrada = new JTextField();
		txtEntrada.setEditable(false);
		taSalida = new JTextArea(10,50);
		taSalida.setEditable(false);
		txtMsj = new JTextField(50);
		
		btnMostrarSaldo = new JButton("Mostrar Saldo");
		btnMostrarSaldo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				taSalida.setText(taSalida.getText() + "\n" + (new CustomerReport().viewReport(idCliente)));
			}
		});
		btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(txtEntrada.getText().trim().equals("")) {
					taSalida.setText(taSalida.getText().trim() + "\n" + "Debe ingresar un valor a Depositar.");
				} else if(Double.parseDouble(txtEntrada.getText().trim()) <= 0){
					taSalida.setText(taSalida.getText().trim() + "\n" + "Debe ingresar un valor a Depositar superior a 0(cero).");
				}
				else{
					try{
						Bank.getCliente(idCliente).getCuenta(0).Depositar(Double.parseDouble(txtEntrada.getText().trim()));
						taSalida.setText(taSalida.getText() + "\n" + "Depósito Satisfactorio.");
					}
					catch(Exception e){
						taSalida.setText(taSalida.getText() + "\n" + e.getMessage());
					}
				}
				txtEntrada.setText("");
			}
		});
		btnExtraer = new JButton("Extraer");
		btnExtraer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(txtEntrada.getText().trim().equals("")) {
					taSalida.setText(taSalida.getText().trim() + "\n" + "Debe ingresar un valor a Depositar.");
				} else if(Double.parseDouble(txtEntrada.getText().trim()) <= 0){
					taSalida.setText(taSalida.getText().trim() + "\n" + "Debe ingresar un valor a Depositar superior a 0(cero).");
				}
				else{
					try{
						Bank.getCliente(idCliente).getCuenta(0).Extraer(Double.parseDouble(txtEntrada.getText().trim()));
						taSalida.setText(taSalida.getText() + "\n" + "Extracción Satisfactoria.");
					}
					catch(Exception e){
						taSalida.setText(taSalida.getText() + "\n" + e.getMessage());
					}
				}
				txtEntrada.setText("");
			}
		});
		btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtEntrada.setText(txtEntrada.getText().trim() + "0");
			}
		});
		btnUno = new JButton("1");
		btnUno.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "1");
			}
		});
		btnDos = new JButton("2");
		btnDos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "2");
			}
		});
		btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "3");
			}
		});
		btnCuatro = new JButton("4");
		btnCuatro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "4");
			}
		});
		btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "5");
			}
		});
		btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "6");
			}
		});
		btnSiete = new JButton("7");
		btnSiete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "7");
			}
		});
		btnOcho = new JButton("8");
		btnOcho.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "8");
			}
		});
		btnNueve = new JButton("9");
		btnNueve.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntrada.setText(txtEntrada.getText().trim() + "9");
			}
		});
		btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtEntrada.getText().trim().indexOf(".") < 0 ){
					txtEntrada.setText(txtEntrada.getText().trim() + ".");
				}
			}
		});
		btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Cliente auxCliente;
				if(!txtEntrada.getText().trim().equals("")){
					int idIngresado = Integer.parseInt(txtEntrada.getText().trim());
					txtEntrada.setText("");
				
					try{
						auxCliente = Bank.getCliente(idIngresado);
						habilitacionBotonesAccion(true);
						btnEnter.setEnabled(false);
					}
					catch(Exception e1){
						taSalida.setText(taSalida.getText().trim() + "\nCliente Inexistente.");
						return ;
					}
					taSalida.setText("Bienvenido " + auxCliente.getLastName().trim() + "," + auxCliente.getFirstName().trim() + "\n");
					idCliente = idIngresado;
				}
			}
		});
	}
	
	public void generarPantalla(){
		JFrame fraPrincipal = new JFrame("Cajero Automático");
		fraPrincipal.setLayout(new BorderLayout());
		
		JPanel panOeste = new JPanel();
		panOeste.setLayout(new BorderLayout());
		
		// --> Se agregan las Acciones
		JPanel panAcciones = new JPanel();
		panAcciones.setLayout(new GridLayout(3,1));
		panAcciones.add(btnMostrarSaldo);
		panAcciones.add(btnDepositar);
		panAcciones.add(btnExtraer);
		
		panAcciones.setVisible(true);
		panOeste.add(panAcciones,BorderLayout.NORTH);
		panOeste.add(txtEntrada,BorderLayout.CENTER);
		
		// --> Se agrega el teclado numerico
		JPanel panTecladoNumerico = new JPanel();
		panTecladoNumerico.setLayout(new GridLayout(4,3));
		panTecladoNumerico.add(btnUno);
		panTecladoNumerico.add(btnDos);
		panTecladoNumerico.add(btnTres);
		panTecladoNumerico.add(btnCuatro);
		panTecladoNumerico.add(btnCinco);
		panTecladoNumerico.add(btnSeis);
		panTecladoNumerico.add(btnSiete);
		panTecladoNumerico.add(btnOcho);
		panTecladoNumerico.add(btnNueve);
		panTecladoNumerico.add(btnCero);
		panTecladoNumerico.add(btnPunto);
		panTecladoNumerico.add(btnEnter);
		
		panTecladoNumerico.setVisible(true);
		panOeste.add(panTecladoNumerico,BorderLayout.SOUTH);
		
		panOeste.setVisible(true);
		fraPrincipal.add(panOeste,BorderLayout.WEST);
		
		// --> Se agrega la salida
		JPanel panSalida = new JPanel();
		panSalida.setLayout(new BorderLayout());
		panSalida.add(taSalida,BorderLayout.CENTER);
		panSalida.add(txtMsj, BorderLayout.SOUTH);
		
		panSalida.setVisible(true);
		fraPrincipal.add(panSalida,BorderLayout.CENTER);
		
		fraPrincipal.pack();
		fraPrincipal.setVisible(true);
	}
	public static void main(String[] args) {
		Bank.agregarCliente("Pompin", "Pepe");
		Cuenta auxCuenta = new CajaAhorro(500, 3);
		Bank.getCliente(0).agregarCuenta(auxCuenta);
		GUI_CajeroAutomatico Cajero = new GUI_CajeroAutomatico();
		Cajero.generarPantalla();
		Cajero.seteoInicial();
	}
	
	public void seteoInicial(){
		habilitacionBotonesAccion(false);
		taSalida.setText("Ingrese su Nro. de Cliente y presione ENTER.");
	}
	public void habilitacionBotonesAccion(boolean peHabilitacion){
		btnMostrarSaldo.setEnabled(peHabilitacion);
		btnExtraer.setEnabled(peHabilitacion);
		btnDepositar.setEnabled(peHabilitacion);
	}

}
