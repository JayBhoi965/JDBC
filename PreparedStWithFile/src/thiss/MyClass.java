package thiss;
import java.sql.*;

public class MyClass{

	public static void main() {
		
		final String URL = "jdbc:mysql://localhost:3306/employee_db";
		final String USERNAME = "root";
		final String PASSWORD = "Jaybhoi1229T";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection c1 = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			try {
				
				PreparedStatement p1 = c1.prepareStatement("INSERT INTO Employee_tbl() VALUES (?,?,?,?,?,?,?)");
				
				p1.setInt(1, 58);				
				p1.setString(2, "Jay");				
				p1.setString(3, "ADDRESS");				
				p1.setString(4, "Male");				
				p1.setString(5, "19");				
				p1.setString(6, "23232312");				
				p1.setString(7, "abc@asd.com");				
				
				
				p1.execute();
				
			}catch(Exception e2) {
				
				e2.printStackTrace();
			}
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		
	}

}
