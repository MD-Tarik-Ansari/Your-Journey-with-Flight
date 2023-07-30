package com.jsp.Flight_Ticket_Booking_Project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.Flight_Ticket_Booking_Project.dto.Admin;
import com.jsp.Flight_Ticket_Booking_Project.service.AdminService;


@WebServlet("/loginadmin")
public class AdminLoginController extends HttpServlet
{
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	  String email=req.getParameter("email");
    	  String password=req.getParameter("pass");
    	  
    	  AdminService service=new AdminService();
    	  
    	  Admin admin=service.getAdminByEmail(email);
    	  
    	  HttpSession session=req.getSession();
    	  if(admin!=null)
    	  {
    		  if(admin.getPassword().equals(password))
    		  {
    			  session.setAttribute("admin", admin.getEmail());
    			  RequestDispatcher dispatcher=req.getRequestDispatcher("admin-add-flight.jsp");
    			  dispatcher.forward(req, resp);
    		  }
    		  else {
    			       req.setAttribute("invalidpassword", "Password is Invalid");
    			       RequestDispatcher dispatcher=req.getRequestDispatcher("admin.jsp");
    		    	    dispatcher.forward(req, resp);
			        }
    	  }
    	  else {
    		  req.setAttribute("invalidemail", "Email is Invalid");
    		  RequestDispatcher dispatcher=req.getRequestDispatcher("admin.jsp");
    		  dispatcher.forward(req, resp);
		}
    }
}
