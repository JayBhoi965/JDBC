package preepairedStatement;

import java.sql.*;

public class mainn {

	public static void main(String[] args) {
		
		final String URL = "jdbc:mysql://localhost:3306/employee_db";
		final String USERNAME = "root";
		final String PASSWORD = "Jaybhoi1229T";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c1 = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			/*
			
			PreparedStatement s1 = c1.prepareStatement("SELECT * FROM Employee_tbl");
			s1.setInt(1, 4);
			s1.setString(2,"Maya");
			s1.setString(3,"Nr. Swaminarayan Mandir");
			s1.setString(4,"Female");
			s1.setInt(5, 20);
			s1.setString(6, "8564258");
			s1.setString(7, "asd@asd.com");		
			s1.execute()̰;	
			
			*/
			
			PreparedStatement s1 = c1.prepareStatement("INSERT INTO Employee_tbl VALUES (?, ?, ?, ?, ?, ?, ?)");

			s1.setInt(1, 6);
			s1.setString(2, "Maya");
			s1.setString(3, "Nr. Swaminarayan Mandir");
			s1.setString(4, "Female");
			s1.setInt(5, 20);
			s1.setString(6, "8564258");
			s1.setString(7, "asd@asd.com");

			s1.executeUpdate();
			System.out.println("row(s) inserted.");
			
			/* Update Data :-
			
			PreparedStatement s2 = c1.prepareStatement("UPDATE Employee_tbl SET id = 65 WHERE ID=2");			
			s2.executeUpdate();			
			
			*/
			
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}

}
