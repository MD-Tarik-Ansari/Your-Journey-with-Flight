package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adminlogout")
public class AdminLogoutController extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
	   HttpSession httpSession=req.getSession();
	   
	   if(httpSession.getAttribute("admin")!=null)
	   {
		   httpSession.invalidate();
		   RequestDispatcher dispatcher=req.getRequestDispatcher("admin.jsp");
		   dispatcher.forward(req, resp);
	   }
}
}
