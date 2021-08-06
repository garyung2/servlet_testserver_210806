package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class PostMethodEx05 extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response.setContentType("text/html");
		 
		 PrintWriter out = response.getWriter();
		 String userId = request.getParameter("userId");
		 String name = request.getParameter("name");
		 String birth = request.getParameter("birth");
		 String email = request.getParameter("email");
		 
		 out.print("<html><head><title></title></head><body>" );
		 out.print("<table border=1>" );
		 out.print("<tr><td>아이디</td><td>" + userId + "</td><tr>" );
		 out.print("<tr><td>이름</td><td>" + name + "</td><tr>" );
		 out.print("<tr><td>생년월일</td><td>" + birth + "</td><tr>" );
		 out.print("<tr><td>이메일</td><td>" + email + "</td><tr>" );
		 out.print("</table><body></html>" );
         
		 System.out.println("#############시스템통과");
	}
}
