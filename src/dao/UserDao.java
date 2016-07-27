package dao;

import java.sql.SQLException;
import java.util.List;

import bean.User;

public interface UserDao 
{
	public List<User> getAllUser();
	public boolean validate(User u) throws SQLException;
	public void insertUser(User u) throws SQLException;
}
