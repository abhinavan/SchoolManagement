package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDaoImpl;


@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterController() 
    {
        super();
    
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	try 
	{
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String role=request.getParameter("role");
		User u=new User(id,username, password, role);
		new UserDaoImpl().insertUser(u);
		response.sendRedirect("index.jsp");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
