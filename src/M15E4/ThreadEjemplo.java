package M15E4;

public class ThreadEjemplo extends Thread {
    public ThreadEjemplo(String str) {
        super(str);
    }
    public void run() {
    	System.out.print("Prioridad :  "+this.getPriority()+"\n");
        for (int i = 0; i < 10 ; i++) 
            System.out.println(i + " " + getName());
        
        System.out.println("Termina thread " + getName());
    }
    public static void main (String [] args) {
        new ThreadEjemplo("Pepe").start();
        new ThreadEjemplo("Juan").start();
        System.out.println("Termina thread main");
    }
}