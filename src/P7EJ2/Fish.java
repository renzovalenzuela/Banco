package P7EJ2;

public class Fish extends Animal implements Pet {
	private String name;
	
	public String getName(){
		return this.name.trim();
	}
	public void setName(String peName){
		this.name = peName.trim();
	}
	
	public Fish(){
		super(0);
	}
	
	public void play(){
		System.out.println("Los peces nadan todo el día");
	}
	public void walk(){
		super.walk();
		System.out.println("Los peces no caminan, nadan");
	}
	public void eat(){
		System.out.println("Los peces comen comida para peces");
	}
}
