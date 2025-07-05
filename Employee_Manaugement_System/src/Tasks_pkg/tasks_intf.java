package Tasks_pkg;
 
import java.util.*;

import Employeedata.Employee;

public interface tasks_intf {

	public boolean save(Employee emp);
	
	public boolean remove(long id);
	
	public boolean update(Employee emp,long id);
	
	public List<Employee> getAll();
	
	public Employee getEmp(long id);
}
