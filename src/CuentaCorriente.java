
public class CuentaCorriente extends Cuenta {
	private double proteccionDescubierto;
	
	public CuentaCorriente(double peBalance, double peProteccionDescubierto){
		super(peBalance);
		proteccionDescubierto = peProteccionDescubierto;
	}
	public CuentaCorriente(double peBalance){
		super(peBalance);
	}
	
	public void Extraer(double peValor) throws OverdraftException {
		if(peValor > 0){
			if((super.Balance - peValor) < proteccionDescubierto){
				throw new OverdraftException("Saldo insuficiente debido a la protección", proteccionDescubierto);
			}
			else{
				super.Balance = super.Balance - peValor; 
			}
		}
	}
}
