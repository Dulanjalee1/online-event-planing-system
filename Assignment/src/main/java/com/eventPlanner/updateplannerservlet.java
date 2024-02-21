package com.eventPlanner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateplannerservlet")
public class updateplannerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("pid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		isTrue = eventplannerDBUtil.updateplanner(id,name,email,username,password);
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccess.jsp" );
			dis1.forward(request, response);
		}
	}

	}


