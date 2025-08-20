package com.jb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet {

	// req-dispatcher

	/*
	 * public void doPost(HttpServletRequest rq1, HttpServletResponse rp1) throws
	 * IOException {
	 * 
	 * int i = (int) rq1.getAttribute("i"); int j = (int) rq1.getAttribute("j"); int
	 * k = (int) rq1.getAttribute("k");
	 * 
	 * k = k*k;
	 * 
	 * PrintWriter pw1 = rp1.getWriter();
	 * 
	 * pw1.println("The ("+i+"+"+j+")^2 = "+k);
	 * 
	 * }
	 */

	// sendRedirect

	/*
	 * 
	 * public void doGet(HttpServletRequest rq1, HttpServletResponse rp1) throws
	 * IOException {
	 * 
	 * int k = Integer.parseInt(rq1.getParameter("k"));
	 * 
	 * k = k*k;
	 * 
	 * PrintWriter pw1 = rp1.getWriter();
	 * 
	 * pw1.println("The K = " + k);
	 * 
	 * }
	 * 
	 */

	// HttpSession

	/*
	 * 
	 * public void doGet(HttpServletRequest rq1, HttpServletResponse rp1) throws
	 * IOException {
	 * 
	 * HttpSession s1 = rq1.getSession();
	 * 
	 * int k = (int) s1.getAttribute("k");
	 * 
	 * k = k*k;
	 * 
	 * PrintWriter out = rp1.getWriter();
	 * 
	 * out.println("The Value of K : "+k);
	 * 
	 * 
	 * 
	 * }
	 */

	// Cookies

	public void doGet(HttpServletRequest rq1, HttpServletResponse rp1) throws IOException {

		int k = 0;
		Cookie c1[] = rq1.getCookies();
		for (Cookie temp : c1) {

			if (temp.getName().equals("k")) {
				k = Integer.parseInt(temp.getValue());
			}
		}

		k = k * k;

		PrintWriter out = rp1.getWriter();

		out.println("The Value of K : " + k);

	}

}
