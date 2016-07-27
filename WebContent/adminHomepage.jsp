<%@page import="dao.SchoolDao"%>
<%@page import="dao.SchoolDaoImpl"%>
<%@page import="bean.School"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">ADMIN DASHBOARD</h2>
<%
	Cookie ck[]=request.getCookies();
	for(int i=0;i<ck.length;i++)
	{
		if(ck[i].getName().equals("username"))
		{
			out.println("welcome  "+ck[i].getValue());
		}

	}
	SchoolDao sdao=new SchoolDaoImpl();
	School sc=new School();
	List<School> list=sdao.getAllSchool();
	request.setAttribute("list",list);
%>
<p>
<table align="center">
<thead>
<tr><center>List of Schools</center></tr>
<tr>
<th>School RegNo</th>
<th>School Name</th>
<th>City</th>
<th>Board</th>
</tr>
</thead>
<c:forEach items="${list}" var="u">
<tr>
<td>${u.getReg() }</td>
<td>${u.getSchoolname() }</td>
<td>${u.getCity() }</td>
<td>${u.getBoard()}</td>
<td><a href="EditSchool.jsp?reg=${u.getReg()}">Edit</a></td>
<td><a href="DeleteControl?reg=${u.getReg() }">Delete</a></td>
</tr>
</c:forEach>
<tbody>

</tbody>
</table>
</p>
<form action="AdminController" method="post">
<table>
<tr>
<td>School registration number</td>
<td><input type="number" name="reg"></td>
</tr>
<tr>
<td>School Name</td>
<td><input type="text" name="schoolname"></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city"></td>
</tr>
<tr>
<td>Board</td>
<td><input type="text" name="board"></td>
</tr>
</table>
<input type="submit" value="ADD NEW SCHOOL"/>
</form>
</body>
</html>