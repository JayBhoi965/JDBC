package Tasks_pkg;

import java.util.*;

import java.sql.*;

import Employeedata.Employee;

public class TaskCls implements tasks_intf {
	
	Scanner s1 = new Scanner(System.in);
	final String USERNAME = "root";
	final String PASSWORD = "Jaybhoi1229T";
	final String URL = "mysql:jdbc://localhost:3306/employee_db";

	@Override
	public boolean save(Employee emp) {
		
		String name;
		
		System.out.println("Enter your Name : ");
		name = s1.nextLine();
		
		
		String Address;
		
		System.out.println("Enter your Name : ");
		Address = s1.nextLine();
		
		
		int age;
		
		System.out.println("Enter your Name : ");
		age = s1.nextInt();
		
		
		String gender;
		
		System.out.println("Enter your Name : ");
		gender = s1.nextLine();
		
		
		long mobile;
		
		System.out.println("Enter your Name : ");
		mobile= s1.nextLong();
		
		
		String mail;
		
		System.out.println("Enter your Name : ");
		mail = s1.nextLine();
		
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
			
			String Query = "INSERT INTO Employee_tbl(Name,Address,Gender,Age,Mobile,E-mail) VALUES("+emp.getName()+","+emp.getAddress()+","+emp.getGender()+","+emp.getAge()+","+emp.getMobile()+","+emp.getMail()+")";// Query of adding above data
	
			statement.execute(Query);
			
		}
		catch(Exception ee) {
			ee.printStackTrace();
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
		
		//if id is not present then add new column
		//else update the data
		
		return false;
	}

	@Override
	public List<Employee> getAll() {
		
		//get data and print'em by while... loop
		
		return null;
	}

	@Override
	public Employee getEmp(long id) {

		//fetch data of the id
		
		return null;
	}

}
