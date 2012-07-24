package P4EJ1;

public class FooBarBaz {
	public FooBarBaz(){
		
	}
	
	public String Salida(int peNro){
		String Salida = String.valueOf(peNro);
		
		if((peNro % 3) == 0){
			Salida = Salida + " foo";
		}
		if((peNro % 5) == 0){
			Salida = Salida + " bar";
		}
		if((peNro % 7) == 0){
			Salida = Salida + " baz";
		}
		
		return Salida;
	}
}
