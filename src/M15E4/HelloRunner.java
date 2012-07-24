package M15E4;

public class HelloRunner implements Runnable {
	int i;
	
	@Override
	public void run() {
		i = 0;
		
		while(true){
			System.out.println("Hola " + i++);
			if(i == 50){
				break;
			}
		}
	}

}
