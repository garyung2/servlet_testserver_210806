package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Text;

@WebServlet("/servlet/quiz08")
public class GetMethodQuiz08 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response.setCharacterEncoding("UTF-8");
		 response.setContentType("text/html");
		 
		 String search = request.getParameter("search");
		 
		 PrintWriter out = response.getWriter();
		 
		 List<String> list = new ArrayList<>(Arrays.asList(
			        "강남역 최고 맛집 소개 합니다.", 
			        "오늘 기분 좋은 일이 있었네요.", 
			        "역시 맛집 데이트가 제일 좋네요.", 
			        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
			        "자축 저 오늘 생일 이에요."));
		 
		 out.println("<html><head><title>검색</title></head><body>");
		 
//		 for(int i = 0; i < list.size(); i++ ) {
//			 if(list.get(i).contains(search)) {
//				 out.print("<span>" + list.get(i) + "</span>");	  
//			 } 
//		 }
		 
//		 for(String text : list) {
//		   //검색
//		   if(text.contains(search)) {
//			   out.print("<span>" + text + "</span><br>");	  
//		   }
//		 }
		 for(String text : list) {
			 
		
		   //int index = text.indexOf(search);
		   
//			  if(index > -1) {
//				StringBuffer sb  = new StringBuffer();
//				sb.append(text);
//				sb.insert(index , "<b>");
//				sb.insert(index + 3 + search.length(), "</b>");
//				out.print(sb + "<br>");
//			  } 
		   
		      String[] words = text.split(search);
		      if(text.contains(search)) {
		        out.print(words[0] + "<b>" + search + "</b>" + words[1] + "<br>");	  
		      }
		   
//		      if(text.contains(search)) {
//		    	  text.replace(search, "<b>" + search + "</b>");
//		    	  out.print("<br>");
//		      }
		 
		 
		 }
		
		 out.print("</body></html>");
	}
}
