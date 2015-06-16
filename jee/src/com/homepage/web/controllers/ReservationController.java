package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceimpls.ReservationServiceImpl;
import com.homepage.web.services.ReservationService;
/*
@Date : someday;
@Author : itbank;
@Stroy : 예약 요청을 JSP에서 받아서 처리하는 컨트롤러 


*/@WebServlet({"/reservation/inputCheck.do","/reservation/checkIn.do","/reservation/checkOut.do"
		,"/reservation/showStatus.do"})
public class ReservationController extends HttpServlet {
	 public static String[][] seat = new String[3][5]; 
	private static final long serialVersionUID = 1L;
    ReservationService service = new ReservationServiceImpl();
    public ReservationController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        int floor =0;
        int row =0;
        String id ="";
        String msg = "";
		String path = request.getServletPath();
        switch (path) {
        case "/reservation/checkIn.do":
        	floor = Integer.parseInt(request.getParameter("floor"));
        	row=Integer.parseInt(request.getParameter("row"));
        	id = request.getParameter("id");
        	msg=service.checkIn(floor,row,id);
        	seat = service.checkIn();
        	request.setAttribute("seat",seat);
        	request.setAttribute("msg",msg);
        	
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/reservationForm.jsp");
           	dispatcher.forward(request, response);
            break; // 체크인
        case "/reservation/checkOut.do":
        	msg=service.checkOut(floor,row,id);
        	request.setAttribute("msg", msg);
        	   RequestDispatcher dispatcher1 = request.getRequestDispatcher("/views/model2/reservationForm.jsp");
           	dispatcher1.forward(request, response);
            break; // 체크아웃
            
        case "/reservation/showStatus.do":
        	System.out.println("2");
        	String[][]seat =service.showStatus();
        	
        	   RequestDispatcher dispatcher2 = request.getRequestDispatcher("/views/model2/reservation.jsp");
           	dispatcher2.forward(request, response);
        	break;
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

