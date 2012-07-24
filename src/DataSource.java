
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSource {
	private File dataFile;
	
	public DataSource(String peFile){
		dataFile = new File(peFile.trim());
	}
	
	public void loadData() throws IOException{
		Scanner entrada = new Scanner(dataFile);
		
		Cliente auxCliente;
		int TotalClientes = entrada.nextInt();
		for(int contadorClientes = 0; contadorClientes < TotalClientes; contadorClientes ++){
			String primerNombre = entrada.next();
			String apellido = entrada.next();
			Bank.agregarCliente(primerNombre.trim(), apellido.trim());
			auxCliente = Bank.getCliente(contadorClientes);
			
			int TotalCuentas = entrada.nextInt();
			while(TotalCuentas-- > 0){
				char TipoCuenta = entrada.next().charAt(0);
				switch (TipoCuenta) {
					case 'S':{
						float balanceInicial = entrada.nextFloat();
						float porcentajeInteres = entrada.nextFloat();
						auxCliente.agregarCuenta(new CajaAhorro(balanceInicial, porcentajeInteres));
						break;
					}
					case 'C':{
						float balanceInicial = entrada.nextFloat();
						float proteccionDescubierto = entrada.nextFloat();
						
						auxCliente.agregarCuenta(new CuentaCorriente(balanceInicial, proteccionDescubierto));
						
						break;
					}
				}
			}
		}
	}
}
