<%@page import="dao.SchoolDaoImpl"%>
<%@page import="bean.School"%>
<%@page import="dao.SchoolDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String reg=request.getParameter("reg");
	SchoolDao sdao=new SchoolDaoImpl();
	School sc=sdao.getSchoolByReg(Integer.parseInt(reg));
%>
<form action="EditControls" method="post">
<input type="hidden" name="reg" value="<%= sc.getReg()%>">
<table>
<tr>
<td>School Name</td>
<td><input type="text" name="schoolname" value="<%= sc.getSchoolname()%>"></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city" value="<%= sc.getCity()%>"></td>
</tr>
<tr>
<td>Board</td>
<td><input type="text" name="board" value="<%= sc.getBoard()%>"></td>
</tr>
<tr><input type="submit" value="Update School"></tr>
</table>
</form>
</body>
</html>