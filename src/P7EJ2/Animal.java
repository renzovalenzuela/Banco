package P7EJ2;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int peLegs){
		this.legs = peLegs;
	}
	
	public void walk(){
		System.out.println("Este animal camina en " + this.legs + " patas");
	}
	
	public abstract void eat();
}
