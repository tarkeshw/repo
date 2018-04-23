package com.servlet.myfirst;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myfirstservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		out.println("<html>"
				+"<body>"
				+"<title>mypage</title>"
				+"<h1>welcome</h1>"
				+"</body>"
				+"</html>");
	}



}
