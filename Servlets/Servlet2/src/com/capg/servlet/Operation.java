package com.capg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Operations")
public class Operation extends GenericServlet implements 

Servlet {
	private static final long serialVersionUID = 1L;
       
   
	public void init(ServletConfig config) throws ServletException {

	}
	protected void doPost(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		int op1=Integer.parseInt(request.getParameter("op1"));
		int op2=Integer.parseInt(request.getParameter("op2"));
	
		int sum = op1+op2;
		int sub = op1-op2;
		int mul = op1*op2;
	
		response.setContentType("text/html");
	
		PrintWriter out = response.getWriter();
	
		out.println("<html><body>");
		out.println("<P>Addtion is:"+sum+"</p>");
		out.println("<P>Subtraction is:"+sub+"</p>");
		out.println("<P>Multiplication is:"+mul+"</p>");
		out.println("</body></html>");
			
		out.close();
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
