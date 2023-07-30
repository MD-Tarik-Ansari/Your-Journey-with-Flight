package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Flight_Ticket_Booking_Project.dto.User;
import com.jsp.Flight_Ticket_Booking_Project.service.UserService;
@WebServlet("/userRegister")
public class UserRegisterController extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=req.getParameter("username");
	String email=req.getParameter("useremail");
	String password=req.getParameter("userpassword");
	String cpassword=req.getParameter("confirmPassword");
	
	User user=new User();
	
	user.setName(name);
	user.setEmail(email);
	user.setPassword(password);
	
	UserService service=new UserService();
	if(password.equals(cpassword))
	{
		service.saveUser(user);
		RequestDispatcher dispatcher=req.getRequestDispatcher("user.jsp");
		dispatcher.forward(req, resp);
	}
	else {
		req.setAttribute("message", "Password-mismatch");
		RequestDispatcher dispatcher=req.getRequestDispatcher("user-register.jsp");
		dispatcher.forward(req, resp);
		
	}
}
}
