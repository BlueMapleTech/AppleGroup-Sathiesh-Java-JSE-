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
import javax.servlet.http.HttpSession;

import com.Model.User;
import com.Service.Service;

/**
 * Servlet implementation class Userprocess
 */
@WebServlet("/Userprocess")
public class Userprocess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Userprocess() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		User u = new User();
		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("uname");
		u.setUsername(uname);
		Service s = new Service();
		s.delete(u);
		// out.println("deleted success");
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		User u = new User();
		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("uname");
		u.setUsername(uname);
		u.setPassword(request.getParameter("password"));
		// u.setEmail(request.getParameter("email"));
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setSex(request.getParameter("sex"));
		u.setAddress(request.getParameter("address"));
		u.setCreatedby(request.getParameter("username"));
		u.setUpdatedby(request.getParameter("username"));
		Date d = new Date();
		String createddate = d.toString();
		u.setCreateddate(createddate);
		String updateddate = d.toString();
		u.setUpdateddate(updateddate);
		Service s = new Service();
		s.update(u);
		out.println("Changes is Updated Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("User.jsp");
		rd.forward(request, response);
	}

}
