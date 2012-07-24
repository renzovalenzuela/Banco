
public class Cuenta {
	protected double Balance;
	
	public double getBalance(){
		return this.Balance;
	}
	
	public Cuenta(){}
	public Cuenta(double peBalance){
		this.Balance = peBalance;
	}
	
	public void Depositar(double peBalance){
		if(peBalance > 0){
			this.Balance = this.Balance + peBalance;
		}
	}

	public void Extraer(double peBalance) throws OverdraftException{
		if(peBalance > 0){
			if((this.Balance - peBalance) <= 0){
				throw new OverdraftException("Saldo insuficiente", peBalance - this.Balance) ;
			}
			else{
				this.Balance = this.Balance - peBalance;
			}
		}
	}
}
