package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceimpls.KaupImpl;
import com.homepage.web.services.KaupService;

/**
 * @ Date : semeday;
 * @ Author : ;
 * @ Story : 키와 몸무게가 입력되면 카우푸 지수와 메시지를 웹브라우저에 랜더링 하는 역할;
 */
@WebServlet("/kaup.do")
public class KaupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		KaupService kaup = new KaupImpl();
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		kaup.getKaupIndex(height1, weight1);
		String msg = kaup.getResultMsg();
		request.setAttribute("msg", msg);
		request.setAttribute("height", height);
		request.setAttribute("weight", weight);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/Kaup.jsp");
		dispatcher.forward(request, response);
		
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("");
		
	}
}
