package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Flight_Ticket_Booking_Project.dao.UserFlightBookingDao;
import com.jsp.Flight_Ticket_Booking_Project.dto.UserBookFlight;
@WebServlet("/userBookFlight")
public class UserBookFlightController extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   UserFlightBookingDao userFlightBookingDao=new UserFlightBookingDao();
	   
	   UserBookFlight userBookFlight=new UserBookFlight();
	   
	   long pnr=(long) Math.floor(Math.random()*9000000000L+1000000000L);
	   
	   userBookFlight.setPnr(pnr);
	   userBookFlight.setName(req.getParameter("pName"));
	   userBookFlight.setEmail(req.getParameter("pEmail"));
	   userBookFlight.setPhone(Long.parseLong(req.getParameter("pPhone")));
	   userBookFlight.setAge(Integer.parseInt(req.getParameter("pAge")));
	   userBookFlight.setGender(req.getParameter("gender"));
	   userBookFlight.setPrice(Double.parseDouble(req.getParameter("price")));
	   userBookFlight.setFlightNumber(Integer.parseInt(req.getParameter("number")));
	   
	   UserBookFlight userBookFlight2=userFlightBookingDao.saveBookingDetails(userBookFlight);
	   
	   if(userBookFlight2!=null)
	   {
		   req.setAttribute("userBookFlight", "Your Flight Ticket is Booked Thank you!!");
		   RequestDispatcher dispatcher=req.getRequestDispatcher("user-book-flight.jsp");
		   dispatcher.forward(req, resp);
	   }
}
}
