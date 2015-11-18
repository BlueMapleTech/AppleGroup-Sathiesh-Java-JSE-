package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack.Data;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Admin() {
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
		String uname = request.getParameter("username");
		String upass = request.getParameter("password");
		int role = 2;
		Connection conn = null;
		Data d1 = new Data();
		try {
			conn = d1.getConnection();

			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("Select Username,Password,Role_Roleid from userdetail");
			while (rs.next()) {

				String user = rs.getString("Username");
				String pass = rs.getString("Password");
				int roles = rs.getInt("Role_Roleid");
				int a = 1;

				if (a ==1) {
					if (uname.equals(user) && upass.equals(pass)
							&& role == (roles)) {
						RequestDispatcher rd = request
								.getRequestDispatcher("Admin.jsp");
						rd.forward(request, response);
						
					}

				
				

					if (uname.equals(user) && upass.equals(pass)
							&& roles == (1)) {
						HttpSession session=request.getSession();
						session.setAttribute("uname", uname);
						RequestDispatcher rd = request
								.getRequestDispatcher("User.jsp");
						rd.forward(request, response);
						

					}
				 else {
					RequestDispatcher rd = request
							.getRequestDispatcher("Login.html");
					rd.include(request, response);
					
				}
			
				}}
			conn.close();
				} 
				catch (Exception e) {
			System.out.println(e);
		}
	}}


