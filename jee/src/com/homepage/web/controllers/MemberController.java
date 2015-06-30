package com.homepage.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet({"/model2/join.do", "/model2/login.do",
	"/member/searchIdForm.do","/member/searchPassForm.do",
	"/member/searchAllMember.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean bean = new MemberBean();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		switch (request.getServletPath()) {
		case "/member/searchIdForm.do" :
			RequestDispatcher dispatcher3 = request.getRequestDispatcher("/views/model2/searchIdForm.jsp");
			dispatcher3.forward(request, response);
			break;
		case "/member/searchPassForm.do":
			RequestDispatcher dispatcher4 =request.getRequestDispatcher("/views/model2/searchPassForm.jsp");
			dispatcher4.forward(request, response);
			break;
		case "/member/searchAllMember.do":
			List<MemberBean> list = new ArrayList<MemberBean>();
			list = service.getList();
			request.setAttribute("memberlist", list);
			RequestDispatcher dispatcher5 =request.getRequestDispatcher("/views/model2/memberList.jsp");
			dispatcher5.forward(request, response);
			break;
		default:
			break;
		}
    }
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
		String email = request.getParameter("address");
		bean.setId(id);
		bean.setPassword(password);
		bean.setAge(age);
		bean.setAddr(email);
		bean.setName(name);
		int result = service.join(bean);
		String joinMsg = "";
		if(result!=0){
			joinMsg = name + " 님 환영합니다.";
		}else{
			joinMsg = "회원가입에 실패했습니다.";
		}
		request.setAttribute("msg", joinMsg);
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("/views/model2/main.jsp");
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
		
		break;
		}
		
		default:
			break;
		}
	}
}
