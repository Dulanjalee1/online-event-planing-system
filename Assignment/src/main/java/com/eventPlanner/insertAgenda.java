package com.eventPlanner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertAgenda")
public class insertAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Clientname = request.getParameter("name");
		String Venue = request.getParameter("Venue");
		String Budget = request.getParameter("Budget");
		String Date = request.getParameter("Date");
		
		boolean isTrue;
		
		isTrue = eventplannerDBUtil.insertAgenda(Clientname, Venue, Budget, Date);
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);
		}
		else
		{
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request,response);
			
		}
	}

}
