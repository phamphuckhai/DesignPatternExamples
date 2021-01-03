package Employee;

import java.util.List;

public interface Employee {
	public String getSalary();
	public void add(Employee e);
	public void remove(Employee e);
	public List<Employee> getListEmployee();
	public void printEmployee();
	
}

