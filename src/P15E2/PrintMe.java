package P15E2;

public class PrintMe implements Runnable {
	private String nombre;
	
	public PrintMe(){
	}
	@Override
	public void run() {
		for(int cont = 0 ; cont < 10; cont ++){
			System.out.println(Thread.currentThread().getName().trim());
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				
			}
		}
	}

}
