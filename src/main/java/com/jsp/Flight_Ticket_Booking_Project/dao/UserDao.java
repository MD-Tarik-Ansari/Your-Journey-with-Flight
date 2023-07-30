package com.jsp.Flight_Ticket_Booking_Project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.Flight_Ticket_Booking_Project.connection.FlightConnection;
import com.jsp.Flight_Ticket_Booking_Project.dto.AdminAddFlight;
import com.jsp.Flight_Ticket_Booking_Project.dto.User;

public class UserDao 
{
    Connection connection=FlightConnection.getFlightConnection();
    
	/* 
	 * save user details
	 * 
	 */
    
    public User saveUser(User user)
    {
    	String insertQuery="insert into user(name,email,password) values(?,?,?)";
    	
    	try {
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			
			preparedStatement.execute();
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    /* 
	 * getAll user
	 * 
	 */
    
    public List<User> getAllUser()
    {
    	String displayQuery="select * from user";
    	
    	List<User> users=new ArrayList<User>();
    	
    	try {
			PreparedStatement preparedStatement=connection.prepareStatement(displayQuery);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				User user=new User();
				
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    /* 
	 * get user by email for login
	 * 
	 */
    
    public User getUserByEmail(String userEmail)
    {
    	List<User> users=getAllUser();
    	
    	for (User user : users) 
    	{
		   if(userEmail.equals(user.getEmail()))
		   {
			   return user;
		   }
		}
    	return null;
    }
    
    /* 
	 * get by source for search the flight
	 * 
	 */
    
    public AdminAddFlight getBySource(String source)
    {
    	AdminAddFlightDao dao=new AdminAddFlightDao();
    	
    	List<AdminAddFlight> addFlights=dao.getAllFlightDetails();
    	
    	for (AdminAddFlight adminAddFlight : addFlights) 
    	{
		    if(source.equalsIgnoreCase(adminAddFlight.getFlightSource()))
		    {
		    	return adminAddFlight;
		    }
		}
    	return null;
    }
}
