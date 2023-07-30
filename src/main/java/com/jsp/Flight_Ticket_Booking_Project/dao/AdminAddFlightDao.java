package com.jsp.Flight_Ticket_Booking_Project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.Flight_Ticket_Booking_Project.connection.FlightConnection;
import com.jsp.Flight_Ticket_Booking_Project.dto.AdminAddFlight;

public class AdminAddFlightDao 
{
   Connection connection=FlightConnection.getFlightConnection();
   
	/* 
	 *   Add Flight
	 */
   
   public AdminAddFlight addAdminFlight(AdminAddFlight addFlight)
   {
	   String addFlightQuery="insert into adminaddflight values(?,?,?,?,?,?,?,?)";
	   
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement(addFlightQuery);
		
		preparedStatement.setInt(1, addFlight.getFlightNumber());
		preparedStatement.setString(2, addFlight.getFlightName());
		preparedStatement.setString(3, addFlight.getFlightSource());
		preparedStatement.setString(4, addFlight.getFlightDestination());
		preparedStatement.setTime(5, addFlight.getDepartureTime());
		preparedStatement.setTime(6, addFlight.getArrivalTime());
		preparedStatement.setDouble(7, addFlight.getFlightEconomicPrice());
		preparedStatement.setDouble(8, addFlight.getFlightBusinessPrice());
		
		preparedStatement.execute();
		return addFlight;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return null;
   }
   
   /* 
	 *   get all flight details 
	 */
   
   public List<AdminAddFlight> getAllFlightDetails()
   {
	   String displayQuery="Select * from adminaddflight";
	   
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement(displayQuery);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		List<AdminAddFlight> addFlights=new ArrayList<AdminAddFlight>();
		
		while(resultSet.next())
		{
			AdminAddFlight addFlight=new AdminAddFlight();
			
			addFlight.setFlightNumber(resultSet.getInt("flightnumber"));
			addFlight.setFlightName(resultSet.getString("flightname"));
			addFlight.setFlightSource(resultSet.getString("flightsource"));
			addFlight.setFlightDestination(resultSet.getString("flightdestination"));
			addFlight.setDepartureTime(resultSet.getTime("flightdeparture"));
			addFlight.setArrivalTime(resultSet.getTime("flightarrival"));
			addFlight.setFlightEconomicPrice(resultSet.getDouble("economicprice"));
			addFlight.setFlightBusinessPrice(resultSet.getDouble("businessprice"));
			
			addFlights.add(addFlight);
		}
		return addFlights;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return null;
   }
   
   /* 
	 *   admin delete flight
	 */
   
   public int adminDeleteFlight(int flightNumber)
   {
	   String deleteQuery="delete from adminaddflight where flightnumber=?";
	   
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
		preparedStatement.setInt(1, flightNumber);
		
		return preparedStatement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return 0;
   }
   
   /* 
	 *   admin update flight
	 */
  
     public int adminUpdateFlight(int flightNumber,AdminAddFlight adminAddFlight)
     {
    	 String updateQuery="Update adminaddflight set "
    	 		+ "flightname=?,flightsource=?,flightdestination=?,"
    	 		+ "flightdeparture=?,flightarrival=?,economicprice=?,"
    	 		+ "businessprice=? where flightnumber=?";
    	 
    	 try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, adminAddFlight.getFlightName());
			preparedStatement.setString(2, adminAddFlight.getFlightSource());
			preparedStatement.setString(3, adminAddFlight.getFlightDestination());
			preparedStatement.setTime(4, adminAddFlight.getDepartureTime());
			preparedStatement.setTime(5, adminAddFlight.getArrivalTime());
			preparedStatement.setDouble(6, adminAddFlight.getFlightEconomicPrice());
			preparedStatement.setDouble(7, adminAddFlight.getFlightBusinessPrice());
			preparedStatement.setInt(8, flightNumber);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return 0;
     }
     
     /* 
 	 *   get by flight number
 	 */
     
     public AdminAddFlight getByFlightNumber(int flightNumber)
     {
    	 String Query="select * from adminaddflight where flightnumber=?";
    	 
    	 try {
			PreparedStatement preparedStatement=connection.prepareStatement(Query);
			preparedStatement.setInt(1, flightNumber);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			AdminAddFlight addFlight=new AdminAddFlight();
			
			while(resultSet.next())
			{
				addFlight.setFlightNumber(resultSet.getInt("flightnumber"));
				addFlight.setFlightName(resultSet.getString("flightname"));
				addFlight.setFlightSource(resultSet.getString("flightsource"));
				addFlight.setFlightDestination(resultSet.getString("flightdestination"));
				addFlight.setDepartureTime(resultSet.getTime("flightdeparture"));
				addFlight.setArrivalTime(resultSet.getTime("flightarrival"));
				addFlight.setFlightEconomicPrice(resultSet.getDouble("economicprice"));
				addFlight.setFlightBusinessPrice(resultSet.getDouble("businessprice"));
			}
			return addFlight;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return null;
     }
     
     /* 
  	 *   get flight by source to destination
  	 */
     
     public List<AdminAddFlight> getFlightBySourceToDestination(String source,String destination)
     {
    	 List<AdminAddFlight> addFlights=getAllFlightDetails();
    	 List<AdminAddFlight> addFlights2=new ArrayList<AdminAddFlight>();
    	 
    	 for (AdminAddFlight adminAddFlight : addFlights) 
    	 {
		    	if(adminAddFlight.getFlightSource().equalsIgnoreCase(source) 
		    			&& adminAddFlight.getFlightDestination().equalsIgnoreCase(destination))
		    	{
		    		addFlights2.add(adminAddFlight);
		    	}
		}
    	 return addFlights2;
     }
}
