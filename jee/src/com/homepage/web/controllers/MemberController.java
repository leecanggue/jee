package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.serviceimpls.MemberServiceImpl;
import com.homepage.web.services.MemberService;

/**
 * @ Date : someday;
 * @ Author : ;
 * @ Story : 회원가입과 로그인 담당하는 컨트롤러
 */
@WebServlet({"/model2/join.do", "/model2/login.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService service = new MemberServiceImpl();
	MemberBean bean = new MemberBean();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println(request.getServletPath());
		switch(request.getServletPath()){
		case "/model2/join.do":
			System.out.println("2");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		bean.setId(id);
		bean.setPassword(password);
		bean.setAge(Integer.parseInt(age));
		bean.setAddr(address);
		bean.setName(name);
		
		int ageI = Integer.parseInt(age);
		service.join(id, password, name, ageI, address);
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("/views/model2/memberForm.jsp");
		dispatcher1.forward(request, response);
		break;
		case "/model2/login.do":
		if(bean.getId().equals(request.getParameter("id"))&&bean.getPassword().equals(request.getParameter("password"))){
			
			request.setAttribute("name", bean.getName());
			request.setAttribute("id", bean.getId());
			request.setAttribute("age", bean.getAge());
			request.setAttribute("address", bean.getAddr());
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/member.jsp");
			dispatcher.forward(request, response);
			
			
		}
		else if(!(bean.getId().equals(request.getParameter("id"))&&bean.getId().equals(request.getParameter("password")))){
			System.out.println("1");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/loginFail.jsp");
			dispatcher.forward(request, response);
		}
		break;
		default:
			break;
		}
	}
}
