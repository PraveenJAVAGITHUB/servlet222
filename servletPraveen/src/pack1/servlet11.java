package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet11 extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException	
	{
		
		
			String name=req.getParameter("name");
			String password=req.getParameter("pass");
			System.out.println("entered ");
			req.getRequestDispatcher("error.jsp").forward(req, res);
		
		
	}
}
