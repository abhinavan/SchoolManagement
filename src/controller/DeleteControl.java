package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.School;
import dao.SchoolDaoImpl;

@WebServlet("/DeleteControl")
public class DeleteControl extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public DeleteControl() 
    {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	try
	{
		PrintWriter out=response.getWriter();
		int reg=Integer.parseInt(request.getParameter("reg"));
		School s=new School(reg);
		new SchoolDaoImpl().deleteSchool(s);
		response.sendRedirect("adminHomepage.jsp");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
