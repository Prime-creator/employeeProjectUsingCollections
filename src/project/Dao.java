package project;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Dao {
	List<Employee> ll = new LinkedList();
	
	int add(Employee e) {
		ll.add(e);
		return e.getId();
	}
	
	List<Employee> printEmp() {
		return ll;
	}
	
	boolean deleteEmp(int id) {
		int n = ll.size();
		for(int i = 0; i < n; i++) {
			Employee obj = ll.get(i);
			
			if(obj.getId() == id) {
				ll.remove(i);
				return true;
			}
		}
		return false;
	}
	
	boolean updateEmp(Employee emp) {
		int n = ll.size();
		int id = emp.getId();
		for(int i = 0; i < n; i++) {
			Employee obj = ll.get(i);
			
			if(obj.getId() == id) {
				obj.setCompany(emp.getCompany());
				obj.setName(emp.getName());
				obj.setState(emp.getState());
				return true;
			}
		}
		return false;
	}
}
