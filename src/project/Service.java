package project;

import java.util.List;

public class Service {
	Dao dao = new Dao();
	
	void add(Employee e) {
		dao.add(e);
	}
	
	boolean deleteEmp(int id) {
		return dao.deleteEmp(id);
	}
	
	List<Employee> printEmp() {
		return dao.printEmp();
	} 
	
	boolean updateEmp(Employee emp) {
		return dao.updateEmp(emp);
	}
}
