package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 * @param <Cookie>
 */
@WebServlet("/Login")
public class Login<Cookie> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("Link.html");
		rd.include(request, response);
		String n = request.getParameter("username");
		String p = request.getParameter("password");

		if (p.equals("123456")) {
			out.println(" welcome you were logged in successfully  ");
			out.println("welcome "+n);
			javax.servlet.http.Cookie ck=(javax.servlet.http.Cookie) new javax.servlet.http.Cookie("name",n);
		    response.addCookie(ck);
		} else {
			out.println("Invalid Login");
			RequestDispatcher r = request.getRequestDispatcher("Login.html");
			r.include(request, response);
		}
	}

}
