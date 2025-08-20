import java.io.*;
import java.sql.*;

public class MyClass {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/EmployeeDB";
		final String USERNAME = "root";
		final String PASSWORD = "123456789JAY";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c1 = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			PreparedStatement p1 = c1.prepareStatement("INSERT INTO employeeTBL(id,name) VALUES (?,?)");

			FileReader f1 = new FileReader("/Users/jay/Desktop/Java/Prepared_ST_File/src/large_random_ids_names.txt");

			BufferedReader bf1 = new BufferedReader(f1);

			String data = "";

			try {

				while ((data = bf1.readLine()) != null) {

					String msg[] = data.split(",");

					p1.setString(1, msg[0]);
					p1.setString(2, msg[1]);
					p1.addBatch();
					
				}
			} catch (Exception e2) {

				e2.printStackTrace();
			}
			
			p1.executeBatch();
			System.out.println("Data Inserted Succesfully!");

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}