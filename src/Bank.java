import java.util.ArrayList;
import java.util.List;


public class Bank {
	private static List<Cliente> Clientes;
	//private static int numeroClientes;
	
	static{
		Clientes = new ArrayList<Cliente>();
		//numeroClientes = 0;
	}
	private Bank(){
		
	}
	
	public static void agregarCliente(String peNombre, String peApellido){
		Clientes.add(new Cliente(peNombre.trim(), peApellido.trim()));
	}
	
	public static int getNumeroClientes(){
		return Clientes.size();
	}
	
	public static Cliente getCliente(int peIndice){
		return (Cliente)Clientes.get(peIndice);
	}
}
