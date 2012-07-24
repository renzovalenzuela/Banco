import java.util.ArrayList;
import java.util.List;


public class Cliente {
	private String firstName;
	private String lastName;
	private List<Cuenta> cuentasBancaria = new ArrayList<Cuenta>();
	//private int nroCuentas = 0;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Cliente(){ }
	/*public Cliente(String pefirstName, String pelastName, Cuenta[] pecuentasBancaria){
		this.firstName = pefirstName.trim();
		this.lastName = pelastName.trim();
		this.cuentasBancaria = pecuentasBancaria;
	}*/
	public Cliente(String pefirstName, String pelastName){
		this.firstName = pefirstName.trim();
		this.lastName = pelastName.trim();
	}
	
	public void agregarCuenta(Cuenta peCuenta){
		cuentasBancaria.add(peCuenta);
	}
	public Cuenta getCuenta(int peIndice){
		if(cuentasBancaria.size() > 0){
			return cuentasBancaria.get(peIndice);
		}
		else{
			return null;
		}
	}
	public int getNroCuentas(){
		return cuentasBancaria.size();
	}
}
