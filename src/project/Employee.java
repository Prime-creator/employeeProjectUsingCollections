package project;

public class Employee {
	private int id;
	private static int temp = 1;
	private String name;
	private String company;
	private String state;
	{
		temp += 1;
	}
	Employee(){
		setId();
	}
	
	public Employee(int id, String name, String company, String state) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.state = state;
	}

	public int getId() {
		return id;
	}
	private void setId() {
		this.id = temp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", state=" + state + "]";
	}
	
	
}
