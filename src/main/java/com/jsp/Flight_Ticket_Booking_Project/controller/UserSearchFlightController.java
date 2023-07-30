package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/userhome")
public class UserSearchFlightController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("user-search-flight.jsp");
		dispatcher.forward(req, resp);
	}
}