package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import connection.MyConnection;

public class SchoolDaoImpl implements SchoolDao
{

	Connection con;
	
	@Override
	public void insertSchool(School s) throws SQLException
	{
		
		con=new MyConnection().getConnection();
		PreparedStatement ps=con.prepareStatement("insert into school values(?,?,?,?)");
		ps.setInt(1,s.getReg());
		ps.setString(2,s.getSchoolname());
		ps.setString(3,s.getCity());
		ps.setString(4,s.getBoard());
		 int i=	ps.executeUpdate();
		//con.close();
		System.out.println("insert succesfully");
		
	}

	@Override
	public List<School> getAllSchool() throws SQLException 
	{
		con=new MyConnection().getConnection();
		PreparedStatement ps=con.prepareStatement("select * from school");
		ResultSet rs=ps.executeQuery();
		List<School> list=new ArrayList<>();
		while(rs.next())
		{
			School s=new School();
			s.setReg(rs.getInt("reg"));
			s.setSchoolname(rs.getString("schoolname"));
			s.setCity(rs.getString("city"));
			s.setBoard(rs.getString("board"));
			list.add(s);
		}
				
		return list;
	}

	@Override
	public School getSchoolByReg(int reg) throws SQLException
	{
		School s=null;
		con=new MyConnection().getConnection();
		PreparedStatement ps=con.prepareStatement("select * from school where reg=?");
		ps.setInt(1,reg);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			s=new School();
			s.setReg(rs.getInt("reg"));
			s.setSchoolname(rs.getString("schoolname"));
			s.setCity(rs.getString("city"));
			s.setBoard(rs.getString("board"));
		}
		return s;
	}

	@Override
	public void updateSchool(School s) throws SQLException
	{
		con=new MyConnection().getConnection();
		String query="update school set reg=?,schoolname=?,city=?,board=? where reg=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,s.getReg());
		ps.setString(2,s.getSchoolname());
		ps.setString(3,s.getCity());
		ps.setString(4,s.getBoard());
		ps.setInt(5,s.getReg());
		ps.executeUpdate();
		System.out.println("updated");
	}

	@Override
	public void deleteSchool(School s) throws SQLException 
	{
		con=new MyConnection().getConnection();
		PreparedStatement ps=con.prepareStatement("delete from school where reg=?");
		ps.setInt(1,s.getReg());
		ps.executeUpdate();
		System.out.println("deleted");
	}
	

}
