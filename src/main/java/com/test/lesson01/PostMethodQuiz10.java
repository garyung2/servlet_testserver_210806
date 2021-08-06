package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz10")
public class PostMethodQuiz10 extends HttpServlet {
    
	private final HashMap<String,String> userMap =  new HashMap<String, String>() {
	    {
	    	put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response.setContentType("text/html");
		 
		 PrintWriter out = response.getWriter();
		 String userId = request.getParameter("userId");
		 String pwd = request.getParameter("pwd");
		 
		 out.print("<html><head><title>사용자 정보 확인</title></head><body>");
		 
		 if(!userMap.get("id").equals(userId)) {
		   out.print("<p>id가 일치하지 않습니다.</p>");
		 }else if(!userMap.get("password").equals(pwd)) {
		   out.print("<p>password가 일치하지 않습니다.</p>"); 
		 }else {
		   out.print("<p>" + userMap.get("name") + "님 환영합니다!</p>");  
		 }
		 
		 out.print("<body></html>" );
         
	}
}
