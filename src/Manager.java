import java.util.Date;


public class Manager extends Employee{
	public String department;
	
	public Manager(String peName, double peSalary, Date peBirthDate, String peDepartment){
		super(peName,peSalary,peBirthDate);
		this.department = peDepartment.trim();
	}
	public String getDetails(){
		return super.getDetails() + "\n" +
				"Department: " + this.department.trim();
	}
}
