package com.jsp.Flight_Ticket_Booking_Project.service;

import java.util.List;

import com.jsp.Flight_Ticket_Booking_Project.dao.AdminDao;
import com.jsp.Flight_Ticket_Booking_Project.dto.Admin;

public class AdminService 
{
   AdminDao dao=new AdminDao();
   
   public List<Admin> getAllAdmin()
   {
	   return dao.getAllAdmin();
   }
   
   /*
	 * get data by email
	 */
  
    public Admin getAdminByEmail(String adminEmail)
    {
    	return dao.getAdminByEmail(adminEmail);
    }
}
