package com.jsp.Flight_Ticket_Booking_Project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.Flight_Ticket_Booking_Project.connection.FlightConnection;
import com.jsp.Flight_Ticket_Booking_Project.dto.UserBookFlight;

public class UserFlightBookingDao 
{
   Connection connection=FlightConnection.getFlightConnection();
   
   public UserBookFlight saveBookingDetails(UserBookFlight userBookFlight)
   {
	   String insertQuery="Insert into flightbookingdetails values(?,?,?,?,?,?,?,?)";
	   
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setLong(1, userBookFlight.getPnr());
		preparedStatement.setString(2, userBookFlight.getName());
		preparedStatement.setString(3, userBookFlight.getEmail());
		preparedStatement.setLong(4, userBookFlight.getPhone());
		preparedStatement.setInt(5, userBookFlight.getAge());
		preparedStatement.setString(6, userBookFlight.getGender());
		preparedStatement.setDouble(7, userBookFlight.getPrice());
		preparedStatement.setInt(8, userBookFlight.getFlightNumber());
		
		preparedStatement.execute();
		return userBookFlight;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return null;
   }
}
