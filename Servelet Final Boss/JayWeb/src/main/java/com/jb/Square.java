package com.jb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {

	//req-dispatcher

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
	
	public void doGet(HttpServletRequest rq1, HttpServletResponse rp1) throws IOException {

	 
		PrintWriter pw1 = rp1.getWriter();

		pw1.println("The K = " + 16);

	}
}
