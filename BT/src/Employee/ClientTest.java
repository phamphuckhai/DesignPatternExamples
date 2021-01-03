package Employee;

public class ClientTest {
	 public static void main(String[] args) {
		 // Tạo CEO
		 Employee CEO = new CompositeEmployee("Khoa", "2000$", "CEO"); 	
		 
		 Employee Marketing = new CompositeEmployee("Dũng", "1500$","Makerter");
		 
		 Employee Manufacturing = new CompositeEmployee("Khải","1500$","Manufacturing");
		 
		 Employee Advertisement = new CompositeEmployee("A","500$","Advertisement");

		 Employee Accountant = new CompositeEmployee("B","500$","Accountant");
		 
		 Employee Carrier = new CompositeEmployee("C","500$","Carrier");
		 
		 // Add thành viên cho CEO
		 
		 CEO.add(Marketing);
		 CEO.add(Manufacturing);
		 
		 // Add thành viên cho Marketing
		 
		 Manufacturing.add(Advertisement);
		 Manufacturing.add(Accountant);
		 Manufacturing.add(Carrier);
		 
		 // Get danh sách nhân viên của CEO
		 for (Employee headEmployee : CEO.getListEmployee()) {
	         headEmployee.printEmployee();
	         for (Employee employee : headEmployee.getListEmployee()) {
	        	 employee.printEmployee();
	         }
		 }

	 }
}
