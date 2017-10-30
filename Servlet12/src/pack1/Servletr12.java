package pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jrockit.jfr.RequestDelegate;

import jdk.nashorn.internal.ir.ForNode;

public class Servletr12 extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		String name=req.getParameter("name");
		String password=req.getParameter("pass");
		
		// accessing init param data
		
		
		ServletConfig config=getServletConfig();
		String branch=config.getInitParameter("branch");
		
		
		//accessing context param data
		
		ServletContext contex=getServletContext();
		
		String driver=contex.getInitParameter("driverclass");
		String url=contex.getInitParameter("url");
		String username=contex.getInitParameter("username");
		String password1=contex.getInitParameter("password1");
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password1);
			Statement st=con.createStatement();
			
			PreparedStatement pr=con.prepareStatement("insert into Servlet values(?,?,?,?)");
			pr.setInt(1, 123);
			pr.setString(2, name);
			pr.setString(3, password);
		    pr.setString(4, branch);
		 int i=   pr.executeUpdate();
		 
		 System.out.println(i);
		 
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		req.getRequestDispatcher("/Servlet2").forward(req, res);
		
		
	}
		
	

}
