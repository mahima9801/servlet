package com.capg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/saveData")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("id"));
		String empname = request.getParameter("name");
		double sal = Double.parseDouble(request.getParameter("sal"));
		String add = request.getParameter("address");
		int hno = Integer.parseInt(request.getParameter("hno"));
		String area = request.getParameter("area");
		String city = request.getParameter("city");
		long pcode = Long.parseLong(request.getParameter("pin"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("showServlet");
		
		request.setAttribute("arg1",empid);
		request.setAttribute("arg2",empname);
		request.setAttribute("arg3",sal);
		request.setAttribute("arg4",add);
		request.setAttribute("arg5",hno);
		request.setAttribute("arg6",area);
		request.setAttribute("arg7",city);
		request.setAttribute("arg8",pcode);
		
		dispatcher.forward(request, response);
	}

}
