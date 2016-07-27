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

@WebServlet("/EditControls")
public class EditControls extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditControls() 
    {
        super();
    
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	try
	{
		PrintWriter out=response.getWriter();
		int reg=Integer.parseInt(request.getParameter("reg"));
		String schoolname=request.getParameter("schoolname");
		String city=request.getParameter("city");
		String board=request.getParameter("board");
		School s=new School(reg, schoolname, city, board);
		new SchoolDaoImpl().updateSchool(s);
		response.sendRedirect("adminHomepage.jsp");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
