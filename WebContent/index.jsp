<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">Login</h2>
<form action="LoginController" method="post">
<table align="center">
<tr>
<td>username</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password">
</tr>
<tr>
<td>Role</td>
<td><select name="role">
	<option value="admin">Admin</option>
	<option value="school">School</option>
	<option value="teacher">Teacher</option>
	<option value="student">Student</option> 
	</select>
</td>
</tr>
<tr>
<td><input type="checkbox"name="remember" value="remember">Remember Me</input></td>
<td><input type="submit" value="LOGIN"/></td> 
</tr>
</table>
</form>
<a  href="registerPage.jsp">Register</a>
</body>
</html>