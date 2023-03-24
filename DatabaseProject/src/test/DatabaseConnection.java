package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		// how to get url
		// Goto windows search and type services and goto MYSQL80 and stop the service
		// goto command prompt and type mysql -u root -p pwd root
		// u will be displayed with local host //localhost:3306/ then you need to add
		// the database u want to connect
		// same is provided i installation screenshot

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

		Statement stmt = con.createStatement();

		ResultSet result = stmt.executeQuery("select * from eproduct");

		while (result.next()) {
			//Id,name are column names
			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
		}

		con.close();
	}

}
