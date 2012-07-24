package M15E26;

public class Consumer implements Runnable {
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	
	public Consumer(SyncStack s){
		theStack = s;
		num = counter++;
	}

	@Override
	public void run() {
		char c;
		
		for(int i = 0; i < 200; i++){
			c = theStack.pop();
			System.out.println("Consumidor" + num + ":" + c);
			
			try{
				Thread.sleep((int)(Math.random() * 300));
			}
			catch(InterruptedException e){
				System.err.println("Punto 3: " + e.getMessage().trim());
			}
		}
	}
	
	
}
