package setsuna9013.withtheheart.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector{

	public Connection getConnection(){
		String driverName = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://localhost/with_the_heart";

		String user = "root";

		String pass = "mysql";

		Connection con = null;
		try
		{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,pass);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
