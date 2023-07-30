package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/updateFlight")
public class AdminOpenUpdatePageController extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   RequestDispatcher dispatcher=req.getRequestDispatcher("admin-update-flight.jsp");
	   dispatcher.forward(req, resp);
}
}
