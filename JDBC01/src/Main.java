import java.sql.*;

public class Main {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/sys";
		final String USERNAME = "root";
		final String PASSWORD = "Jaybhoi1229T";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection myConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			java.sql.Statement myStatement = myConnection.createStatement();

			String query = "INSERT INTO Student_TBL(Name,Phone,Enrollment) VALUES('Maya Patel','9988556644','1122558866')";

			myStatement.execute(query);

			System.out.println("Record Saved...");

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

	}

}
