package Tasks_pkg;

import java.util.*;

import java.sql.*;

import Employeedata.Employee;

public class TaskCls implements tasks_intf {
	
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	final String USERNAME = "root";
	final String PASSWORD = "Jaybhoi1229T";
	final String URL = "jdbc:mysql://localhost:3306/employee_db";

	@Override
	public boolean save(Employee emp) {
		
		String name;
		
		System.out.println("Enter your Name : ");
		name = s1.nextLine();
		
		
		String Address;
		
		System.out.println("Enter your Address : ");
		Address = s1.nextLine();
		
		
		int age;
		
		System.out.println("Enter your Age : ");
		age = s1.nextInt();
		
		
		String gender;
		
		System.out.println("Enter your Gender : ");
		gender = s2.nextLine();
		
		
		String mobile;
		
		System.out.println("Enter your Mobile Number : ");
		mobile= s2.nextLine();
		
		
		String mail;
		
		System.out.println("Enter your E-Mail : ");
		mail = s2.nextLine();
		
		emp.setName(name);
		emp.setAddress(Address);
		emp.setGender(gender);
		emp.setAge(age);
		emp.setMobile(mobile);
		emp.setMail(mail);
		
		
		//Run Query for adding new Employee here
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			Statement statement = connection.createStatement();
			
			String Query = "INSERT INTO Employee_tbl(Name,Address,Gender,Age,Mobile,E-mail) VALUES('"+emp.getName()+"','"+emp.getAddress()+"','"+emp.getGender()+"','"+emp.getAge()+"','"+emp.getMobile()+"','"+emp.getMail()+"')";// Query of adding above data
	
			statement.execute(Query);
			
			long id;
			
			String IDFetchQuery = "SELECT ID FROM Employee_tbl where Name = '"+emp.getName()+"'";
			
			ResultSet rs = statement.executeQuery(IDFetchQuery);
			
			id = rs.getLong("ID");
			
			emp.setId(id); 
			
		}
		catch(Exception ee) {
			ee.printStackTrace();
			return false;
		}
		
		return true;
	
	}

	@Override
	public boolean remove(long id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c1 = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			Statement s1 = c1.createStatement();

			String Query = "DELETE FROM Employee_tbl where ID='2'";

			s1.execute(Query);

		} catch (Exception e) {

			return false;
		}
		return true;
	}

	@Override
	public boolean update(Employee emp, long id) {

		/*
		
		if(true) {
			
		}
		else {
			
			Employee e1 = new Employee();
		
			save(e1);
		}
		
		//else update the data
		
		 */
		return false;
	}

	@Override
	public List<Employee> getAll() {
		
		
		
		return null;
	}

	@Override
	public Employee getEmp(long id) {

		//fetch data of the id
		
		return null;
	}

}
