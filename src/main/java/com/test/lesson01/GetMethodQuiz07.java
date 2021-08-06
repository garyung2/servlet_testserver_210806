package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz07")
public class GetMethodQuiz07 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 response.setCharacterEncoding("UTF-8");
		 response.setContentType("text/html");
		 
		 String adress = request.getParameter("adress");
		 String card = request.getParameter("card");
		 String price = request.getParameter("price");
		 
		 PrintWriter out = response.getWriter();
		 
		 String delivery = "";
		 String bill = "";
		 
		 out.println("<html><head><title>주문결과</title></head><body>");
		 if(!adress.contains("서울시")) {
			 delivery = "배달 불가 지역입니다."; 
		 }else {
			 delivery = "배달 준비중"; 
		 }
		 
		 if(card.contains("신한카드")) {
			 bill = "결제 불가 카드 입니다."; 
		 }else {
			 bill = ""; 
		 }
		 //테이블로 출력
		 
		 out.print("<span>" + adress + "</span><strong>" + delivery + "</strong><br>");
		 out.print("<span>" + price + "원</span><strong>" + bill + "</strong");
		 out.print("</body></html>");
		  
	}
}
