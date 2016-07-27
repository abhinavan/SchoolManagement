package dao;

import java.sql.SQLException;
import java.util.List;

import bean.School;

public interface SchoolDao
{
	public void insertSchool(School s) throws SQLException;
	public List<School> getAllSchool() throws SQLException;
	public School getSchoolByReg(int reg) throws SQLException;
	public void updateSchool(School s) throws SQLException;
	public void deleteSchool(School s) throws SQLException;
}
