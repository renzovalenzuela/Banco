package P7EJ2;

public class Cat extends Animal implements Pet {
	private String name;
	
	public String getName(){
		return this.name.trim();
	}
	public void setName(String peName){
		this.name = peName.trim();
	}
	
	public Cat(String peName){
		super(4);
		this.name = peName.trim();
	}
	public Cat(){
		this("");
	}
	
	public void play(){
		System.out.println("A " + this.name.trim() + " le gusta jugar con hilos");
	}
	public void eat(){
		System.out.println("Los gatos comen arañas y lauchas");
	}
}
