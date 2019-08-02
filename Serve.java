package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Serve extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter p= res.getWriter();
		p.println("welcome");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter p= res.getWriter();
		String username=req.getParameter("user");
		String password=req.getParameter("pass");
		if(username.equals("admin")&&password.equals("admin"))
		{
			p.println("welcome "+username);
		}
		else
		{
			p.println("invalid");
		}
		
	}
}
