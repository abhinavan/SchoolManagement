package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.User;
import connection.MyConnection;

public class UserDaoImpl implements UserDao
{

	Connection con;
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validate(User u) throws SQLException
	{
		MyConnection connection=new MyConnection();
		con=connection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from server where username=? and password=?");
		ps.setString(1,u.getUsername());
		ps.setString(2,u.getPassword());
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			if(rs.getString("role").equals(u.getRole()))
			{
				
				return true;
			}
			
		}
		else
		{
			return false;
		}
		return false;
	}

	@Override
	public void insertUser(User u) throws SQLException 
	{
		con=new MyConnection().getConnection();
		PreparedStatement ps=con.prepareStatement("insert into server values(?,?,?,?)");
		ps.setInt(1,u.getId());
		ps.setString(2,u.getUsername());
		ps.setString(3,u.getPassword());
		ps.setString(4,u.getRole());
		ps.executeUpdate();
		System.out.println("inserted");
	}
	

}
