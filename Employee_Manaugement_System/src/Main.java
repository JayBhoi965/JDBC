import Employeedata.Employee;
import Tasks_pkg.TaskCls;

public class Main {

	 
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		TaskCls t1 = new TaskCls();
		t1.save(emp1);
		
	}

}
