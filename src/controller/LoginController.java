package controller;

import java.io.IOException;
import java.net.HttpCookie;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDao;
import dao.UserDaoImpl;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() 
    {
        super();
    
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String username=request.getParameter("username");
		
		String password=request.getParameter("password");
		String role=request.getParameter("role");
		String check=request.getParameter("remember");
		//System.out.println(check);
		User user=new User(username,password,role);
		
		UserDao dao=new UserDaoImpl();
		try {
				boolean status=dao.validate(user);
				if(status==true)
				{
					if(check!=null)
					{
						Cookie ck=new Cookie("username",username);
						response.addCookie(ck);
						if(role.equals("admin"))
						{
							response.sendRedirect("adminHomepage.jsp");
						}
						else if (role.equals("school"))
						{
							response.sendRedirect("schoolHomepage.jsp");
						}
						else if (role.equals("teacher"))
						{	
							response.sendRedirect("teacherHomepage.jsp");
							
						}
						else
						{
							response.sendRedirect("studentHomepage.jsp");
						}
						
					}
					else
					{
						
						if(role.equals("admin"))
						{
							response.sendRedirect("adminHomepage.jsp");
						}
						else if (role.equals("school"))
						{
							response.sendRedirect("schoolHomepage.jsp");
						}
						else if (role.equals("teacher"))
						{	
							response.sendRedirect("teacherHomepage.jsp");
							
						}
						else
						{
							response.sendRedirect("studentHomepage.jsp");
						}
					}
					
										
				}
				else
				{
					System.out.println(user.getUsername());
					
				}
				
			}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}

}
