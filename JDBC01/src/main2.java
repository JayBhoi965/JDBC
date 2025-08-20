import java.sql.*;

public class main2 {
	public static void main(String args[]) {
		final String URL = "jdbc:mysql://localhost:3306/sys";
		final String USERNAME = "root";
		final String PASSWORD = "Jaybhoi1229T";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			java.sql.Statement statement = connection.createStatement();

			String Query = "SELECT * FROM Student_TBL";

			ResultSet rs = statement.executeQuery(Query);

			while (rs.next()) {

				System.out.print(rs.getInt(1));
				System.out.print("    ");
				System.out.print(rs.getString(2));
				System.out.print("    ");
				System.out.print(rs.getString(3));
				System.out.print("    ");
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
