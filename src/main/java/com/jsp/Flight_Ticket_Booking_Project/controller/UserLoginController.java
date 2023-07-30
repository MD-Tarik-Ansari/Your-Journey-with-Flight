package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.Flight_Ticket_Booking_Project.dto.User;
import com.jsp.Flight_Ticket_Booking_Project.service.UserService;
@WebServlet("/userlogin")
public class UserLoginController extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   String email=req.getParameter("user");
	   String password=req.getParameter("pass");
	   
	   UserService service=new UserService();
	   
	   User user=service.getUserByEmail(email);
	   
	   HttpSession session=req.getSession();
	   if(user!=null)
	   {
		   if(user.getPassword().equals(password))
		   {
			   session.setAttribute("user", user.getEmail());
			   RequestDispatcher dispatcher=req.getRequestDispatcher("user-home.jsp");
			   dispatcher.forward(req, resp);
		   }
		   else {
			   req.setAttribute("userpassword", "Password is Invalid");
			   RequestDispatcher dispatcher=req.getRequestDispatcher("user.jsp");
			   dispatcher.forward(req, resp);
		}
	   }
	   else {
		   req.setAttribute("useremail", "Email is Invalid");
		   RequestDispatcher dispatcher=req.getRequestDispatcher("user.jsp");
		   dispatcher.forward(req, resp);
	}
}
}
