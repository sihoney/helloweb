package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")  // 주소
public class HelloServlet extends HttpServlet {
	///////////////////////
	// field
	///////////////////////

       
	
	///////////////////////
	// constructor
	///////////////////////


    
	///////////////////////
	// method
	///////////////////////
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
	      out.println("<!DOCTYPE html>");
	      out.println("<html>");
	      out.println("   <head>");
	      out.println("      <meta charset='UTF-8'>");
	      out.println("      <title>Insert title here</title>");
	      out.println("   </head>");
	      out.println("   <body>");
	      out.println("      <h1>servlet: helloworld!!!! 안녕 servlet!!!!!</h1>");
	      out.println("   </body>");
	      out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
