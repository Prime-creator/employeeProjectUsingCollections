package project;

public class App {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setCompany("sab paisa");
		emp.setName("rahul");
		emp.setState("delhi");
		
		Employee emp1 = new Employee();
		emp1.setCompany("sab paisa");
		emp1.setName("paul");
		emp1.setState("up");
		
		Employee emp2 = new Employee();
		emp2.setCompany("sab paisa");
		emp2.setName("pope");
		emp2.setState("gujarat");
		
		Service serv = new Service();
		serv.add(emp);
		serv.add(emp1);
		serv.add(emp2);
		System.out.println(serv.printEmp());
		Employee upEmp = new Employee(2,"chahal","sapient","tamil nadu");
		serv.updateEmp(upEmp);
		System.out.println("hello");
		System.out.println(serv.printEmp());
	}
}
