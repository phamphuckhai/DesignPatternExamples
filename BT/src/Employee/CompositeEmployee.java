package Employee;
import java.util.List;
import java.util.ArrayList;



public class CompositeEmployee implements Employee{
	String name;
	String salary;
	String role;
	List<Employee> listEmployee;
	
	public CompositeEmployee(String name, String salary, String role) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.role = role;
		listEmployee = new ArrayList<Employee>();
	}
	@Override
	public String getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	@Override
	 	public void add(Employee e) {
		 listEmployee.add(e);
	   }

	@Override
	   public void remove(Employee e) {
		   listEmployee.remove(e);
	   }

	@Override
	   public List<Employee> getListEmployee(){
	     return listEmployee;
	   }
	   
	@Override
	   public void printEmployee() {
		   System.out.println("Tên: "+this.name+", Lương: "+this.salary+", Chức vụ: "+this.role);
	   }
}
