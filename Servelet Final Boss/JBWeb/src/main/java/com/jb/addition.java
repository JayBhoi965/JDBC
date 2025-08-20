package com.jb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addition extends HttpServlet {

	/*
	 * public void service(HttpServletRequest rq, HttpServletResponse rp) throws
	 * IOException {
	 * 
	 * int i = Integer.parseInt(rq.getParameter("nm1")); int j =
	 * Integer.parseInt(rq.getParameter("nm2"));
	 * 
	 * int k = i + j;
	 * 
	 * 
	 * PrintWriter out = rp.getWriter(); out.print("The Addition of " + i + " and "
	 * + j + " is : " + k); }
	 */

// Request Dispatcher
	/*
	 * 
	 * public void doPost(HttpServletRequest rq, HttpServletResponse rp) throws
	 * IOException, ServletException {
	 * 
	 * int i = Integer.parseInt(rq.getParameter("nm1")); int j =
	 * Integer.parseInt(rq.getParameter("nm2"));
	 * 
	 * int k = i + j;
	 * 
	 * rq.setAttribute("i", i); rq.setAttribute("j",j); rq.setAttribute("k",k);
	 * 
	 * RequestDispatcher rd1 = rq.getRequestDispatcher("sqr"); //for web.xml
	 * 
	 * rd1.forward(rq, rp);
	 * 
	 * }
	 */

	// Send-Redirect

	/*
	 * public void doGet(HttpServletRequest rq, HttpServletResponse rp) throws
	 * IOException, ServletException {
	 * 
	 * int i = Integer.parseInt(rq.getParameter("nm1")); int j =
	 * Integer.parseInt(rq.getParameter("nm2"));
	 * 
	 * int k = i + j;
	 * 
	 * rp.sendRedirect("sqr?k=18");
	 * 
	 * }
	 */

	// Session

	/*
	 * 
	 * public void doGet(HttpServletRequest rq, HttpServletResponse rp) throws
	 * IOException, ServletException {
	 * 
	 * int i = Integer.parseInt(rq.getParameter("nm1")); int j =
	 * Integer.parseInt(rq.getParameter("nm2"));
	 * 
	 * int k = i + j;
	 * 
	 * HttpSession s1 = rq.getSession();
	 * 
	 * s1.setAttribute("k", k);
	 * 
	 * rp.sendRedirect("sqr");
	 * 
	 * }
	 */

	// Cookie

	/*
	 * public void doGet(HttpServletRequest rq, HttpServletResponse rp) throws
	 * IOException, ServletException {
	 * 
	 * int i = Integer.parseInt(rq.getParameter("nm1")); int j =
	 * Integer.parseInt(rq.getParameter("nm2"));
	 * 
	 * int k = i + j;
	 * 
	 * Cookie c1 = new Cookie("k", k + ""); // I've done k+"" because we've to pass
	 * the String only integer is not // Permitted
	 * 
	 * rp.addCookie(c1);
	 * 
	 * rp.sendRedirect("sqr");
	 * 
	 * }
	 */
	
	
	public void doGet(HttpServletRequest rq, HttpServletResponse rp) throws IOException, ServletException {

		int i = Integer.parseInt(rq.getParameter("nm1"));
		int j = Integer.parseInt(rq.getParameter("nm2"));

		int k = i + j;

		
		
		if (k == 10) {
			rp.sendRedirect("success.jsp");
		} 
		else {

			Cookie c1 = new Cookie("k", k + ""); // I've done k+"" because we've to pass the String only integer is not
													// Permitted

			rp.addCookie(c1);

			rp.sendRedirect("sqr");
		}

	}

}
