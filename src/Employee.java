import java.util.Date;
public class Employee {
	private String name = "";
	private double salary;
	private Date birthDate;
	
	public Employee(String peName, double peSalary, Date peBirthDate){
		this.name = peName.trim();
		this.salary = peSalary;
		this.birthDate = peBirthDate;
	}
	public String getDetails(){
		return "Name: " + name.trim() + "\n" +
				"Salary: " + salary;
	}
	public void test(int... peValor){
		
	}
}
