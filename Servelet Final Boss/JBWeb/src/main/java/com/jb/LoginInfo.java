package com.jb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInfo extends HttpServlet {

	public void doPost(HttpServletRequest rq1, HttpServletResponse rp1) throws IOException {

		String UserName = rq1.getParameter("username");
		String PassWord = rq1.getParameter("password");

		PrintWriter pw1 = rp1.getWriter();

		Cookie c1 = new Cookie("UserName", UserName);
		Cookie c2 = new Cookie("Password", PassWord);

		rp1.addCookie(c1);
		rp1.addCookie(c2);

		/*
		 * ServletContext ctx1 = rq1.getServletContext();
		 * 
		 * String namee = ctx1.getInitParameter("name"); String phonee =
		 * ctx1.getInitParameter("phone");
		 * 
		 * pw1.println("Hello "+namee+" you have a "+phonee+" phone right?");
		 * 
		 */

		ServletConfig cf1 = getServletConfig();
		String name = cf1.getInitParameter("name_config");  //we first need to create a fully flegid object as both
															// ServletContext and ServletConfig are interfaces, then we
															// can implement their getInitParameter() method to fetch
															// the data from web.xml (deployment Descriptor)

		pw1.println("Hello " + name + " How are you doing?");

		pw1.println("Welcome " + UserName);

	}

}
