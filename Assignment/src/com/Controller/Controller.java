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
import com.UserDao.UserDao;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int a = 0;
		/*PrintWriter out=response.getWriter();
		User u = new User();
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		Service s = new Service();
		int a=s.Login(u);
		if(a==2)
		{
			out.print("login sucess");
		
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
			rd.forward(request, response);
		}
		else
		{
			if(a==1){
			//out.print("unsucess");
			RequestDispatcher rd = request.getRequestDispatcher("User.jsp");
			rd.forward(request, response);
		}}
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		User u = new User();
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		u.setEmail(request.getParameter("email"));
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setSex(request.getParameter("sex"));
		u.setAddress(request.getParameter("address"));
		u.setCreatedby(request.getParameter("username"));
		u.setUpdatedby(request.getParameter("username"));
		PrintWriter out = response.getWriter();
		Date d = new Date();
		String createddate = d.toString();
		u.setCreateddate(createddate);
		String updateddate = d.toString();
		u.setUpdateddate(updateddate);
		int roleid =1	;
		u.setRoleid(roleid);
		 Service s=new Service();
		 s.signup(u);
		// UserDao ua=new UserDao();
		// ((UserDao) ua).register(u);
		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
	}

}
