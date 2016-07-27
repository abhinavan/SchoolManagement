package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class MyConnection 

{
	private Connection con;
	public MyConnection()
	{
		try 
		{
			ResourceBundle rb=ResourceBundle.getBundle("resource");
			Class.forName(rb.getString("driverClass"));
			con=DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
			
		}
		catch(Exception e)
		{
			
		}
		
		
	}
	public Connection getConnection()
	{
		MyConnection connection=new MyConnection();
		System.out.println(con);
		return connection.con;
	}
	

}
