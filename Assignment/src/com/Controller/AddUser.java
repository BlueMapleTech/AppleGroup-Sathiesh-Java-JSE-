package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.User;
import com.Service.Service;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
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
		response.setContentType("text/html");
		User u1 = new User();
		
		u1.setUsername(request.getParameter("username"));
		u1.setPassword(request.getParameter("password"));
		u1.setEmail(request.getParameter("email"));
		u1.setFname(request.getParameter("fname"));
		u1.setLname(request.getParameter("lname"));
		u1.setSex(request.getParameter("sex"));
		u1.setAddress(request.getParameter("address"));
		u1.setCreatedby(request.getParameter("username"));
		u1.setUpdatedby(request.getParameter("username"));
		PrintWriter out = response.getWriter();
		Date d = new Date();
		String createddate = d.toString();
		u1.setCreateddate(createddate);
		String updateddate = d.toString();
		u1.setUpdateddate(updateddate);
		String role=request.getParameter("role");
	    int a=0;
		if(role.equals("admin"))
		{
			a=2;
		}
		else if(role.equals("user"))
		{
			a=1;
		}
		u1.setRoleid(a);
		Service s=new Service();
		s.Adduser(u1);
		RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
		rd.forward(request, response);
	
	}

}
