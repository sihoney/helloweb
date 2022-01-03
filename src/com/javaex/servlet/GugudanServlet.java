package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Gugudan") // 주소 (변경 가능)
public class GugudanServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 코드 작성 부분
		response.setContentType("text/html;charset=utf-8");
		
		// 파라미터 값 꺼내기
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		PrintWriter out = response.getWriter();
		
	    out.println("<table border='1'>");
	    
	    for(int i = 1; i <= 9; i++) {
		    out.println("	<tr>");
		    out.println("		<td>" + dan + "</td>");
		    out.println("		<td>" + i + "</td>");
		    out.println("		<td>" + dan * i + "</td>");
		    out.println("	</tr>");
	    }
	    
	    out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
