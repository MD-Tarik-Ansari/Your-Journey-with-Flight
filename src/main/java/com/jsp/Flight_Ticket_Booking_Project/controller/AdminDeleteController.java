package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Flight_Ticket_Booking_Project.service.AdminAddFlightService;
@WebServlet(value = "/deleteFlight")
public class AdminDeleteController extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	int flightNumber=Integer.parseInt(req.getParameter("flightNumber"));
    	
    	AdminAddFlightService service=new AdminAddFlightService();
    	
    	int admin=service.adminDeleteFlight(flightNumber);
    	
    	if(admin!=0)
    	{
    		req.getRequestDispatcher("admin-flight-details.jsp").forward(req, resp);
    	}
    	else {
			req.getRequestDispatcher("admin-flight-details.jsp").forward(req, resp);
		}
    }
}
