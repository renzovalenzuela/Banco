import java.util.ArrayList;
import java.util.List;

import P4EJ1.FooBarBaz;
import P7EJ2.Animal;
import P7EJ2.Cat;
import P7EJ2.Fish;
import P7EJ2.Pet;
import P7EJ2.Spider;



public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Cuenta auxCuenta = new Cuenta();
		Cliente auxCliente = new Cliente("Pepe", "Pompin");
		auxCliente.setCuentaBancaria(auxCuenta);
		auxCliente.getCuentaBancaria().Depositar(100);
		auxCliente.getCuentaBancaria().Depositar(47);
		if(!auxCuenta.Extraer(150)){
			System.out.println(auxCliente.getFirstName().trim() + " " + auxCliente.getLastName().trim() + ": Su saldo es insuficiente.");
		}
		System.out.println(auxCliente.getFirstName().trim() + " " + auxCliente.getLastName().trim() + " - Saldo: " + auxCliente.getCuentaBancaria().getBalance());*/
		
		/*FooBarBaz FBB = new FooBarBaz();
		// --> Practica 4 - Ej. 1
		for(int contador = 1;contador <= 50 ; contador++){
			System.out.println(FBB.Salida(contador));
		}*/
		
		/*char []arreglo = {'a','b','c','d','e'};
		for (char aux : arreglo){
			System.out.println(aux);
		}
		int []arregloenteros = {1,2,3,4,5,6};
		for (int auxentero : arregloenteros){
			System.out.println(auxentero);
		}*/
		
		// --> Practica 5 - Ej. 1
		/*int [] array1 = {2,3,5,7,11,13,17,19};
		int [] array2 = {2,3,5,7,11,13,17,19};

		int contador = 0;
		System.out.print("array1 is <");
		for (int aux : array1){
			System.out.print(aux);
			if(contador != array1.length - 1){
				System.out.print(" ,");
			}
			contador++;
		}
		System.out.println(">");
		
		for (int cont = 0; cont < array2.length; cont++){
			if(cont % 2 == 0){
				array2[cont] = cont;
			}
		}
		
		System.out.print("array2 is <");
		contador = 0;
		for (int aux : array2){
			System.out.print(aux);
			if(contador != array2.length - 1){
				System.out.print(" ,");
			}
			contador++;
		}
		System.out.println(">");
		
		int [] array3 = new int [10];
		System.arraycopy(array1, 0, array3, array3.length - array2.length, array1.length);
		System.out.print("array3 is <");
		contador = 0;
		for (int aux : array3){
			System.out.print(aux);
			if(contador != array3.length - 1){
				System.out.print(" ,");
			}
			contador++;
		}
		System.out.println(">");*/
		
		// --> Practica 5 - Ej. 2
		/*Bank entidad = new Bank();
		entidad.agregarCliente("Jane", "Simms");
		entidad.agregarCliente("Owen", "Bryant");
		entidad.agregarCliente("Tim", "Soley");
		entidad.agregarCliente("Maria", "Soley");
		
		for(int contador = 0; contador < entidad.getNumeroClientes(); contador++){
			System.out.println("Customer [" + (contador + 1) + "] is " + entidad.getCliente(contador).getLastName() + ", " + entidad.getCliente(contador).getFirstName());
		}*/
		
		/*Employee empleado = new Manager("Pepe Pompin", 2000, new Date(),"Sistemas");
		System.out.println(empleado.getDetails());*/
		
		// --> Practica 6 - Ej. 7 && Practica 7 - Ej. 1 && Practica 8 - Ej. 1
		/*Cuenta auxCuenta;
		
		Bank.agregarCliente("Jane", "Simms");
		auxCuenta = new CajaAhorro(500, 3);
		Bank.getCliente(0).agregarCuenta(auxCuenta);
		
		Bank.agregarCliente("Owen", "Bryant");
		auxCuenta = new CuentaCorriente(500,0);
		Bank.getCliente(1).agregarCuenta(auxCuenta);
		
		Bank.agregarCliente("Tim", "Soley");
		auxCuenta = new CuentaCorriente(500,500);
		Bank.getCliente(2).agregarCuenta(auxCuenta);
		
		Bank.agregarCliente("Maria", "Soley");
		Bank.getCliente(3).agregarCuenta(auxCuenta);
		
		// --> Cta. Jane Simms
		try{
			Bank.getCliente(0).getCuenta(0).Extraer(150);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		Bank.getCliente(0).getCuenta(0).Depositar(22.5);
		try{
			Bank.getCliente(0).getCuenta(0).Extraer(47.62);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		try{
			Bank.getCliente(0).getCuenta(0).Extraer(400);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		
		System.out.println("Customer [" + Bank.getCliente(0).getLastName() + ", " + Bank.getCliente(0).getFirstName() + "] has a balance or " + Bank.getCliente(0).getCuenta(0).getBalance());
		
		// --> Cta. Owen Bryant
		try{
			Bank.getCliente(1).getCuenta(0).Extraer(150);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		Bank.getCliente(1).getCuenta(0).Depositar(22.5);
		try{
			Bank.getCliente(1).getCuenta(0).Extraer(47.62);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		try{
			Bank.getCliente(1).getCuenta(0).Extraer(400);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		System.out.println("Customer [" + Bank.getCliente(1).getLastName() + ", " + Bank.getCliente(1).getFirstName() + "] has a balance or " + Bank.getCliente(1).getCuenta(0).getBalance());
		
		// --> Cta. Tim Soley
		try{
			Bank.getCliente(2).getCuenta(0).Extraer(150);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		Bank.getCliente(2).getCuenta(0).Depositar(22.5);
		try{
			Bank.getCliente(2).getCuenta(0).Extraer(47.62);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		try{
			Bank.getCliente(2).getCuenta(0).Extraer(400);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		System.out.println("Customer [" + Bank.getCliente(2).getLastName() + ", " + Bank.getCliente(2).getFirstName() + "] has a balance or " + Bank.getCliente(2).getCuenta(0).getBalance());
		
		// --> Cta. Maria Soley
		Bank.getCliente(3).getCuenta(0).Depositar(150);
		try{
			Bank.getCliente(3).getCuenta(0).Extraer(750);
		}
		catch(OverdraftException e){
			System.out.println("Excepción: " + e.getMessage().trim() + ". Deficit: " + e.getDeficit());
		}
		
		System.out.println("Customer [" + Bank.getCliente(3).getLastName() + ", " + Bank.getCliente(3).getFirstName() + "] has a balance or " + Bank.getCliente(3).getCuenta(0).getBalance());
		// --> Generacion de Reporte
		//System.out.println("");
		//System.out.println("		CUSTOMERS REPORT");
		//System.out.println("		================");
		//for(int contador = 0; contador < Bank.getNumeroClientes(); contador++){
		//	System.out.println("Customer: " + Bank.getCliente(contador).getLastName() + ", " + Bank.getCliente(contador).getFirstName());
		//	if(((Cuenta)Bank.getCliente(contador).getCuenta(0)) instanceof CajaAhorro){
		//		System.out.println("	Caja de Ahorro: " + ((CajaAhorro) Bank.getCliente(contador).getCuenta(0)).getInteresAcumulado());
		//	}
		//	else{
		//		System.out.println("	Cuenta Corriente: " + Bank.getCliente(contador).getCuenta(0).getBalance());
		//	}
		//	System.out.println("");
		//}
		
		System.out.println("");
		new CustomerReport().generateReport();
		
		// --> Practica 7 - Ej. 2
		/*Fish f = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		f.play();
		c.play();
		
		e.eat();
		e.walk();
		
		a.walk();*/
		
		// --> Modulo 9 - Ej. 16
		/*List<Cuenta> la;
		List<CuentaCorriente> lc = new ArrayList<CuentaCorriente>();
		List<CajaAhorro> ls = new ArrayList<CajaAhorro>();
		
		la = lc;
		la.add(new CuentaCorriente(0));
		
		la = ls;
		la.add(new CuentaCorriente(0));
		
		CajaAhorro sa = ls.get(0);*/
		
		// --> Practica 9 - Ej. 1
		/*Cuenta auxCuenta;
		
		Bank.agregarCliente("Jane", "Simms");
		auxCuenta = new CajaAhorro(500, 3);
		Bank.getCliente(0).agregarCuenta(auxCuenta);
		
		Bank.agregarCliente("Owen", "Bryant");
		auxCuenta = new CuentaCorriente(500,0);
		Bank.getCliente(1).agregarCuenta(auxCuenta);
		
		Bank.agregarCliente("Tim", "Soley");
		auxCuenta = new CuentaCorriente(500,500);
		Bank.getCliente(2).agregarCuenta(auxCuenta);
		
		Bank.agregarCliente("Maria", "Soley");
		Bank.getCliente(3).agregarCuenta(auxCuenta);
		
		new CustomerReport().generateReport();*/
		
		// --> Practica 11 - Ej. 1
		try{
			new DataSource(args[0]).loadData();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		new CustomerReport().generateReport();
		System.out.println("Finalizado");
	}
}
