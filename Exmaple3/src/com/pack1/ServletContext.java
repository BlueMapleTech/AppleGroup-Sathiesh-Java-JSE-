package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack1.ServletContext;

/**
 * Servlet implementation class ServletContext
 */
public class ServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext con=(ServletContext) getServletContext();
		String uname=con.getInitParameter("user");
		String upass=con.getInitParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("username");
		String p=request.getParameter("userpass");
		
		if((n.equals(uname))&&(p.equals(upass)))
		{
			//response.sendRedirect("www.beginnerbook.com");
			//RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			//rd.forward(request, response);
			out.println("login");
			
		}
		else{
			out.println("invalid login");
			//RequestDispatcher rd=request.getRequestDispatcher("Index.html");
			//rd.include(request, response);
			
		}
	}

}
