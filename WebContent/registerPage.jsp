<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Register Page</h2>
<form action="RegisterController"  method="post">
<table>
<tr>
<td>Enter id</td>
<td><input type="number" name="id"></td>
</tr>
<tr>
<td>Enter name</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Enter password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>Select Role</td>
<td><select name="role">
	<option value="school">School</option>
	<option value="teacher">Teacher</option>
	<option value="student">Student</option>
	</select>
</td>
</tr>
<tr>
<td><input type="reset" value="Reset"></td>
<td><input type="submit" value="Register"></td>
</tr>
</table>
</form>
</body>
</html>