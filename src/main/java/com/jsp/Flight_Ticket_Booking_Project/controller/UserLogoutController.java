package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/userlogout")
public class UserLogoutController extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   HttpSession session=req.getSession();
	   
	   if(session.getAttribute("user")!=null)
	   {
		   session.invalidate();
		   RequestDispatcher dispatcher=req.getRequestDispatcher("user.jsp");
		   dispatcher.forward(req, resp);
	   }
}
}
