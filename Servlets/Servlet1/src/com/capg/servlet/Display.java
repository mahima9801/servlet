package com.capg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showServlet")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int empid = (Integer) request.getAttribute("arg1");
		String empname = (String) request.getAttribute("arg2");
		double sal = (Double) request.getAttribute("arg3");
		String add = (String) request.getAttribute("arg4");
		int hno = (Integer) request.getAttribute("arg5");
		String area = (String) request.getAttribute("arg6");
		String city = (String) request.getAttribute("arg7");
		long pcode = (Long) request.getAttribute("arg8");
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.html");
		
		dispatcher.include(request, response);
		out.println("<p> Employee Id:"+empid+"</p>");
		out.println("<p>Employee Name:"+empname+"</p>");
		out.println("<p> Salary:"+sal+"</p>");
		out.println("<p> Address:"+add+"</p>");
		out.println("<p> House No.:"+hno+"</p>");
		out.println("<p> Area:"+area+"</p>");
		out.println("<p> City:"+city+"</p>");
		out.println("<p> Pincode:"+pcode+"</p>");
		out.close();

	}

}
