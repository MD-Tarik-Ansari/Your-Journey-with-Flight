package com.jsp.Flight_Ticket_Booking_Project.service;

import java.util.List;

import com.jsp.Flight_Ticket_Booking_Project.dao.AdminAddFlightDao;
import com.jsp.Flight_Ticket_Booking_Project.dto.AdminAddFlight;

public class AdminAddFlightService 
{
	AdminAddFlightDao dao=new AdminAddFlightDao();
	/* 
	 *   Add Flight
	 */
   
   public AdminAddFlight addAdminFlight(AdminAddFlight addFlight)
   {
	   return dao.addAdminFlight(addFlight);
   }
   
   /* 
	 *   get all flight details 
	 */
  
  public List<AdminAddFlight> getAllFlightDetails()
  {
	  return dao.getAllFlightDetails();
  }
  
  /* 
	 *   admin delete flight
	 */
 
 public int adminDeleteFlight(int flightNumber)
 {
	 return dao.adminDeleteFlight(flightNumber);
 }
   
 /* 
	 *   admin update flight
	 */

   public int adminUpdateFlight(int flightNumber,AdminAddFlight adminAddFlight)
   {
	   return dao.adminUpdateFlight(flightNumber, adminAddFlight);
   }
   
   /* 
 	 *   get flight by source to destination
 	 */
   
   public List<AdminAddFlight> getFlightBySourceToDestination(String source,String destination)
   {
	   return dao.getFlightBySourceToDestination(source, destination);
   }
}
